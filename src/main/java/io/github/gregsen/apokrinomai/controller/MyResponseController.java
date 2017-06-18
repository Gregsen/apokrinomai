package io.github.gregsen.apokrinomai.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import io.github.gregsen.apokrinomai.models.ApoCall;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyResponseController extends AbstractController {

    @Value(value = "classpath:responses/response200.json") // TODO get *.json files from configured directory
    private Resource resource;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(); //TODO proper json mapping
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        ApoCall call = null;
        try {
            call = objectMapper.readValue(resource.getInputStream(), ApoCall.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.getWriter().println(call.getResponse().toString());
        return null;
    }
}
