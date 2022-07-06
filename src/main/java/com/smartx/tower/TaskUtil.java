package com.smartx.tower;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.smartx.tower.api.TaskApi;
import com.smartx.tower.model.GetTasksRequestBody;
import com.smartx.tower.model.Task;
import com.smartx.tower.model.TaskStatus;
import com.smartx.tower.model.TaskWhereInput;

public class TaskUtil {
  public static void WaitTask(String id, ApiClient apiClient) throws ApiException {
    WaitTask(id, apiClient, 5, 300);
  }

  public static void WaitTask(String id, ApiClient apiClient, int interval) throws ApiException {
    WaitTask(id, apiClient, interval, 300);
  }

  public static void WaitTask(String id, ApiClient apiClient, int interval, int timeout) throws ApiException {
    TaskApi api = new TaskApi(apiClient);
    long start = System.currentTimeMillis();
    GetTasksRequestBody requestBody = new GetTasksRequestBody().where(new TaskWhereInput().id(id));
    Task task = api.getTasks(requestBody).get(0);
    while (task.getStatus() == TaskStatus.EXECUTING || task.getStatus() == TaskStatus.PENDING) {
      try {
        Thread.sleep(1000 * interval);
      } catch (InterruptedException e) {
        throw new ApiException(500, e.getMessage());
      }
      if (System.currentTimeMillis() - start > timeout * 1000) {
        throw new ApiException(408, String.format("Wait task %s timeout.", id));
      }
      task = api.getTasks(new GetTasksRequestBody().where(new TaskWhereInput().id(id))).get(0);
    }
    if (task.getStatus() == TaskStatus.FAILED) {
      throw new ApiException(500, String.format("Task %s failed.", id));
    }
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient) throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, false, 5, 300);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient) throws ApiException {
    WaitTasks(ids, apiClient, false, 5, 300);
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient, int interval) throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, false, interval, 300);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient, int interval) throws ApiException {
    WaitTasks(ids, apiClient, false, interval, 300);
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient, int interval, int timeout) throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, false, interval, timeout);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient, int interval, int timeout) throws ApiException {
    WaitTasks(ids, apiClient, false, interval, timeout);
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient, boolean exitOnError, int interval)
      throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, exitOnError, interval, 300);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient, boolean exitOnError, int interval)
      throws ApiException {
    WaitTasks(ids, apiClient, exitOnError, interval, 300);
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient, boolean exitOnError)
      throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, exitOnError, 5, 300);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient, boolean exitOnError) throws ApiException {
    WaitTasks(ids, apiClient, exitOnError, 5, 300);
  }

  public static void WaitTasks(String[] ids, ApiClient apiClient, boolean exitOnError, int interval, int timeout)
      throws ApiException {
    WaitTasks(Arrays.asList(ids), apiClient, exitOnError, interval, timeout);
  }

  public static void WaitTasks(List<String> ids, ApiClient apiClient, boolean exitOnError, int interval, int timeout)
      throws ApiException {
    TaskApi api = new TaskApi(apiClient);
    long start = System.currentTimeMillis();
    List<String> errorTasks = new ArrayList<>();
    while (ids.size() > 0) {
      try {
        Thread.sleep(1000 * interval);
      } catch (InterruptedException e) {
        throw new ApiException(500, e.getMessage());
      }
      if (System.currentTimeMillis() - start > timeout * 1000) {
        throw new ApiException(408, String.format("Wait task %s timeout.", ids.toString()));
      }
      ids = api.getTasks(new GetTasksRequestBody().where(new TaskWhereInput().idIn(ids))).stream()
          .filter(t -> {
            if (t.getStatus() == TaskStatus.SUCCESSED) {
              return false;
            } else if (t.getStatus() == TaskStatus.FAILED) {
              errorTasks.add(t.getId());
              return false;
            } else {
              return true;
            }
          }).map(t -> t.getId()).collect(Collectors.toList());
      if (exitOnError && errorTasks.size() > 0) {
        throw new ApiException(500, String.format("Task %s failed.", errorTasks.toString()));
      }
    }
    if (errorTasks.size() > 0) {
      throw new ApiException(500, String.format("Tasks %s failed.", errorTasks.toString()));
    }
  }
}
