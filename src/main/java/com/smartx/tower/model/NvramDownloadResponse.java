package com.smartx.tower.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvramDownloadResponse */
@javax.annotation.Generated(value = "JavaCloudTowerClientCodegen")
public class NvramDownloadResponse
        extends com.smartx.tower.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private NvramDownloadResponseData data;

    public static final String SERIALIZED_NAME_ERROR = "error";

    @SerializedName(SERIALIZED_NAME_ERROR)
    private Object error = null;

    public static final String SERIALIZED_NAME_EC = "ec";

    @SerializedName(SERIALIZED_NAME_EC)
    private String ec;

    public NvramDownloadResponse() {}

    public NvramDownloadResponse data(NvramDownloadResponseData data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvramDownloadResponseData getData() {
        return data;
    }

    public void setData(NvramDownloadResponseData data) {
        this.data = data;
    }

    public NvramDownloadResponse data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public NvramDownloadResponse data_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA);
        return this;
    }

    public void setData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA);
        }
    }

    public boolean getData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA);
    }

    public NvramDownloadResponse error(Object error) {

        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public NvramDownloadResponse error_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR);
        return this;
    }

    public NvramDownloadResponse error_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR);
        return this;
    }

    public void setError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR);
        }
    }

    public boolean getError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR);
    }

    public NvramDownloadResponse ec(String ec) {

        this.ec = ec;
        return this;
    }

    /**
     * Get ec
     *
     * @return ec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public NvramDownloadResponse ec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC);
        return this;
    }

    public NvramDownloadResponse ec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC);
        return this;
    }

    public void setEc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC);
        }
    }

    public boolean getEc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvramDownloadResponse nvramDownloadResponse = (NvramDownloadResponse) o;
        return Objects.equals(this.data, nvramDownloadResponse.data)
                && Objects.equals(this.error, nvramDownloadResponse.error)
                && Objects.equals(this.ec, nvramDownloadResponse.ec);
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
        return Objects.hash(data, error, ec);
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
        sb.append("class NvramDownloadResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    ec: ").append(toIndentedString(ec)).append("\n");
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
