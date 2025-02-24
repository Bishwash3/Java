public class Bank{
    String name;
    double accountNo;
    double balance;
    Bank(String name, double accountNo, double balance){
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void displayDetails(){
        System.out.println(name);
        System.out.println(accountNo);
        System.out.println(balance);

    }
    double deposit(double amnt){
        if(amnt == 0){
            System.out.println("Invalid Balance");
        }
        return (balance += amnt);
    }

     double withdraw(double amnt){
        if(balance == 0 || amnt > balance){
            System.out.println("Insufficient balance");
        }
        return (balance -= amnt);
    }

    public static void main(String[] args){
        Bank bankaccount = new Bank("Samrat", 1234, 26000);
        bankaccount.displayDetails();
        System.out.println("---------------------");
        bankaccount.deposit(4000);
        bankaccount.displayDetails();
        System.out.println("---------------------");

        bankaccount.withdraw(3000);
        bankaccount.displayDetails();

        System.out.println("---------------------");


        Bank bankAccount2 = new Bank("Bishwash", 5678, 20000);
        bankAccount2.displayDetails();
        System.out.println("---------------------");
        bankAccount2.deposit(5000);
        bankAccount2.displayDetails();
        System.out.println("---------------------");

        bankAccount2.withdraw(2000);
        bankAccount2.displayDetails();
    }
}

