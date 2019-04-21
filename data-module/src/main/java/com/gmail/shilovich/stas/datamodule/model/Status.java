package com.gmail.shilovich.stas.datamodule.model;

public enum Status {
    READY("ready"),
    COMPLETED("completed");

    private String statusName;

    Status(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
