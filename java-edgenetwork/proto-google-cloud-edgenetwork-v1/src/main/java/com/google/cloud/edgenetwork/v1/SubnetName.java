/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.edgenetwork.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class SubnetName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_ZONE_SUBNET =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/zones/{zone}/subnets/{subnet}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String zone;
  private final String subnet;

  @Deprecated
  protected SubnetName() {
    project = null;
    location = null;
    zone = null;
    subnet = null;
  }

  private SubnetName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    zone = Preconditions.checkNotNull(builder.getZone());
    subnet = Preconditions.checkNotNull(builder.getSubnet());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getZone() {
    return zone;
  }

  public String getSubnet() {
    return subnet;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static SubnetName of(String project, String location, String zone, String subnet) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setZone(zone)
        .setSubnet(subnet)
        .build();
  }

  public static String format(String project, String location, String zone, String subnet) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setZone(zone)
        .setSubnet(subnet)
        .build()
        .toString();
  }

  public static SubnetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_ZONE_SUBNET.validatedMatch(
            formattedString, "SubnetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("zone"),
        matchMap.get("subnet"));
  }

  public static List<SubnetName> parseList(List<String> formattedStrings) {
    List<SubnetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SubnetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SubnetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_ZONE_SUBNET.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (zone != null) {
            fieldMapBuilder.put("zone", zone);
          }
          if (subnet != null) {
            fieldMapBuilder.put("subnet", subnet);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_ZONE_SUBNET.instantiate(
        "project", project, "location", location, "zone", zone, "subnet", subnet);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      SubnetName that = ((SubnetName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.zone, that.zone)
          && Objects.equals(this.subnet, that.subnet);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(zone);
    h *= 1000003;
    h ^= Objects.hashCode(subnet);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/zones/{zone}/subnets/{subnet}. */
  public static class Builder {
    private String project;
    private String location;
    private String zone;
    private String subnet;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getZone() {
      return zone;
    }

    public String getSubnet() {
      return subnet;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setZone(String zone) {
      this.zone = zone;
      return this;
    }

    public Builder setSubnet(String subnet) {
      this.subnet = subnet;
      return this;
    }

    private Builder(SubnetName subnetName) {
      this.project = subnetName.project;
      this.location = subnetName.location;
      this.zone = subnetName.zone;
      this.subnet = subnetName.subnet;
    }

    public SubnetName build() {
      return new SubnetName(this);
    }
  }
}
