import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        // TEMPERATURE CONVERTER
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C OR F): ");
        String celsiusOrFehrenheit = scanner.next().toUpperCase();

        double newTemperature = (celsiusOrFehrenheit.equals("C"))
                ? (5.0 / 9 * (temperature - 32))
                : ((9.0 / 5 * temperature) + 32);

        System.out.printf("Temperature in %s is %.2f", celsiusOrFehrenheit, newTemperature);

        scanner.close();
    }
}