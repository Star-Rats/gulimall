package com.jmy.gulimall.product.exception;

import com.jmy.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RestControllerAdvice(basePackages = "com.jmy.gulimall.product.controller")
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class}) // 感知的异常类型
    public R handleVaildException(MethodArgumentNotValidException exception) {
        log.error("数据校验出现问题：{}，异常类型为：{}", exception.getMessage(), exception.getClass());
        BindingResult bindingResult = exception.getBindingResult();

        HashMap<String, String> map = new HashMap<>();
        // 1.获取校验的错误结果
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        fieldErrors.forEach(item -> {
            // 2.获取校验错误的Filed
            String field = item.getField();
            // 3.获取错误提示
            String message = item.getDefaultMessage();
            map.put(field, message);
        });
        
        return R.error(400, "提交的参数不合法").put("data", map);
    }
}
