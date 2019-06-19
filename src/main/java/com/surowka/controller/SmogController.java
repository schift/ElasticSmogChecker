package com.surowka.controller;

import com.surowka.model.SmogData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SmogController {

    @RequestMapping(method=GET, value = "/greeting")
    public SmogData getData() {
        SmogData smogData = new SmogData();
        smogData.setId("1");
        smogData.setStationName("stacja1");

        return smogData;
    }
}
