package com.example.micronaut;

import com.example.micronaut.model.RobberInput;
import com.example.micronaut.model.RobberOutput;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/robber")
public class HouseRobberController {

    @Post()
    public RobberOutput getMaxValue(RobberInput robberInput){
        RobberOutput robberOutput = new RobberOutput();
        int maxMoney = HouseRobber.rob(robberInput.getValueListByHouse());
        robberOutput.setMaxMoney(maxMoney);
        return robberOutput;
    }
}
