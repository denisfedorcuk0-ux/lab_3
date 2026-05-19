import java.util.Arrays;
import java.util.Comparator;

public class Main {

  
    public static void main(String[] args) {
        SportsEquipment[] equipmentArray = {
                new SportsEquipment("Футбольний м'яч", "Футбол", 1200.00, 420, 5),
                new SportsEquipment("Баскетбольний м'яч", "Баскетбол", 1500.00, 620, 4),
                new SportsEquipment("Гантель 10кг", "Фітнес", 850.00, 10000, 5),
                new SportsEquipment("Волейбольний м'яч", "Волейбол", 950.00, 420, 3),
                new SportsEquipment("Ракетка для тенісу", "Теніс", 3200.00, 280, 5),
                new SportsEquipment("М'яч для регбі", "Регбі", 1400.00, 420, 4)
        };

        System.out.println("--- Initial array of objects: ---");
        printArray(equipmentArray);

        Arrays.sort(equipmentArray, Comparator
                .comparingInt(SportsEquipment::getWeightGrams)
                .thenComparing(Comparator.comparingInt(SportsEquipment::getRating).reversed())
        );

        System.out.println("\n--- Sorted array (weight ascending, rating descending): ---");
        printArray(equipmentArray);

        SportsEquipment target = new SportsEquipment("Волейбольний м'яч", "Волейбол", 950.00, 420, 3);
        System.out.println("\nTarget object to search for: " + target);

        int foundIndex = -1;
        for (int i = 0; i < equipmentArray.length; i++) {
            if (equipmentArray[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Result: Object found in the array at index " + foundIndex);
        } else {
            System.out.println("Result: Object not found in the array.");
        }
    }


    private static void printArray(SportsEquipment[] array) {
        for (SportsEquipment item : array) {
            System.out.println(item);
        }
    }
}
