package com.xinxing.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description ResultVo
 * @Author 54xinxing
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = 236472891209022326L;

    private Integer code;

    private String msg;

    private String requestUrl;

    private T data;
}
