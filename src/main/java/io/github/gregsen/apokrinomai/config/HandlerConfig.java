package io.github.gregsen.apokrinomai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.Properties;

@Configuration
public class HandlerConfig {

    //TODO add mapping for administration page (and add administration page). URL should be configurable.
    /**
     * The handler called by Springs {@link org.springframework.web.servlet.DispatcherServlet}.
     * All requests will be handled by {@link io.github.gregsen.apokrinomai.controller.MyResponseController}
     * @return the handler
     */
    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping(){
        Properties properties = new Properties();
        properties.setProperty("/**", "myResponseController");

        final SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setMappings(properties);
        simpleUrlHandlerMapping.setOrder(Ordered.HIGHEST_PRECEDENCE);

        return simpleUrlHandlerMapping;
    }
}
