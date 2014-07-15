package com.guru.mayoo.cmm;


import java.util.Map;

public class AuthResponse {

    private String requestId;
    private String statusCode;
    private String statusDescription;
    private Map<String, Object> results;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }

    /*@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("requestId:'").append(requestId).append('\'');
        sb.append(", statusCode:'").append(statusCode).append('\'');
        sb.append(", statusDescription:'").append(statusDescription).append('\'');
        sb.append(", results:'").append(results).append('\'');
        sb.append('}');
        return sb.toString();
    }*/
}
