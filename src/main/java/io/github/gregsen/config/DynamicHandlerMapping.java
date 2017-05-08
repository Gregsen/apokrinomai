package io.github.gregsen.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;

import javax.servlet.http.HttpServletRequest;

@Component
public class DynamicHandlerMapping extends AbstractHandlerMapping{


    @Override
    protected Object getHandlerInternal(HttpServletRequest request) throws Exception {
        System.out.println(request.);
        return null;
    }
}
