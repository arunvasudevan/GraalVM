package com.example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/alive")
public class AliveController {

    @Get
    public void index(){
    }
}
