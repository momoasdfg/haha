package com.example.respring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VersionContoller {
    @Value("${app.version}")
    private String version;

    @GetMapping
    @RequestMapping("/")
    public Map getVersion() {
        Map map = new HashMap<String, String>();
        map.put("application_version", version);
        return map;
    }
}
