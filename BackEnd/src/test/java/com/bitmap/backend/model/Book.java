package com.bitmap.backend.model;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;
}
