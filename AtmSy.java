import java.util.Scanner;

//create atm class to implement the atm functionality
public class AtmSy{
    //main method
    public static void main(String[] args) {
        //declare and intialize balance , withdraw and deposit
        int balance = 100000, withdraw ,deposit;
        try (
            //create scanner class object to get choice of user
        Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.println("Automated teller machine");
                System.out.println("choose 1 for widthraw");
                System.out.println("choose 2 for deposit");
                System.out.println("choose 3 for check balance");
                System.out.println("choose 4 for exit");
                System.out.println("Choose the operating you want to perform :");
            }
            //get choice from user
             int choix;
             choix=sc.nextInt();
             
            switch(choix){
                case 1:
                System.out.println("enter money to be widthrawn :");
                withdraw = sc.nextInt();
                if(balance >= withdraw){
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }else{
                    System.out.println("Insufficient balance");
                }
                System.out.println("");
                break;
                case 2:
                System.out.println("enter money to be deposited :");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("your money has been successfully deposit");
                System.out.println("");
                break;
                case 3:
                System.out.println("your balance is : " + balance);
            }
        }

    }
}
