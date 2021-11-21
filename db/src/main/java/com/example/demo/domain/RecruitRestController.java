package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recruits")
public class RecruitRestController {
    private static String serverKey = UUID.randomUUID().toString();

    @GetMapping
    public ResponseEntity<TestDto> getTest() {
        List<String> names = new ArrayList<>();
        names.add("hi");
        names.add("my");
        names.add("name");
        names.add("is");
        names.add("hak");
        TestDto testDto = new TestDto(2L, names, "MyName", null, serverKey);
        return ResponseEntity.ok(testDto);
    }
}
