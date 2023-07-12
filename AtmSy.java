import java.util.Scanner;

//create atm class to implement the atm functionality
public class AtmSystem {
    //main method
    public static void main(String[] args) {
        //declare and initialize balance, withdraw, and deposit
        int balance = 100000, withdraw, deposit;
        
        //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Automated teller machine");
            System.out.println("Choose 1 for withdrawal");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 to exit");
            System.out.println("Choose the operation you want to perform:");
            
            //get choice from user
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter amount to be deposited:");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Your balance is: " + balance);
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        }
    }
}
