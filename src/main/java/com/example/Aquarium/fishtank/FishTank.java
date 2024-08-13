package com.example.Aquarium.fishtank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Random;
@Setter
@Getter
@Document("fish tanks")
@NoArgsConstructor
public class FishTank {
    @Id
    public Integer id;

    public String name;

    public FishTank(String name) {
        Random random = new Random();
        int randomIntInRange = random.nextInt(100);
        this.id = randomIntInRange;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "FishTank[id=%s, type='%s']",
                id.toString(), name);
    }
}
