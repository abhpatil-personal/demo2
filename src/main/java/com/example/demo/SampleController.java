package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/greet")
    public CompletableFuture<List<Test>> greet() {
        return sampleService.getAllSamplesAsync();
    }

    @GetMapping("/greetSlow")
    public List<Test> greetSlow() {
        return sampleService.getAllSamples();
    }
}