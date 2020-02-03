/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pgevent;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class PgEventEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "datasource": ((PgEventEndpoint) target).setDatasource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "bridgeErrorHandler": ((PgEventEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((PgEventEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((PgEventEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((PgEventEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((PgEventEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PgEventEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "pass": ((PgEventEndpoint) target).setPass(property(camelContext, java.lang.String.class, value)); return true;
        case "user": ((PgEventEndpoint) target).setUser(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "datasource": ((PgEventEndpoint) target).setDatasource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "bridgeerrorhandler": ((PgEventEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((PgEventEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((PgEventEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((PgEventEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((PgEventEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((PgEventEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "pass": ((PgEventEndpoint) target).setPass(property(camelContext, java.lang.String.class, value)); return true;
        case "user": ((PgEventEndpoint) target).setUser(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}
