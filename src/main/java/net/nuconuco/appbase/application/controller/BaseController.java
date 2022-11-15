package net.nuconuco.appbase.application.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.nuconuco.appbase.application.model.ResponseData;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<Object> doGet(@RequestParam String param) {

        // レスポンスデータ生成
        ResponseData responseData = ResponseData.builder().serial(UUID.randomUUID().toString()).build();

        return new ResponseEntity<Object>(responseData, HttpStatus.OK);
    }
}