package com.smartx.tower.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartx.tower.model.IsolationMode;
import com.smartx.tower.model.NestedEverouteCluster;
import com.smartx.tower.model.NestedLabel;
import com.smartx.tower.model.NestedNetworkPolicyRule;
import com.smartx.tower.model.NestedVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IsolationPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaSmartxClientCodegen")

public class IsolationPolicy {
  public static final String SERIALIZED_NAME_EGRESS = "egress";
  @SerializedName(SERIALIZED_NAME_EGRESS)
  private List<NestedNetworkPolicyRule> egress = null;

  public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";
  @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
  private NestedEverouteCluster everouteCluster;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private List<NestedNetworkPolicyRule> ingress = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<NestedLabel> labels = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private IsolationMode mode;

  public static final String SERIALIZED_NAME_VM = "vm";
  @SerializedName(SERIALIZED_NAME_VM)
  private NestedVm vm;

  public IsolationPolicy() { 
  }

  public IsolationPolicy egress(List<NestedNetworkPolicyRule> egress) {
    
    this.egress = egress;
    return this;
  }

  public IsolationPolicy addEgressItem(NestedNetworkPolicyRule egressItem) {
    if (this.egress == null) {
      this.egress = new ArrayList<NestedNetworkPolicyRule>();
    }
    this.egress.add(egressItem);
    return this;
  }

   /**
   * Get egress
   * @return egress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNetworkPolicyRule> getEgress() {
    return egress;
  }


  public void setEgress(List<NestedNetworkPolicyRule> egress) {
    this.egress = egress;
  }


  public IsolationPolicy everouteCluster(NestedEverouteCluster everouteCluster) {
    
    this.everouteCluster = everouteCluster;
    return this;
  }

   /**
   * Get everouteCluster
   * @return everouteCluster
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedEverouteCluster getEverouteCluster() {
    return everouteCluster;
  }


  public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
    this.everouteCluster = everouteCluster;
  }


  public IsolationPolicy id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IsolationPolicy ingress(List<NestedNetworkPolicyRule> ingress) {
    
    this.ingress = ingress;
    return this;
  }

  public IsolationPolicy addIngressItem(NestedNetworkPolicyRule ingressItem) {
    if (this.ingress == null) {
      this.ingress = new ArrayList<NestedNetworkPolicyRule>();
    }
    this.ingress.add(ingressItem);
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedNetworkPolicyRule> getIngress() {
    return ingress;
  }


  public void setIngress(List<NestedNetworkPolicyRule> ingress) {
    this.ingress = ingress;
  }


  public IsolationPolicy labels(List<NestedLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public IsolationPolicy addLabelsItem(NestedLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<NestedLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NestedLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<NestedLabel> labels) {
    this.labels = labels;
  }


  public IsolationPolicy mode(IsolationMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IsolationMode getMode() {
    return mode;
  }


  public void setMode(IsolationMode mode) {
    this.mode = mode;
  }


  public IsolationPolicy vm(NestedVm vm) {
    
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NestedVm getVm() {
    return vm;
  }


  public void setVm(NestedVm vm) {
    this.vm = vm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsolationPolicy isolationPolicy = (IsolationPolicy) o;
    return Objects.equals(this.egress, isolationPolicy.egress) &&
        Objects.equals(this.everouteCluster, isolationPolicy.everouteCluster) &&
        Objects.equals(this.id, isolationPolicy.id) &&
        Objects.equals(this.ingress, isolationPolicy.ingress) &&
        Objects.equals(this.labels, isolationPolicy.labels) &&
        Objects.equals(this.mode, isolationPolicy.mode) &&
        Objects.equals(this.vm, isolationPolicy.vm);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(egress, everouteCluster, id, ingress, labels, mode, vm);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsolationPolicy {\n");
    sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
    sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

