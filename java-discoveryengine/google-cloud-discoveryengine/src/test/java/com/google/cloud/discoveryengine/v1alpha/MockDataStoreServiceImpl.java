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

package com.google.cloud.discoveryengine.v1alpha;

import com.google.api.core.BetaApi;
import com.google.cloud.discoveryengine.v1alpha.DataStoreServiceGrpc.DataStoreServiceImplBase;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockDataStoreServiceImpl extends DataStoreServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockDataStoreServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createDataStore(
      CreateDataStoreRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateDataStore, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getDataStore(
      GetDataStoreRequest request, StreamObserver<DataStore> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DataStore) {
      requests.add(request);
      responseObserver.onNext(((DataStore) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetDataStore, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DataStore.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listDataStores(
      ListDataStoresRequest request, StreamObserver<ListDataStoresResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListDataStoresResponse) {
      requests.add(request);
      responseObserver.onNext(((ListDataStoresResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListDataStores, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListDataStoresResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteDataStore(
      DeleteDataStoreRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteDataStore, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateDataStore(
      UpdateDataStoreRequest request, StreamObserver<DataStore> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DataStore) {
      requests.add(request);
      responseObserver.onNext(((DataStore) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateDataStore, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DataStore.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getDocumentProcessingConfig(
      GetDocumentProcessingConfigRequest request,
      StreamObserver<DocumentProcessingConfig> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DocumentProcessingConfig) {
      requests.add(request);
      responseObserver.onNext(((DocumentProcessingConfig) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetDocumentProcessingConfig, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DocumentProcessingConfig.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateDocumentProcessingConfig(
      UpdateDocumentProcessingConfigRequest request,
      StreamObserver<DocumentProcessingConfig> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DocumentProcessingConfig) {
      requests.add(request);
      responseObserver.onNext(((DocumentProcessingConfig) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateDocumentProcessingConfig, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DocumentProcessingConfig.class.getName(),
                  Exception.class.getName())));
    }
  }
}
