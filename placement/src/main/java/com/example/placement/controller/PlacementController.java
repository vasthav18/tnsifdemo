package com.example.placement.controller;

import com.example.placement.model.Placement;
import com.example.placement.service.PlacementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    private final PlacementService service;

    public PlacementController(PlacementService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Placement create(@RequestBody Placement placement) {
        return service.save(placement);
    }

    // READ ALL
    @GetMapping
    public List<Placement> getAll() {
        return service.getAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Placement getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Placement update(@PathVariable Long id, @RequestBody Placement placement) {
        return service.update(id, placement);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Placement deleted with ID " + id;
    }
}