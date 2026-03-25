import java.util.*;
public class RoundDecimalToNPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter double type number:");
        double number = sc.nextDouble();
        System.out.println("Enter number you want after decimal:");
        int n =sc.nextInt();

        double scale = Math.pow(10, n);
        double result = Math.round(number * scale) / scale;

        System.out.println("Rounded value: " + result);
    }
}