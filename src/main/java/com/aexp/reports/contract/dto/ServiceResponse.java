package com.aexp.reports.contract.dto;

public class ServiceResponse<T> {
    private T result;
    private StatusCode statusCode;
    public String errorMessage;

    public ServiceResponse(T result){
        this.result = result;
        this.statusCode = StatusCode.SUCCESS;
        errorMessage = "";
    }

    public ServiceResponse(String errorMessage)
    {
        this.result = null;
        this.statusCode = StatusCode.ERROR;
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
