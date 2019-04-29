package com.xinxing.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description HelloController
 * @Author 54xinxing
 */
@Controller
public class ExceptionThrowerController {

    @RequestMapping("/throwRuntimeException")
    public String throwRuntimeException(){
        throw new RuntimeException("via throw RuntimeException !!!");
    }
}
