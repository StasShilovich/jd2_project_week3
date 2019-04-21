package com.gmail.shilovich.stas.datamodule.model;

public class Item {
    private Long id;
    private String name;
    private Status status;
    private Boolean deleted;

    public Item(Long id, String name, Status status, Boolean deleted) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.deleted = deleted;
    }

    public Item() {
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
