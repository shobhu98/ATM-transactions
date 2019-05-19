import java.util.HashMap;
import java.util.Scanner;

public class Option_menu extends Account {
    Scanner s = new Scanner(System.in);

    HashMap<Integer, Integer> login_credentials = new HashMap<>();


    public void login_menu() throws Exception {

        int x = 1;
        while (x == 1) {
            try {
                login_credentials.put(12345678, 1243);
                login_credentials.put(23412342, 3123);
                System.out.println("Welcome to the ATM");
                System.out.println("please enter your login number");
                setCustomerlogin(s.nextInt());
                System.out.println("enter your pin number");
                setCustomerpin(s.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid number format");
                x=2;
            }
            //loop for checking right numbers.

        }
    }

    private void getAccounttype() {
        System.out.println("Choose from the following options");
        System.out.println("type1- current account select 1");
        System.out.println("type-2 savings account select-2");
        System.out.println("type-3 exit");

        int selection = s.nextInt();

        switch (selection) {
            case 1: {
                getCurrent();
                break;
            }
            case 2: {
                getSaving();
                break;
            }
            case 3: {
                System.out.println("Thank you for using the ATM");
                break;
            }
            default: {
                System.out.println("\n" + "Invalid Choice" + "\n");
                getAccounttype();
            }
        }
    }


    private void getCurrent() {
        System.out.println("enter the valid choice");
        System.out.println("type-1 Checking balance");
        System.out.println("type-2  Withdraw funds");
        System.out.println("type-3 Deposit funds");
        System.out.println("type-4 exit");
        System.out.println("Please enter your choice");

        int gtcurrent = s.nextInt();
        switch (gtcurrent) {
            case 1: {
                System.out.println(getCurrentbalance());
                break;

            }
            case 2: {
                System.out.println("enter the amount you want to withdraw");
                int amount=s.nextInt();
                current_withdraw(amount);
                break;

            }
            case 3: {
                System.out.println("enter the amount you want to deposit");
                int amount=s.nextInt();
                current_deposit(amount);
                break;



            }
            case 4: {
                System.out.println("Thank you for sing the ATM");

            }
            default: {
                System.out.println("You entered the wrong choice");
                getCurrent();

            }
        }

    }
    private void getSaving(){
        System.out.println("enter the valid choice");
        System.out.println("type-1 Checking balance");
        System.out.println("type-2  Withdraw funds");
        System.out.println("type-3 Deposit funds");
        System.out.println("type-4 exit");
        System.out.println("Please enter your choice");

        int sacurrent=s.nextInt();
        switch (sacurrent){
            case 1:{
                System.out.println(getSavingbalance());
                break;

            }
            case 2:{
                System.out.println("enter the amount you want to withdraw");
                int amount=s.nextInt();
                saving_withdraw(amount);
                break;

            }
            case 3:{
                System.out.println("enter the amount you want to deposit");
                int amount=s.nextInt();
                saving_deposit(amount);
                break;

            }
            case 4:{
                System.out.println("Thank you for using the ATM");
                break;

            }
            default:{
                System.out.println("you entered the wrong choice");
                getSaving();

            }
        }
    }
}
