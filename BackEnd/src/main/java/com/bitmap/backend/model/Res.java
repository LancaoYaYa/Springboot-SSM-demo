package com.bitmap.backend.model;

import lombok.Data;

@Data
public class Res {
    private Boolean flag;
    private Object data;

    public Res(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
