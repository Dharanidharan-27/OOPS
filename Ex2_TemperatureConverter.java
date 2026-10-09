import java.util.Scanner;

class TemperatureConverter {

    // Celsius to Others
    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    // Fahrenheit to Others
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    // Kelvin to Others
    public double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }
}

public class Ex2_TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter tc = new TemperatureConverter();
        int choice;

        System.out.println("========== TEMPERATURE CONVERTER ==========");

        do {
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter temperature: ");
                double temp = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.printf("%.2f C = %.2f F\n", temp, tc.celsiusToFahrenheit(temp));
                        break;
                    case 2:
                        System.out.printf("%.2f C = %.2f K\n", temp, tc.celsiusToKelvin(temp));
                        break;
                    case 3:
                        System.out.printf("%.2f F = %.2f C\n", temp, tc.fahrenheitToCelsius(temp));
                        break;
                    case 4:
                        System.out.printf("%.2f F = %.2f K\n", temp, tc.fahrenheitToKelvin(temp));
                        break;
                    case 5:
                        System.out.printf("%.2f K = %.2f C\n", temp, tc.kelvinToCelsius(temp));
                        break;
                    case 6:
                        System.out.printf("%.2f K = %.2f F\n", temp, tc.kelvinToFahrenheit(temp));
                        break;
                }
            } else if (choice != 7) {
                System.out.println("Invalid Choice!");
            }
        } while (choice != 7);

        System.out.println("Thank You!");
        sc.close();
    }
}
