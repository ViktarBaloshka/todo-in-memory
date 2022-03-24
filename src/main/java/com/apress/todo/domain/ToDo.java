package com.apress.todo.domain;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {
    @NotNull
    private String id;

    @NotNull
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo() {
        LocalDateTime date = LocalDateTime.now();
        id = UUID.randomUUID().toString();
        created = date;
        modified = date;
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }
}
