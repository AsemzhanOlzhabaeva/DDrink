package Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Beverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private double volume; // Объем в литрах
}
