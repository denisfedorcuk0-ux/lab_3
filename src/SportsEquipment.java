import java.util.Objects;

/**
 * Represents a piece of sports equipment.
 * Contains information about the name, category, price, weight, and popularity rating of the product.
 *
 */
public class SportsEquipment {
    private final String name;
    private final String category;
    private final double price;
    private final int weightGrams;
    private final int rating;

    /**
     * Constructs a new SportsEquipment object.
     *
     * @param name        the name of the equipment
     * @param category    the sports category the item belongs to
     * @param price       the unit price of the item
     * @param weightGrams the weight of the equipment in grams
     * @param rating      the popularity rating from 1 to 5
     */
    public SportsEquipment(String name, String category, double price, int weightGrams, int rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weightGrams = weightGrams;
        this.rating = rating;
    }

    /**
     * Returns the name of the equipment.
     *
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the category of the equipment.
     *
     * @return the sports category of the product
     */
    public String getCategory() {
        return category;
    }

    /**
     * Returns the price of the equipment.
     *
     * @return the product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the weight of the equipment in grams.
     *
     * @return the item weight
     */
    public int getWeightGrams() {
        return weightGrams;
    }

    /**
     * Returns the popularity rating of the equipment.
     *
     * @return the rating score
     */
    public int getRating() {
        return rating;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Comparison is performed across all five fields of the class.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if the objects are identical; {@code false} otherwise
     */
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

    /**
     * Returns a hash code value for the object.
     * The hash code is based on the values of all fields in the class.
     *
     * @return the hash code value
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, weightGrams, rating);
    }

    /**
     * Returns a string representation of the sports equipment object.
     *
     * @return a formatted string containing all properties of the object
     */
    @Override
    public String toString() {
        return String.format("SportsEquipment{name='%s', category='%s', price=%.2f, weight=%dg, rating=%d}",
                name, category, price, weightGrams, rating);
    }
}
