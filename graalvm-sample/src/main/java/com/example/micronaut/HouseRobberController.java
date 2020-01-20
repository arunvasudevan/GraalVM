package com.example.micronaut;

import java.util.List;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.RequestAttribute;

@Controller("/robber")
public class HouseRobberController {

    @Get("/{nums}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getMaxValue(@RequestAttribute List<Integer> nums){
        //List<Integer> numsArray = Arrays.asList(1,2,3,1);
        return "Output:"+HouseRobber.rob(nums);
    }
}
