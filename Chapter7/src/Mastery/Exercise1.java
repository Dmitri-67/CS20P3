package Mastery;

public class Exercise1 {
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    public Exercise1() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    public void addPenny() {
        pennies++;
    }

    public void addNickel() {
        nickels++;
    }

    public void addDime() {
        dimes++;
    }

    public void addQuarter() {
        quarters++;
    }

    public void takeMoneyOut() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    public double getTotal() {
        double total;
        total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
        return total;
    }
}
