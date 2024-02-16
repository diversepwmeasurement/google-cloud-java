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

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.ExamplesClient.ListExamplesPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.ExamplesClient.ListLocationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.CreateExampleRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteExampleRequest;
import com.google.cloud.dialogflow.cx.v3beta1.Example;
import com.google.cloud.dialogflow.cx.v3beta1.GetExampleRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListExamplesRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListExamplesResponse;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateExampleRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Examples service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class ExamplesStub implements BackgroundResource {

  public UnaryCallable<CreateExampleRequest, Example> createExampleCallable() {
    throw new UnsupportedOperationException("Not implemented: createExampleCallable()");
  }

  public UnaryCallable<DeleteExampleRequest, Empty> deleteExampleCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteExampleCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesPagedResponse> listExamplesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesPagedCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesResponse> listExamplesCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesCallable()");
  }

  public UnaryCallable<GetExampleRequest, Example> getExampleCallable() {
    throw new UnsupportedOperationException("Not implemented: getExampleCallable()");
  }

  public UnaryCallable<UpdateExampleRequest, Example> updateExampleCallable() {
    throw new UnsupportedOperationException("Not implemented: updateExampleCallable()");
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
