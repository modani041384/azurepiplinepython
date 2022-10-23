package com.fakerestapi.controller;

import com.fakerestapi.contansts.RestApi;
import com.fakerestapi.dto.Fakerest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class FakerestapiController {

    @GetMapping(value = RestApi.Activities)
    public ResponseEntity<List<Fakerest>> ping() {
        List<Fakerest> data = new ArrayList<>();
        data.add(new Fakerest("modani", "088332332"));
        data.add(new Fakerest("modani123", "088332233"));
        data.add(new Fakerest("modani124", "08833223355"));
        return new ResponseEntity(data, HttpStatus.OK);
    }


    @GetMapping(value = RestApi.HOME)
    public String home() {
        return "Home page";
    }

}
