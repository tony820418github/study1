package com.sh.zfc.usermanagerserver.login.vo;

public class LoginResponse {
    private String result;
    private int status;

    public LoginResponse(int status, String result) {
        this.result = result;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResult() {

        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
