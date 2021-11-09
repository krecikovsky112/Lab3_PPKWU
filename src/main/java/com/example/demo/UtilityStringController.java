package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("string_utility_controller/")
public class UtilityStringController {

    @GetMapping("plain_text")
    public String get(){
        final String uri = "http://localhost:8080/string_analyzer/upper_case/AASsasDDaa";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }
}
