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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.servicenow.ServiceNowComponent;

/**
 * The servicenow component is used to integrate Camel with ServiceNow cloud
 * services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ServicenowComponentBuilderFactory {

    /**
     * ServiceNow (camel-servicenow)
     * The servicenow component is used to integrate Camel with ServiceNow cloud
     * services.
     * 
     * Category: api,cloud,management
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-servicenow
     */
    static ServicenowComponentBuilder servicenow() {
        return new ServicenowComponentBuilderImpl();
    }

    /**
     * Builder for the ServiceNow component.
     */
    interface ServicenowComponentBuilder
            extends
                ComponentBuilder<ServiceNowComponent> {
        /**
         * The ServiceNow instance name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ServicenowComponentBuilder instanceName(
                java.lang.String instanceName) {
            doSetProperty("instanceName", instanceName);
            return this;
        }
        /**
         * The ServiceNow default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.servicenow.ServiceNowConfiguration</code> type.
         * 
         * Group: advanced
         */
        default ServicenowComponentBuilder configuration(
                org.apache.camel.component.servicenow.ServiceNowConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The ServiceNow REST API url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ServicenowComponentBuilder apiUrl(java.lang.String apiUrl) {
            doSetProperty("apiUrl", apiUrl);
            return this;
        }
        /**
         * ServiceNow user account name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
        /**
         * ServiceNow account password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * OAuth2 ClientID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder oauthClientId(
                java.lang.String oauthClientId) {
            doSetProperty("oauthClientId", oauthClientId);
            return this;
        }
        /**
         * OAuth2 ClientSecret.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder oauthClientSecret(
                java.lang.String oauthClientSecret) {
            doSetProperty("oauthClientSecret", oauthClientSecret);
            return this;
        }
        /**
         * OAuth token Url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder oauthTokenUrl(
                java.lang.String oauthTokenUrl) {
            doSetProperty("oauthTokenUrl", oauthTokenUrl);
            return this;
        }
        /**
         * The proxy host name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default ServicenowComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port number.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default ServicenowComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Username for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder proxyUserName(
                java.lang.String proxyUserName) {
            doSetProperty("proxyUserName", proxyUserName);
            return this;
        }
        /**
         * Password for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default ServicenowComponentBuilder proxyPassword(
                java.lang.String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default ServicenowComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ServicenowComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ServicenowComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class ServicenowComponentBuilderImpl
            extends
                AbstractComponentBuilder<ServiceNowComponent>
            implements
                ServicenowComponentBuilder {
        @Override
        protected ServiceNowComponent buildConcreteComponent() {
            return new ServiceNowComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "instanceName": ((ServiceNowComponent) component).setInstanceName((java.lang.String) value); return true;
            case "configuration": ((ServiceNowComponent) component).setConfiguration((org.apache.camel.component.servicenow.ServiceNowConfiguration) value); return true;
            case "apiUrl": ((ServiceNowComponent) component).setApiUrl((java.lang.String) value); return true;
            case "userName": ((ServiceNowComponent) component).setUserName((java.lang.String) value); return true;
            case "password": ((ServiceNowComponent) component).setPassword((java.lang.String) value); return true;
            case "oauthClientId": ((ServiceNowComponent) component).setOauthClientId((java.lang.String) value); return true;
            case "oauthClientSecret": ((ServiceNowComponent) component).setOauthClientSecret((java.lang.String) value); return true;
            case "oauthTokenUrl": ((ServiceNowComponent) component).setOauthTokenUrl((java.lang.String) value); return true;
            case "proxyHost": ((ServiceNowComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": ((ServiceNowComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyUserName": ((ServiceNowComponent) component).setProxyUserName((java.lang.String) value); return true;
            case "proxyPassword": ((ServiceNowComponent) component).setProxyPassword((java.lang.String) value); return true;
            case "useGlobalSslContextParameters": ((ServiceNowComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "basicPropertyBinding": ((ServiceNowComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((ServiceNowComponent) component).setLazyStartProducer((boolean) value); return true;
            default: return false;
            }
        }
    }
}