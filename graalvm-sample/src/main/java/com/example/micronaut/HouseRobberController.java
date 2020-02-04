package com.example.micronaut;

import java.util.List;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/robber")
public class HouseRobberController {

    @Get("/{valueListByHouse}")
    public Integer getMaxValue(@Parameter List<Integer> valueListByHouse){
        //RobberOutput robberOutput = new RobberOutput();
        int maxMoney = HouseRobber.rob(valueListByHouse);

        return maxMoney;
    }
}
