package com.pancakesunlimited.server.controller;

import com.pancakesunlimited.server.entity.Pancake;
import com.pancakesunlimited.server.service.PancakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pu/pancakes")
public class PancakeController {

    private final PancakeService pancakeService;

    @Autowired
    public PancakeController(PancakeService pancakeService) {
        this.pancakeService = pancakeService;
    }

    @GetMapping
    public ResponseEntity<List<Pancake>> getAllPancakes() {
        return pancakeService.getAllPancakes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pancake> getPancake(@PathVariable Integer id) {
        return pancakeService.getPancakeById(id);
    }

    @PostMapping
    public ResponseEntity<Pancake> createPancake(@RequestBody Pancake pancake) {
        return pancakeService.createPancake(pancake);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pancake> updatePancake(@PathVariable Integer id, @RequestBody Pancake pancakeDetails) {
        return pancakeService.updatePancake(id, pancakeDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePancake(@PathVariable Integer id) {
        pancakeService.deletePancake(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}