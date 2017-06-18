package io.github.gregsen.apokrinomai.models;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ApoResponse {

    private String responseCode;
    private List<Map<String, String>> responseHeaders;
    private JsonNode responseBody;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public List<Map<String, String>> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(List<Map<String, String>> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public JsonNode getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(JsonNode responseBody) {
        this.responseBody = responseBody;
    }

}
