/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.google.mail.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.google.mail.internal.GoogleMailApiName;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The google-mail component provides access to Google Mail.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-mail")
public class GoogleMailComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-mail component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * To use the shared configuration
     */
    private GoogleMailConfigurationNestedConfiguration configuration;
    /**
     * To use the GoogleCalendarClientFactory as factory for creating the
     * client. Will by default use BatchGoogleMailClientFactory. The option is a
     * org.apache.camel.component.google.mail.GoogleMailClientFactory type.
     */
    private String clientFactory;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public GoogleMailConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            GoogleMailConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getClientFactory() {
        return clientFactory;
    }

    public void setClientFactory(String clientFactory) {
        this.clientFactory = clientFactory;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class GoogleMailConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.google.mail.GoogleMailConfiguration.class;
        /**
         * What kind of operation to perform
         */
        private GoogleMailApiName apiName;
        /**
         * What sub operation to use for the selected operation
         */
        private String methodName;
        /**
         * Client ID of the mail application
         */
        private String clientId;
        /**
         * Client secret of the mail application
         */
        private String clientSecret;
        /**
         * OAuth 2 access token. This typically expires after an hour so
         * refreshToken is recommended for long term usage.
         */
        private String accessToken;
        /**
         * OAuth 2 refresh token. Using this, the Google Calendar component can
         * obtain a new accessToken whenever the current one expires - a
         * necessity if the application is long-lived.
         */
        private String refreshToken;
        /**
         * Google mail application name. Example would be
         * "camel-google-mail/1.0"
         */
        private String applicationName;

        public GoogleMailApiName getApiName() {
            return apiName;
        }

        public void setApiName(GoogleMailApiName apiName) {
            this.apiName = apiName;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getClientSecret() {
            return clientSecret;
        }

        public void setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }

        public String getApplicationName() {
            return applicationName;
        }

        public void setApplicationName(String applicationName) {
            this.applicationName = applicationName;
        }
    }
}