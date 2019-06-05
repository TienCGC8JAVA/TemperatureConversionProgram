import java.io.*;

public class TemperatureConversionProgram {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String choice, sFahrenheit, sCelsius;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = bufferedReader.readLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter fahrenheit: ");
                    sFahrenheit = bufferedReader.readLine();
                    int nFahrenheit = Integer.parseInt(sFahrenheit);
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(nFahrenheit));
                    break;
                case"2":
                    System.out.println("Enter Celsius: ");
                    sCelsius = bufferedReader.readLine();
                    int nCelsius = Integer.parseInt(sCelsius);
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(nCelsius));
                    break;
                case "0":
                    System.exit(0);
            }
        } while (choice.equals("0"));
    }

    private static double celsiusToFahrenheit(int celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
