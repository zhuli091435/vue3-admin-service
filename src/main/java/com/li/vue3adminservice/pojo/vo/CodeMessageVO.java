package com.li.vue3adminservice.pojo.vo;

import lombok.Data;

@Data
public class CodeMessageVO {
    private Integer code;
    private String message;
    private Object data;

    public CodeMessageVO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CodeMessageVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
