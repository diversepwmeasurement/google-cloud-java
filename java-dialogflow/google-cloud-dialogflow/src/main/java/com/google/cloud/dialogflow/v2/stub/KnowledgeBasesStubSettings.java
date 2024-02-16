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

package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.KnowledgeBasesClient.ListKnowledgeBasesPagedResponse;
import static com.google.cloud.dialogflow.v2.KnowledgeBasesClient.ListLocationsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.CreateKnowledgeBaseRequest;
import com.google.cloud.dialogflow.v2.DeleteKnowledgeBaseRequest;
import com.google.cloud.dialogflow.v2.GetKnowledgeBaseRequest;
import com.google.cloud.dialogflow.v2.KnowledgeBase;
import com.google.cloud.dialogflow.v2.ListKnowledgeBasesRequest;
import com.google.cloud.dialogflow.v2.ListKnowledgeBasesResponse;
import com.google.cloud.dialogflow.v2.UpdateKnowledgeBaseRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link KnowledgeBasesStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getKnowledgeBase to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * KnowledgeBasesStubSettings.Builder knowledgeBasesSettingsBuilder =
 *     KnowledgeBasesStubSettings.newBuilder();
 * knowledgeBasesSettingsBuilder
 *     .getKnowledgeBaseSettings()
 *     .setRetrySettings(
 *         knowledgeBasesSettingsBuilder
 *             .getKnowledgeBaseSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * KnowledgeBasesStubSettings knowledgeBasesSettings = knowledgeBasesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class KnowledgeBasesStubSettings extends StubSettings<KnowledgeBasesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/dialogflow")
          .build();

  private final PagedCallSettings<
          ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, ListKnowledgeBasesPagedResponse>
      listKnowledgeBasesSettings;
  private final UnaryCallSettings<GetKnowledgeBaseRequest, KnowledgeBase> getKnowledgeBaseSettings;
  private final UnaryCallSettings<CreateKnowledgeBaseRequest, KnowledgeBase>
      createKnowledgeBaseSettings;
  private final UnaryCallSettings<DeleteKnowledgeBaseRequest, Empty> deleteKnowledgeBaseSettings;
  private final UnaryCallSettings<UpdateKnowledgeBaseRequest, KnowledgeBase>
      updateKnowledgeBaseSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, KnowledgeBase>
      LIST_KNOWLEDGE_BASES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, KnowledgeBase>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListKnowledgeBasesRequest injectToken(
                ListKnowledgeBasesRequest payload, String token) {
              return ListKnowledgeBasesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListKnowledgeBasesRequest injectPageSize(
                ListKnowledgeBasesRequest payload, int pageSize) {
              return ListKnowledgeBasesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListKnowledgeBasesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListKnowledgeBasesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<KnowledgeBase> extractResources(ListKnowledgeBasesResponse payload) {
              return payload.getKnowledgeBasesList() == null
                  ? ImmutableList.<KnowledgeBase>of()
                  : payload.getKnowledgeBasesList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList() == null
                  ? ImmutableList.<Location>of()
                  : payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, ListKnowledgeBasesPagedResponse>
      LIST_KNOWLEDGE_BASES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListKnowledgeBasesRequest,
              ListKnowledgeBasesResponse,
              ListKnowledgeBasesPagedResponse>() {
            @Override
            public ApiFuture<ListKnowledgeBasesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListKnowledgeBasesRequest, ListKnowledgeBasesResponse> callable,
                ListKnowledgeBasesRequest request,
                ApiCallContext context,
                ApiFuture<ListKnowledgeBasesResponse> futureResponse) {
              PageContext<ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, KnowledgeBase>
                  pageContext =
                      PageContext.create(
                          callable, LIST_KNOWLEDGE_BASES_PAGE_STR_DESC, request, context);
              return ListKnowledgeBasesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listKnowledgeBases. */
  public PagedCallSettings<
          ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, ListKnowledgeBasesPagedResponse>
      listKnowledgeBasesSettings() {
    return listKnowledgeBasesSettings;
  }

  /** Returns the object with the settings used for calls to getKnowledgeBase. */
  public UnaryCallSettings<GetKnowledgeBaseRequest, KnowledgeBase> getKnowledgeBaseSettings() {
    return getKnowledgeBaseSettings;
  }

  /** Returns the object with the settings used for calls to createKnowledgeBase. */
  public UnaryCallSettings<CreateKnowledgeBaseRequest, KnowledgeBase>
      createKnowledgeBaseSettings() {
    return createKnowledgeBaseSettings;
  }

  /** Returns the object with the settings used for calls to deleteKnowledgeBase. */
  public UnaryCallSettings<DeleteKnowledgeBaseRequest, Empty> deleteKnowledgeBaseSettings() {
    return deleteKnowledgeBaseSettings;
  }

  /** Returns the object with the settings used for calls to updateKnowledgeBase. */
  public UnaryCallSettings<UpdateKnowledgeBaseRequest, KnowledgeBase>
      updateKnowledgeBaseSettings() {
    return updateKnowledgeBaseSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  public KnowledgeBasesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcKnowledgeBasesStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonKnowledgeBasesStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the endpoint set by the user or the the service's default endpoint. */
  @Override
  public String getEndpoint() {
    if (super.getEndpoint() != null) {
      return super.getEndpoint();
    }
    return getDefaultEndpoint();
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "dialogflow";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "dialogflow.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "dialogflow.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(KnowledgeBasesStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(KnowledgeBasesStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return KnowledgeBasesStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected KnowledgeBasesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listKnowledgeBasesSettings = settingsBuilder.listKnowledgeBasesSettings().build();
    getKnowledgeBaseSettings = settingsBuilder.getKnowledgeBaseSettings().build();
    createKnowledgeBaseSettings = settingsBuilder.createKnowledgeBaseSettings().build();
    deleteKnowledgeBaseSettings = settingsBuilder.deleteKnowledgeBaseSettings().build();
    updateKnowledgeBaseSettings = settingsBuilder.updateKnowledgeBaseSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for KnowledgeBasesStubSettings. */
  public static class Builder extends StubSettings.Builder<KnowledgeBasesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, ListKnowledgeBasesPagedResponse>
        listKnowledgeBasesSettings;
    private final UnaryCallSettings.Builder<GetKnowledgeBaseRequest, KnowledgeBase>
        getKnowledgeBaseSettings;
    private final UnaryCallSettings.Builder<CreateKnowledgeBaseRequest, KnowledgeBase>
        createKnowledgeBaseSettings;
    private final UnaryCallSettings.Builder<DeleteKnowledgeBaseRequest, Empty>
        deleteKnowledgeBaseSettings;
    private final UnaryCallSettings.Builder<UpdateKnowledgeBaseRequest, KnowledgeBase>
        updateKnowledgeBaseSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listKnowledgeBasesSettings = PagedCallSettings.newBuilder(LIST_KNOWLEDGE_BASES_PAGE_STR_FACT);
      getKnowledgeBaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createKnowledgeBaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteKnowledgeBaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateKnowledgeBaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listKnowledgeBasesSettings,
              getKnowledgeBaseSettings,
              createKnowledgeBaseSettings,
              deleteKnowledgeBaseSettings,
              updateKnowledgeBaseSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(KnowledgeBasesStubSettings settings) {
      super(settings);

      listKnowledgeBasesSettings = settings.listKnowledgeBasesSettings.toBuilder();
      getKnowledgeBaseSettings = settings.getKnowledgeBaseSettings.toBuilder();
      createKnowledgeBaseSettings = settings.createKnowledgeBaseSettings.toBuilder();
      deleteKnowledgeBaseSettings = settings.deleteKnowledgeBaseSettings.toBuilder();
      updateKnowledgeBaseSettings = settings.updateKnowledgeBaseSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listKnowledgeBasesSettings,
              getKnowledgeBaseSettings,
              createKnowledgeBaseSettings,
              deleteKnowledgeBaseSettings,
              updateKnowledgeBaseSettings,
              listLocationsSettings,
              getLocationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listKnowledgeBasesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getKnowledgeBaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createKnowledgeBaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteKnowledgeBaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateKnowledgeBaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listKnowledgeBases. */
    public PagedCallSettings.Builder<
            ListKnowledgeBasesRequest, ListKnowledgeBasesResponse, ListKnowledgeBasesPagedResponse>
        listKnowledgeBasesSettings() {
      return listKnowledgeBasesSettings;
    }

    /** Returns the builder for the settings used for calls to getKnowledgeBase. */
    public UnaryCallSettings.Builder<GetKnowledgeBaseRequest, KnowledgeBase>
        getKnowledgeBaseSettings() {
      return getKnowledgeBaseSettings;
    }

    /** Returns the builder for the settings used for calls to createKnowledgeBase. */
    public UnaryCallSettings.Builder<CreateKnowledgeBaseRequest, KnowledgeBase>
        createKnowledgeBaseSettings() {
      return createKnowledgeBaseSettings;
    }

    /** Returns the builder for the settings used for calls to deleteKnowledgeBase. */
    public UnaryCallSettings.Builder<DeleteKnowledgeBaseRequest, Empty>
        deleteKnowledgeBaseSettings() {
      return deleteKnowledgeBaseSettings;
    }

    /** Returns the builder for the settings used for calls to updateKnowledgeBase. */
    public UnaryCallSettings.Builder<UpdateKnowledgeBaseRequest, KnowledgeBase>
        updateKnowledgeBaseSettings() {
      return updateKnowledgeBaseSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    /** Returns the endpoint set by the user or the the service's default endpoint. */
    @Override
    public String getEndpoint() {
      if (super.getEndpoint() != null) {
        return super.getEndpoint();
      }
      return getDefaultEndpoint();
    }

    @Override
    public KnowledgeBasesStubSettings build() throws IOException {
      return new KnowledgeBasesStubSettings(this);
    }
  }
}
