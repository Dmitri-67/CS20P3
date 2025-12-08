package Mastery;

public class Exercise2 {
    private int number;

    public Exercise2(int n) { 
        number = n;
    }

    public int getWhole() { //All the calculations
        return number;
    }

    public int getOnes() {
        return number % 10;
    }

    public int getTens() {
        return (number / 10) % 10;
    }

    public int getHundreds() {
        return (number / 100) % 10;
    }
}
