package com.xinxing.springboot.exception;

import com.xinxing.springboot.entity.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description gobal exception handler
 * @Author 54xinxing
 */
@ControllerAdvice
public class GobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVo<Exception> handleException(HttpServletRequest request, Exception e){
        ResultVo<Exception> resultVo = new ResultVo<>();
        resultVo.setCode(404);
        resultVo.setRequestUrl(request.getRequestURL().toString());
        resultVo.setMsg("接口发生异常！！！");
        resultVo.setData(e);
        return resultVo;
    }

}
