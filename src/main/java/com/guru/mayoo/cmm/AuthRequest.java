package com.guru.mayoo.cmm;

import java.util.Date;

public class AuthRequest {

    String  requestId;
    String  requestingSystem;
    String requestedTime;
    String  cardUId;
    String  cardSecToken;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestingSystem() {
        return requestingSystem;
    }

    public void setRequestingSystem(String requestingSystem) {
        this.requestingSystem = requestingSystem;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

    public String getCardUId() {
        return cardUId;
    }

    public void setCardUId(String cardUId) {
        this.cardUId = cardUId;
    }

    public String getCardSecToken() {
        return cardSecToken;
    }

    public void setCardSecToken(String cardSecToken) {
        this.cardSecToken = cardSecToken;
    }

    @Override
    public String toString() {
        return "AuthRequest [requestId=" + requestId + ", requestingSystem=" + requestingSystem + "]";
    }
}
