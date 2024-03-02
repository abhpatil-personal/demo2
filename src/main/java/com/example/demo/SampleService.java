package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    @Autowired
    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public List<Test> getAllSamples() {
        return sampleRepository.findAll();
    }

    @Async
    public CompletableFuture<List<Test>> getAllSamplesAsync() {
        return CompletableFuture.supplyAsync(sampleRepository::findAll);
    }

}
