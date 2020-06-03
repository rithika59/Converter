package tester;
import java.util.Scanner;
import utils.conversion.*;

public class TestConverter {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        System.out.println("After conversion : "+ Converter.weightKg(input.nextDouble()));
        System.out.println("Enter temperature in Celsius : ");
        System.out.println("After conversion : "+ Converter.tempF(input.nextDouble()));
        System.out.println("Enter time in seconds : ");
        System.out.println("After conversion : "+ Converter.timeHr(input.nextInt()));


    }

}