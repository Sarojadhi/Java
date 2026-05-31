/*
Write a program to show inter-thread communication. 
*//*
Write a program to show inter-thread communication.
*/

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw " + amount);

        if (this.amount < amount) {
            System.out.println("Not enough balance, waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.amount -= amount;
        System.out.println("Withdraw completed. Remaining balance: " + this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit " + amount);
        this.amount += amount;
        System.out.println("Deposit completed. Current balance: " + this.amount);

        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {

        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(12000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(15000); // increased deposit so withdraw can complete
            }
        }.start();
    }
}