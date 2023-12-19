package com.nutanix.training.rsup.wahidin.controller;

import com.nutanix.training.rsup.wahidin.model.RawatInap;
import com.nutanix.training.rsup.wahidin.repository.RawatInapRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rawat-inap/v1")
public class RawatInapController {

    private RawatInapRepository repo;

    public RawatInapController(RawatInapRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/list")
    public List<RawatInap> findAll() {
        return this.repo.findAll();
    }
}
