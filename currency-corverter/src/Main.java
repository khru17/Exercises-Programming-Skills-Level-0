import java.util.Scanner;
/*
2 - Create a currency converter between CLP, ARS, USD, EUR, TRY, GBP with the following features:
* 		The user must choose their initial currency and the currency they want to exchange to.
* 		The user can choose whether or not to withdraw their funds. If they choose not to withdraw, it should return to the main menu.
* 		If the user decides to withdraw the funds, the system will charge a 1% commission.
* 		Set a minimum and maximum amount for each currency, it can be of your choice.
* 		The system should ask the user if they want to perform another operation. If they choose to do so, it should restart the process; otherwise, the system should close.
 */
public class Main {
    public static void main(String[] args) {

        // double balance = 1000.00;

        Scanner keyboard = new Scanner(System.in);
        Scanner currency1 = new Scanner(System.in);
        Scanner currency2 = new Scanner(System.in);
        Scanner keyboardText = new Scanner(System.in);
        Scanner keyboardText2 = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("****************************************");
            System.out.println("WELCOME TO CURRENCY CONVERTER");
            System.out.println("****************************************");
            // System.out.println("Your balance is: " + balance);
            System.out.println();
            System.out.println("1 - Converter");
            System.out.println("2 - Exit");
            System.out.println("Choose the operation you want to do:");
            option = keyboard.nextInt();

            double amount = 0;
            String initialCurrency = "";
            String exchange = "";
            String commision = "";
            String exitOrReturn = "";
            double amountConverted = 0;

            switch (option){
                case 1:
                    System.out.println("INSTRUCTIONS");
                    System.out.println("First, you must choose the initial currency.");
                    System.out.println("You can choose between the following currencies: ");
                    System.out.println("CLP, ARS, USD, EUR, TRY, GBP");
                    System.out.println("Second, you must choose the currency you want to exchange to.");
                    System.out.println("You must enter the currency abbreviation.");
                    System.out.println();
                    System.out.println("Enter the amount: ");
                    amount = keyboard.nextDouble();
                    System.out.println("Enter the initial currency");
                    initialCurrency = currency1.nextLine();
                    System.out.println("Enter the second currency");
                    exchange = currency2.nextLine();
                    amountConverted = converter(initialCurrency, exchange, amount);
                    System.out.println();
                    System.out.println("Do you want to withdraw your funds?");
                    System.out.println("Yes enter 'Y' and No enter 'N'");
                    System.out.println("NOTE: If you withdraw your funds, the system will charge a 1% commission");
                    commision = keyboardText.nextLine();
                    if(commision.equals("Y")) {
                        System.out.println("You selected withdraw your funds.");
                        amountConverted = amountConverted * 0.99;
                        System.out.println("Take your money: " + amountConverted + " " + exchange);
                    }
                    System.out.println();
                    System.out.println("Do you want to do other option?");
                    System.out.println("Yes enter 'Y' and No enter 'N'");
                    exitOrReturn = keyboardText2.nextLine();
                    if (exitOrReturn.equals("Y")) {
                        break;
                    } else {
                        System.out.println("See you");
                        System.exit(0);
                    }

                case 2:
                    System.out.println("See you");
                    System.exit(0);
                    break;
                default:
            }

        } while (option !=2);
    }

    public static double converter(String initialCurrency, String secondCurrency, Double amount) {
        switch (secondCurrency) {
            case "CLP":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyCLP;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            case "ARS":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyARS;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            case "USD":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyUSD;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            case "EUR":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyEUR;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            case "TRY":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyTRY;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            case "GBP":
                amount = amount * CurrencyValues.valueOf(initialCurrency).valueCurrencyGBP;
                System.out.println("The conversion is: " + amount + " " + secondCurrency);
                break;
            default:
                System.out.println("The option is incorrect, try again");
        }
        return amount;

    }

}