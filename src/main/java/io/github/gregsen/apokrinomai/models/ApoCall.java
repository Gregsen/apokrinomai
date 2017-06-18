package io.github.gregsen.apokrinomai.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApoCall {
    @Autowired
    private ApoResponse response;

    private String requestPath;
    private String requestMethod;
    private List<String> requestHeaders;
    private List<String> userAgents;

 //TODO what fields are needed?
    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public ApoResponse getResponse() {
        return response;
    }

    public void setResponse(ApoResponse response) {
        this.response = response;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public List<String> getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(List<String> requestHeaders) {
        this.requestHeaders = requestHeaders;
    }

    public List<String> getUserAgents() {
        return userAgents;
    }

    public void setUserAgents(List<String> userAgents) {
        this.userAgents = userAgents;
    }

    @Override
    public String toString() {
        return "ApoCall{" +
                "requestPath='" + requestPath + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", requestHeaders=" + requestHeaders +
                ", userAgents=" + userAgents +
                ", response=" + response +
                '}';
    }
}
