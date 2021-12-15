package com.kevin.ek.controller;

import com.kevin.ek.model.Good;
import com.kevin.ek.services.GoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TX
 * @date 2020/5/28 14:57
 */

@RestController
@Slf4j
public class GoodController {

    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/id/get", method = RequestMethod.POST)
    public String getById(){
        log.info("------/id/get");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "1";
    }

    @RequestMapping(value = "/good/get", method = RequestMethod.POST)
    public Good getById(@RequestParam("id") int id){
        return goodService.getGoodByIdForUpt(id);
    }
}
