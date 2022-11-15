package net.nuconuco.appbase.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * 基底例外ハンドリングクラス
 * 
 * @author col
 */
@ControllerAdvice
public class BaseControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception e, WebRequest request) {

        return new ResponseEntity<Object>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}