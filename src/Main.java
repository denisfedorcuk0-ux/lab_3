import java.util.Arrays;
import java.util.Comparator;

/**
 * Головний виконавчий клас програми для демонстрації роботи з масивами об'єктів.
 * Виконує створення, двокритеріальне сортування та лінійний пошук елементів
 * у масиві спортивного інвентарю.
 *
 * @author Денис
 * @version 1.0
 */
public class Main {

    /**
     * Головний метод програми, який є точкою входу.
     *
     * @param args масив аргументів командного рядка
     */
    public static void main(String[] args) {
        SportsEquipment[] equipmentArray = {
                new SportsEquipment("Футбольний м'яч", "Футбол", 1200.00, 420, 5),
                new SportsEquipment("Баскетбольний м'яч", "Баскетбол", 1500.00, 620, 4),
                new SportsEquipment("Гантель 10кг", "Фітнес", 850.00, 10000, 5),
                new SportsEquipment("Волейбольний м'яч", "Волейбол", 950.00, 420, 3),
                new SportsEquipment("Ракетка для тенісу", "Теніс", 3200.00, 280, 5),
                new SportsEquipment("М'яч для регбі", "Регбі", 1400.00, 420, 4)
        };

        System.out.println("--- Початковий масив об'єктів: ---");
        printArray(equipmentArray);

        Arrays.sort(equipmentArray, Comparator
                .comparingInt(SportsEquipment::getWeightGrams)
                .thenComparing(Comparator.comparingInt(SportsEquipment::getRating).reversed())
        );

        System.out.println("\n--- Відсортований масив (вага верх, рейтинг низ): ---");
        printArray(equipmentArray);

        SportsEquipment target = new SportsEquipment("Волейбольний м'яч", "Волейбол", 950.00, 420, 3);
        System.out.println("\nОб'єкт для пошуку: " + target);

        int foundIndex = -1;
        for (int i = 0; i < equipmentArray.length; i++) {
            if (equipmentArray[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Результат: Об'єкт знайдено в масиві за індексом " + foundIndex);
        } else {
            System.out.println("Результат: Об'єкт не знайдено в масиві.");
        }
    }

    /**
     * Виводит у консоль усі елементи переданого масиву спортивного інвентарю.
     * Кожен об'єкт відображається у новому рядку за допомогою свого методу toString().
     *
     * @param array масив об'єктів {@link SportsEquipment}, який необхідно вивести
     */
    private static void printArray(SportsEquipment[] array) {
        for (SportsEquipment item : array) {
            System.out.println(item);
        }
    }
}