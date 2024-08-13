package com.example.Aquarium.fishes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Random;
@Setter
@Getter
@Document("fishes")
@NoArgsConstructor
public class Fish {

    @Id
    public Integer id;

    public String type;

    public Fish(String type) {
        Random random = new Random();
        int randomIntInRange = random.nextInt(100);
        this.id = randomIntInRange;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(
                "Fish[id=%s, type='%s']",
                id.toString(), type);
    }

}
