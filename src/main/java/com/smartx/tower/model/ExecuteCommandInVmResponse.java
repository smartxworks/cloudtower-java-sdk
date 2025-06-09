package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ExecuteCommandInVmResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")
public class ExecuteCommandInVmResponse
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ERR_TRUNCATED = "err_truncated";

    @SerializedName(SERIALIZED_NAME_ERR_TRUNCATED)
    private Boolean errTruncated;

    public static final String SERIALIZED_NAME_OUT_TRUNCATED = "out_truncated";

    @SerializedName(SERIALIZED_NAME_OUT_TRUNCATED)
    private Boolean outTruncated;

    public static final String SERIALIZED_NAME_SIGNAL = "signal";

    @SerializedName(SERIALIZED_NAME_SIGNAL)
    private Double signal;

    public static final String SERIALIZED_NAME_STDERR = "stderr";

    @SerializedName(SERIALIZED_NAME_STDERR)
    private String stderr;

    public static final String SERIALIZED_NAME_STDOUT = "stdout";

    @SerializedName(SERIALIZED_NAME_STDOUT)
    private String stdout;

    public static final String SERIALIZED_NAME_RETURN_CODE = "return_code";

    @SerializedName(SERIALIZED_NAME_RETURN_CODE)
    private Double returnCode;

    public static final String SERIALIZED_NAME_VM_ID = "vm_id";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public ExecuteCommandInVmResponse() {}

    public ExecuteCommandInVmResponse errTruncated(Boolean errTruncated) {

        this.errTruncated = errTruncated;
        return this;
    }

    /**
     * Get errTruncated
     *
     * @return errTruncated
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getErrTruncated() {
        return errTruncated;
    }

    public void setErrTruncated(Boolean errTruncated) {
        this.errTruncated = errTruncated;
    }

    public ExecuteCommandInVmResponse errTruncated_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERR_TRUNCATED);
        return this;
    }

    public ExecuteCommandInVmResponse errTruncated_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERR_TRUNCATED);
        return this;
    }

    public void setErrTruncated_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERR_TRUNCATED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERR_TRUNCATED);
        }
    }

    public boolean getErrTruncated_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERR_TRUNCATED);
    }

    public ExecuteCommandInVmResponse outTruncated(Boolean outTruncated) {

        this.outTruncated = outTruncated;
        return this;
    }

    /**
     * Get outTruncated
     *
     * @return outTruncated
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getOutTruncated() {
        return outTruncated;
    }

    public void setOutTruncated(Boolean outTruncated) {
        this.outTruncated = outTruncated;
    }

    public ExecuteCommandInVmResponse outTruncated_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OUT_TRUNCATED);
        return this;
    }

    public ExecuteCommandInVmResponse outTruncated_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OUT_TRUNCATED);
        return this;
    }

    public void setOutTruncated_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OUT_TRUNCATED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OUT_TRUNCATED);
        }
    }

    public boolean getOutTruncated_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OUT_TRUNCATED);
    }

    public ExecuteCommandInVmResponse signal(Double signal) {

        this.signal = signal;
        return this;
    }

    /**
     * Get signal
     *
     * @return signal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getSignal() {
        return signal;
    }

    public void setSignal(Double signal) {
        this.signal = signal;
    }

    public ExecuteCommandInVmResponse signal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIGNAL);
        return this;
    }

    public ExecuteCommandInVmResponse signal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIGNAL);
        return this;
    }

    public void setSignal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIGNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIGNAL);
        }
    }

    public boolean getSignal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIGNAL);
    }

    public ExecuteCommandInVmResponse stderr(String stderr) {

        this.stderr = stderr;
        return this;
    }

    /**
     * Get stderr
     *
     * @return stderr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStderr() {
        return stderr;
    }

    public void setStderr(String stderr) {
        this.stderr = stderr;
    }

    public ExecuteCommandInVmResponse stderr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STDERR);
        return this;
    }

    public ExecuteCommandInVmResponse stderr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STDERR);
        return this;
    }

    public void setStderr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STDERR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STDERR);
        }
    }

    public boolean getStderr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STDERR);
    }

    public ExecuteCommandInVmResponse stdout(String stdout) {

        this.stdout = stdout;
        return this;
    }

    /**
     * Get stdout
     *
     * @return stdout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStdout() {
        return stdout;
    }

    public void setStdout(String stdout) {
        this.stdout = stdout;
    }

    public ExecuteCommandInVmResponse stdout_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STDOUT);
        return this;
    }

    public ExecuteCommandInVmResponse stdout_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STDOUT);
        return this;
    }

    public void setStdout_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STDOUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STDOUT);
        }
    }

    public boolean getStdout_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STDOUT);
    }

    public ExecuteCommandInVmResponse returnCode(Double returnCode) {

        this.returnCode = returnCode;
        return this;
    }

    /**
     * Get returnCode
     *
     * @return returnCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Double returnCode) {
        this.returnCode = returnCode;
    }

    public ExecuteCommandInVmResponse returnCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETURN_CODE);
        return this;
    }

    public ExecuteCommandInVmResponse returnCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETURN_CODE);
        return this;
    }

    public void setReturnCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETURN_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETURN_CODE);
        }
    }

    public boolean getReturnCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETURN_CODE);
    }

    public ExecuteCommandInVmResponse vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * Get vmId
     *
     * @return vmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public ExecuteCommandInVmResponse vmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public ExecuteCommandInVmResponse vmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public void setVmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        }
    }

    public boolean getVmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteCommandInVmResponse executeCommandInVmResponse = (ExecuteCommandInVmResponse) o;
        return Objects.equals(this.errTruncated, executeCommandInVmResponse.errTruncated)
                && Objects.equals(this.outTruncated, executeCommandInVmResponse.outTruncated)
                && Objects.equals(this.signal, executeCommandInVmResponse.signal)
                && Objects.equals(this.stderr, executeCommandInVmResponse.stderr)
                && Objects.equals(this.stdout, executeCommandInVmResponse.stdout)
                && Objects.equals(this.returnCode, executeCommandInVmResponse.returnCode)
                && Objects.equals(this.vmId, executeCommandInVmResponse.vmId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(errTruncated, outTruncated, signal, stderr, stdout, returnCode, vmId);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteCommandInVmResponse {\n");
        sb.append("    errTruncated: ").append(toIndentedString(errTruncated)).append("\n");
        sb.append("    outTruncated: ").append(toIndentedString(outTruncated)).append("\n");
        sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
        sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
        sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
