import java.util.Scanner;
/*
1. Create an online banking system with the following features:
* Users must be able to log in with a username and password.
* If the user enters the wrong credentials three times, the system must lock them out.
* The initial balance in the bank account is $2000.
* The system must allow users to deposit, withdraw, view, and transfer money.
* The system must display a menu for users to perform transactions.
 */
public class Main {
    public static void main(String[] args) {

        // Creating the user
        AccountHolder user = new AccountHolder("Juan",
                "Estrada",
                200.00,
                "Juan Daniel",
                "12345");

        int attempts = 0;
        Scanner keyboard = new Scanner(System.in);
        while (attempts < 3) {

            String userName = "";
            String userPassword = "";
            int remainingAttemps = 3;

            System.out.println("Enter your username:");
            userName = keyboard.nextLine();
            System.out.println("Enter your password:");
            userPassword = keyboard.nextLine();

            if(userName.equals(user.getUser()) && userPassword.equals(user.getPassword())) {
                // TODO: add code to clear console

                System.out.println();
                break;
            } else if (attempts == 2) {
                System.out.println("Your account is lock out");
                System.exit(0);
            } else {
                // TODO: add code to clear console

                attempts++;
                remainingAttemps = remainingAttemps - attempts;
                System.out.println("Username and password do no match");
                System.out.println("Try again. You have " + remainingAttemps + " attemps");
            }

        }

        int option = 0;
        do {
            System.out.println("****************************************");
            System.out.println("         WELCOME " + user.getName().toUpperCase() + " " + user.getLastName().toUpperCase() + " ");
            System.out.println("****************************************");
            System.out.println();
            // Options
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - View balance");
            System.out.println("4 - Transfer money");
            System.out.println("5 - Exit");
            System.out.println("Choose the operation you want to do:");
            option = keyboard.nextInt();

             options(user, option);

        } while(option != 5);
    }

    public static void options(AccountHolder user, int option) {
        double amount = 0.0;
        String userNameTransfer = "";
        Scanner name = new Scanner(System.in);
        Scanner keyboardOptions = new Scanner(System.in);
        switch (option) {
            case 1:
                System.out.println("Enter the amount to deposit:");
                amount = keyboardOptions.nextDouble();
                user.deposit(amount);
                break;
            case 2:
                System.out.println("Enter the amount that you want to withdraw:");
                amount = keyboardOptions.nextDouble();
                user.withdraw(amount);
                break;
            case 3:
                System.out.println("Your balance is: " + user.getInitialBalance());
                break;
            case 4:
                System.out.println("Enter the user to transfer:");
                userNameTransfer = name.nextLine();
                System.out.println("Enter the amount that you want to transfer:");
                amount = keyboardOptions.nextInt();
                user.transfer(userNameTransfer, amount);
                break;
            case 5:
                System.out.println("See you");
                break;
            default:
                System.out.println("Wrong options. Please enter a valid option.");
        }
    }


}