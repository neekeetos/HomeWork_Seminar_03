
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task_01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Добавьте произвольные целые числа в список
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Изначальный список: " + numbers);

        System.out.println("Удалить чётные числа:" + removeEvenNumbers(numbers));

        System.out.println("Минимальное значение: " + Collections.min(numbers));

        System.out.println("Максимальное значение: " + Collections.max(numbers));

        System.out.println("Среднее значение: " + calculateAverage(numbers));
    }

    public static ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> numb_array = numbers;
        Iterator<Integer> iterator = numb_array.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return numb_array;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}