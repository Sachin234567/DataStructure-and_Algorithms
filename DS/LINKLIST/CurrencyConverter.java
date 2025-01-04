import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates (hardcoded for simplicity, you can use real-time API in real project)
        double usdToInr = 74.32;
        double usdToEuro = 0.85;
        double usdToYen = 110.20;

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available currencies: USD, INR, EURO, YEN");

        // Input currency and amount
        System.out.print("Enter the currency to convert from (USD, INR, EURO, YEN): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Conversion
        double convertedAmount = 0.0;
        String toCurrency = "";

        switch (fromCurrency) {
            case "USD":
                System.out.print("Enter the currency to convert to (INR, EURO, YEN): ");
                toCurrency = scanner.next().toUpperCase();
                if (toCurrency.equals("INR")) {
                    convertedAmount = amount * usdToInr;
                } else if (toCurrency.equals("EURO")) {
                    convertedAmount = amount * usdToEuro;
                } else if (toCurrency.equals("YEN")) {
                    convertedAmount = amount * usdToYen;
                } else {
                    System.out.println("Invalid currency choice!");
                    return;
                }
                break;
            case "INR":
                System.out.print("Enter the currency to convert to (USD, EURO, YEN): ");
                toCurrency = scanner.next().toUpperCase();
                if (toCurrency.equals("USD")) {
                    convertedAmount = amount / usdToInr;
                } else if (toCurrency.equals("EURO")) {
                    convertedAmount = (amount / usdToInr) * usdToEuro;
                } else if (toCurrency.equals("YEN")) {
                    convertedAmount = (amount / usdToInr) * usdToYen;
                } else {
                    System.out.println("Invalid currency choice!");
                    return;
                }
                break;
            case "EURO":
                System.out.print("Enter the currency to convert to (USD, INR, YEN): ");
                toCurrency = scanner.next().toUpperCase();
                if (toCurrency.equals("USD")) {
                    convertedAmount = amount / usdToEuro;
                } else if (toCurrency.equals("INR")) {
                    convertedAmount = (amount / usdToEuro) * usdToInr;
                } else if (toCurrency.equals("YEN")) {
                    convertedAmount = (amount / usdToEuro) * usdToYen;
                } else {
                    System.out.println("Invalid currency choice!");
                    return;
                }
                break;
            case "YEN":
                System.out.print("Enter the currency to convert to (USD, INR, EURO): ");
                toCurrency = scanner.next().toUpperCase();
                if (toCurrency.equals("USD")) {
                    convertedAmount = amount / usdToYen;
                } else if (toCurrency.equals("INR")) {
                    convertedAmount = (amount / usdToYen) * usdToInr;
                } else if (toCurrency.equals("EURO")) {
                    convertedAmount = (amount / usdToYen) * usdToEuro;
                } else {
                    System.out.println("Invalid currency choice!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid currency choice!");
                return;
        }

        // Output the result
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}
