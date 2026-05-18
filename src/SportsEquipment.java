

import java.util.Objects;

public class SportsEquipment {
    private final String name;
    private final String category;
    private final double price;
    private final int weightGrams;
    private final int rating;

    public SportsEquipment(String name, String category, double price, int weightGrams, int rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weightGrams = weightGrams;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SportsEquipment implementsEquipment = (SportsEquipment) o;
        return Double.compare(implementsEquipment.price, price) == 0
                && weightGrams == implementsEquipment.weightGrams
                && rating == implementsEquipment.rating
                && Objects.equals(name, implementsEquipment.name)
                && Objects.equals(category, implementsEquipment.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, weightGrams, rating);
    }

    @Override
    public String toString() {
        return String.format("SportsEquipment{name='%s', category='%s', price=%.2f, weight=%dg, rating=%d}",
                name, category, price, weightGrams, rating);
    }
}