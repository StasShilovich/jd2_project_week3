package com.gmail.shilovich.stas.servicemodule.model;

import com.gmail.shilovich.stas.datamodule.model.Status;

public class ItemStatusDTO {
    private Long id;
    private Status status;

    public ItemStatusDTO(Long id, Status status) {
        this.id = id;
        this.status = status;
    }

    public ItemStatusDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
