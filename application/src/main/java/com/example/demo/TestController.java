package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Value("${app.ip}")
    private String appIp;
    private static String serverKey = UUID.randomUUID().toString();

    @GetMapping
    public ResponseEntity<TestDto> test() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        final ResponseEntity<TestDto> exchange = new RestTemplate()
                .exchange("http://" + appIp + "/api/recruits", HttpMethod.GET, new HttpEntity(httpHeaders), TestDto.class);
        final TestDto testDto = exchange.getBody();
        testDto.setViewServer(serverKey);
        return ResponseEntity.ok(testDto);
    }
}
