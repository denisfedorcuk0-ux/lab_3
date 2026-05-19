import java.util.Objects;

/**
 * Клас, що представляє одиницю спортивного інвентарю.
 * Містить інформацію про назву, категорію, вартість, вагу та рейтинг популярності товару.
 *
 * @author Денис
 * @version 1.0
 */
public class SportsEquipment {
    private final String name;
    private final String category;
    private final double price;
    private final int weightGrams;
    private final int rating;

    /**
     * Конструктор для створення нового об'єкта спортивного інвентарю.
     *
     * @param name        назва інвентарю
     * @param category    категорія спорту, до якої належить предмет
     * @param price       вартість одиниці товару
     * @param weightGrams вага інвентарю в грамах
     * @param rating      рейтинг популярності від 1 до 5
     */
    public SportsEquipment(String name, String category, double price, int weightGrams, int rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.weightGrams = weightGrams;
        this.rating = rating;
    }

    /**
     * Повертає назву інвентарю.
     *
     * @return назва товару
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає категорію інвентарю.
     *
     * @return спортивна категорія товару
     */
    public String getCategory() {
        return category;
    }

    /**
     * Повертає вартість інвентарю.
     *
     * @return ціна товару
     */
    public double getPrice() {
        return price;
    }

    /**
     * Повертає вагу інвентарю в грамах.
     *
     * @return вага предмета
     */
    public int getWeightGrams() {
        return weightGrams;
    }

    /**
     * Повертає рейтинг популярності інвентарю.
     *
     * @return оцінка рейтингу
     */
    public int getRating() {
        return rating;
    }

    /**
     * Перевіряє рівність поточного об'єкта з іншим об'єктом.
     * Порівняння відбувається за всіма п'ятьма полями класу.
     *
     * @param o об'єкт для порівняння з поточним
     * @return {@code true}, якщо об'єкти ідентичні; {@code false} в іншому випадку
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
     * Обчислює та повертає хеш-код для поточного об'єкта.
     * Хеш-код базується на значеннях усіх полів класу.
     *
     * @return значення хеш-коду
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, weightGrams, rating);
    }

    /**
     * Повертає текстове представлення об'єкта спортивного інвентарю.
     *
     * @return рядок із форматованими даними про всі властивості об'єкта
     */
    @Override
    public String toString() {
        return String.format("SportsEquipment{name='%s', category='%s', price=%.2f, weight=%dg, rating=%d}",
                name, category, price, weightGrams, rating);
    }
}