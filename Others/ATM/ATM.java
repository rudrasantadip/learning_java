
import java.util.Scanner;

class Customer {
    private String acc_no;
    private String pin;
    private int bank_balance;

    Customer(String acc_no, String pin, int bank_balance) {
        this.acc_no = acc_no;
        this.pin = pin;
        this.bank_balance = bank_balance;
    }

    String get_acc_no() {
        return this.acc_no;
    }

    String get_pin() {
        return this.pin;
    }

    void set_pin(String new_pin) {
        this.pin = new_pin;
    }

    int get_balance() {
        return this.bank_balance;
    }

    void set_balance(int new_balance) {
        this.bank_balance = new_balance;
    }
}

public class ATM {
    Scanner sc = new Scanner(System.in);

    void deposit(Customer c, int dep_amt) {
        int fin_bal = c.get_balance() + dep_amt;
        c.set_balance(fin_bal);
    }

    void withdraw(Customer c, int wid_amt) {
        if (c.get_balance() >= wid_amt) {
            c.set_balance(c.get_balance() - wid_amt);
            System.out.println("Rs " + wid_amt + " has been widhdrawn");
        } else {
            System.out.println("Transaction cannot proceed due to insuficient balance");
        }
    }

    void change_pin(Customer c, String temp_pin) {
        if (c.get_pin().equals(temp_pin)) {
            System.out.println("Please enter your new pin: ");
            c.set_pin(sc.next());
        } else {
            System.out.println("Your given credentials do not match! Pin cannot be changed.");
        }
    }

    private boolean check_account(Customer c, String acc_no, String pin) {
        boolean flag = false;
        if (c.get_acc_no().equals(acc_no)) {
            if (c.get_pin().equals(pin)) {
                flag = true;
            }
        }
        return flag;
    }

    public void check_balance(Customer c) {
        System.out.println("Your Current Balance is: " + c.get_balance());
    }

    public static void main(String args[])
    {
        String acc_no, pin;
        int choice,amt;
        Scanner sc = new Scanner(System.in);
        ATM sbi = new ATM();
        Customer santadip = new Customer("190020224596", "9612", 0);


        System.out.println("Please enter your account number: ");
        acc_no = sc.next();
        System.out.println("Enter your pin: ");
        pin = sc.next();

        if(sbi.check_account(santadip,acc_no,pin)==true)
        {
            System.out.println("Press 1 to Deposit");
            System.out.println("Press 2 to Widhraw money");
            System.out.println("Press 3 to change your pin");
            System.out.println("Press 4 to check your balance");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                System.out.print("Enter the amount you want to deposit: ");
                amt=sc.nextInt();
                sbi.deposit(santadip,amt);
                break;

                case 2:
                System.out.println("Enter the amount you want to withdraw: ");
                amt = sc.nextInt();
                sbi.withdraw(santadip, amt);
                break;

                case 3:
                String temp_pin;
                System.out.println("Enter your old pin: ");
                temp_pin=sc.next();
                sbi.change_pin(santadip,temp_pin);
                break;

                case 4:
                    sbi.check_balance(santadip);
                    break;


                default:
                System.out.println("Wrong choice, Please try again.");

            }
        }
        else
        {
            System.out.println("Wrong Credentials!!");
        }
        sc.close();
    }
        

        
    
}
