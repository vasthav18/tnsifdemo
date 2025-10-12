package com.example.placement.service;

import com.example.placement.model.Placement;
import com.example.placement.repository.PlacementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {
    private final PlacementRepository repo;

    public PlacementService(PlacementRepository repo) {
        this.repo = repo;
    }

    public Placement save(Placement placement) {
        return repo.save(placement);
    }

    public List<Placement> getAll() {
        return repo.findAll();
    }

    public Placement getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Placement update(Long id, Placement newPlacement) {
        return repo.findById(id).map(p -> {
            p.setName(newPlacement.getName());
            p.setCollege(newPlacement.getCollege());
            p.setDate(newPlacement.getDate());
            p.setQualification(newPlacement.getQualification());
            p.setYear(newPlacement.getYear());
            return repo.save(p);
        }).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}