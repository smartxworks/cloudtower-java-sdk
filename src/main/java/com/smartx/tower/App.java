package com.smartx.tower;

import com.google.gson.Gson;
import com.smartx.tower.model.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws ApiException, IOException {
        test();
    }

    public static void test() throws ApiException, IOException {
        VmUpdateHostOptionsParams params = new VmUpdateHostOptionsParams();
        VmUpdateHostOptionsParamsData data = new VmUpdateHostOptionsParamsData();
        data.hostname(null).presentDnsServers();
        params.setData(data);
        Gson gson = new JSON().getGson();
        System.out.println(gson.toJson(data));
        System.out.println(gson.toJson(params));
        VmUpdateHostOptionsParamsData data2 = gson.fromJson("{\"dns_servers\":[\"114.114.114.114\"]}",
                VmUpdateHostOptionsParamsData.class);
        VmUpdateHostOptionsParams params2 = gson.fromJson("{\"data\":{\"dns_servers\":[\"114.114.114.114\"]}}",
                VmUpdateHostOptionsParams.class);
        System.out.println(data2);
        System.out.println(params2);
    }
}