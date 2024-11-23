package com.example.crop_monitoring_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("crop/health")
public class HealthCheckController {
    @GetMapping
    public String healthTest(){
        return "Crop Monitoring System is working";
    }
}
