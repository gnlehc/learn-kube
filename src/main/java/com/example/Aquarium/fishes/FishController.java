package com.example.Aquarium.fishes;

import com.example.Aquarium.DTOs.FishGetDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping(path = "/api/v1/fishes",  produces = {MediaType.APPLICATION_JSON_VALUE})
public class FishController {
    private final FishService fishService;
    /**
     * Get all fishes
     * @return A list of fishes
     */
    @GetMapping
    public ResponseEntity<List<FishGetDTO>> getAllFishes() {
        log.info("Get all fishes");

        List<FishGetDTO> response = FishGetDTO.getDTO(fishService.getAllFishes());

        return ResponseEntity.ok(response);
    }
    /**
     * Get a specific fish
     * @param id - the UUID of the fish
     * @return THe fish (if it exists)
     */
    @GetMapping("/{id}")
    public ResponseEntity<FishGetDTO> getFish(
            @PathVariable("id") Integer id) {
        log.info("Get fish {}", id);

        FishGetDTO response = FishGetDTO.getDTO(fishService.getFish(id));

        return ResponseEntity.ok(response);
    }
}
