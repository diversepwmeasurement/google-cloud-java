/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.EntityTypesClient.ListEntityTypesPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.EntityTypesClient.ListLocationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.CreateEntityTypeRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteEntityTypeRequest;
import com.google.cloud.dialogflow.cx.v3beta1.EntityType;
import com.google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesMetadata;
import com.google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesResponse;
import com.google.cloud.dialogflow.cx.v3beta1.GetEntityTypeRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesMetadata;
import com.google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ImportEntityTypesResponse;
import com.google.cloud.dialogflow.cx.v3beta1.ListEntityTypesRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListEntityTypesResponse;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateEntityTypeRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the EntityTypes service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class EntityTypesStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<GetEntityTypeRequest, EntityType> getEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: getEntityTypeCallable()");
  }

  public UnaryCallable<CreateEntityTypeRequest, EntityType> createEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: createEntityTypeCallable()");
  }

  public UnaryCallable<UpdateEntityTypeRequest, EntityType> updateEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateEntityTypeCallable()");
  }

  public UnaryCallable<DeleteEntityTypeRequest, Empty> deleteEntityTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteEntityTypeCallable()");
  }

  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesPagedResponse>
      listEntityTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listEntityTypesPagedCallable()");
  }

  public UnaryCallable<ListEntityTypesRequest, ListEntityTypesResponse> listEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listEntityTypesCallable()");
  }

  public OperationCallable<
          ExportEntityTypesRequest, ExportEntityTypesResponse, ExportEntityTypesMetadata>
      exportEntityTypesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: exportEntityTypesOperationCallable()");
  }

  public UnaryCallable<ExportEntityTypesRequest, Operation> exportEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: exportEntityTypesCallable()");
  }

  public OperationCallable<
          ImportEntityTypesRequest, ImportEntityTypesResponse, ImportEntityTypesMetadata>
      importEntityTypesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importEntityTypesOperationCallable()");
  }

  public UnaryCallable<ImportEntityTypesRequest, Operation> importEntityTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: importEntityTypesCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
