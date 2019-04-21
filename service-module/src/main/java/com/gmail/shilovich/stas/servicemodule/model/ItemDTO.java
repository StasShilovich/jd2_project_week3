package com.gmail.shilovich.stas.servicemodule.model;

import com.gmail.shilovich.stas.datamodule.model.Status;

public class ItemDTO {
    private Long id;
    private String name;
    private Status status;

    public ItemDTO(Long id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public ItemDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
