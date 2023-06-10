import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Counter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("кол-во чисел в массиве");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("введите числа");
        for (int i = 0; i < size; i++){
           array[i] = scanner.nextInt();
        }
        System.out.println("массив заполнен");
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : array){
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }
        System.out.println(counter);
    }
}
