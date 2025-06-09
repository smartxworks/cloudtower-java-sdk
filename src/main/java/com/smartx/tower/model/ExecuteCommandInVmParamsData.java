package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ExecuteCommandInVmParamsData */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ExecuteCommandInVmParamsData
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TIMEOUT = "timeout";

    @SerializedName(SERIALIZED_NAME_TIMEOUT)
    private Double timeout;

    public static final String SERIALIZED_NAME_CAPTURE_OUTPUT = "capture_output";

    @SerializedName(SERIALIZED_NAME_CAPTURE_OUTPUT)
    private Boolean captureOutput;

    public static final String SERIALIZED_NAME_ENVS = "envs";

    @SerializedName(SERIALIZED_NAME_ENVS)
    private List<String> envs = null;

    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private List<String> args = null;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public ExecuteCommandInVmParamsData() {}

    public ExecuteCommandInVmParamsData timeout(Double timeout) {

        this.timeout = timeout;
        return this;
    }

    /**
     * Get timeout
     *
     * @return timeout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getTimeout() {
        return timeout;
    }

    public void setTimeout(Double timeout) {
        this.timeout = timeout;
    }

    public ExecuteCommandInVmParamsData timeout_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIMEOUT);
        return this;
    }

    public ExecuteCommandInVmParamsData timeout_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIMEOUT);
        return this;
    }

    public void setTimeout_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIMEOUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIMEOUT);
        }
    }

    public boolean getTimeout_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIMEOUT);
    }

    public ExecuteCommandInVmParamsData captureOutput(Boolean captureOutput) {

        this.captureOutput = captureOutput;
        return this;
    }

    /**
     * Get captureOutput
     *
     * @return captureOutput
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCaptureOutput() {
        return captureOutput;
    }

    public void setCaptureOutput(Boolean captureOutput) {
        this.captureOutput = captureOutput;
    }

    public ExecuteCommandInVmParamsData captureOutput_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPTURE_OUTPUT);
        return this;
    }

    public ExecuteCommandInVmParamsData captureOutput_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPTURE_OUTPUT);
        return this;
    }

    public void setCaptureOutput_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPTURE_OUTPUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPTURE_OUTPUT);
        }
    }

    public boolean getCaptureOutput_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPTURE_OUTPUT);
    }

    public ExecuteCommandInVmParamsData envs(List<String> envs) {

        this.envs = envs;
        return this;
    }

    public ExecuteCommandInVmParamsData addEnvsItem(String envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<String>();
        }
        this.envs.add(envsItem);
        return this;
    }

    /**
     * Get envs
     *
     * @return envs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEnvs() {
        return envs;
    }

    public void setEnvs(List<String> envs) {
        this.envs = envs;
    }

    public ExecuteCommandInVmParamsData envs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENVS);
        return this;
    }

    public ExecuteCommandInVmParamsData envs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENVS);
        return this;
    }

    public void setEnvs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENVS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENVS);
        }
    }

    public boolean getEnvs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENVS);
    }

    public ExecuteCommandInVmParamsData args(List<String> args) {

        this.args = args;
        return this;
    }

    public ExecuteCommandInVmParamsData addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<String>();
        }
        this.args.add(argsItem);
        return this;
    }

    /**
     * Get args
     *
     * @return args
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public ExecuteCommandInVmParamsData args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public ExecuteCommandInVmParamsData args_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        return this;
    }

    public void setArgs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        }
    }

    public boolean getArgs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARGS);
    }

    public ExecuteCommandInVmParamsData path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ExecuteCommandInVmParamsData path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public ExecuteCommandInVmParamsData path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteCommandInVmParamsData executeCommandInVmParamsData =
                (ExecuteCommandInVmParamsData) o;
        return Objects.equals(this.timeout, executeCommandInVmParamsData.timeout)
                && Objects.equals(this.captureOutput, executeCommandInVmParamsData.captureOutput)
                && Objects.equals(this.envs, executeCommandInVmParamsData.envs)
                && Objects.equals(this.args, executeCommandInVmParamsData.args)
                && Objects.equals(this.path, executeCommandInVmParamsData.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeout, captureOutput, envs, args, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteCommandInVmParamsData {\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    captureOutput: ").append(toIndentedString(captureOutput)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
