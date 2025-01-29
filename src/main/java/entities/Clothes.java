package entities;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Set;

@Entity(name = "clothes")
public class Clothes extends Product {

    private static final String CLOTHES = "Clothes";

    public Clothes(String productName, String brand, String color, String size, int quantity, BigDecimal price, String material, String description, Set<User> users) {
        super(productName, CLOTHES, brand, color, size, quantity, price, material, description, users);
    }

}
