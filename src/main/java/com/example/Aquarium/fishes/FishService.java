package com.example.Aquarium.fishes;

import com.example.Aquarium.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FishService {
    private final FishRepository fishRepo;
    public Fish getFish(Integer id) {

        Fish fishTank = fishRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fish not found"));
        return fishTank;
    }
    public List<Fish> getAllFishes() {
        List<Fish> fishTanks = fishRepo.findAll();

        return fishTanks;
    }
}
