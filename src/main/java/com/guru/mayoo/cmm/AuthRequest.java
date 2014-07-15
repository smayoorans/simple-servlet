package com.guru.mayoo.cmm;

import java.util.Date;

public class AuthRequest {

    private String  requestId;
    private String  requestingSystem;
    private String requestedTime;
    private String  cardUId;
    private String  cardSecToken;

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
}
