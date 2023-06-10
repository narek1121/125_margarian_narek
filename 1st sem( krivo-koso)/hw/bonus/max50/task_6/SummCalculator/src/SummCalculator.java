import java.util.HashMap;
import java.util.Scanner;

public class SummCalculator {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите кол-во разных единиц товара ");
        int totalCount = input.nextInt();
        System.out.println(" Сумма ИТОГО: " + calculateSumm(totalCount));
    }
    public static int calculateSumm(int totalCount)
    {
        HashMap<String, Integer> namesAndCount = new HashMap<>();
        HashMap<String, Integer> namesAndPrice = new HashMap<>();
        namesAndCount.put("Томат", 92);
        namesAndCount.put("Огурцы", 137);
        namesAndCount.put("Баклажан", 86);
        namesAndCount.put("Картофель", 219);

        namesAndPrice.put("Томат", 24);
        namesAndPrice.put("Огурцы", 30);
        namesAndPrice.put("Баклажан", 25);
        namesAndPrice.put("Картофель", 15);

        int totalSum = 0;
        for (int i = 0; i != totalCount; i++)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Введи название товара");
            String thingName = input.nextLine();
            System.out.println("Введи кол-во");
            int thingCount = input.nextInt();
            while(thingCount > namesAndCount.get(thingName))
            {
                System.out.println("В наличии на данный момент " + namesAndCount.get(thingName) + " штук " + thingName);
                System.out.println("Попробуйте взять меньше ");
                thingCount = input.nextInt();
            }
            System.out.println("Сумма ИТОГО:" + (thingCount * namesAndPrice.get(thingName)));
            totalSum += thingCount * namesAndPrice.get(thingName);
        }
        return(totalSum);
    }
}