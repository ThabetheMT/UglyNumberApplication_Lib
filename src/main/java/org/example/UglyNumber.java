package org.example;

public class UglyNumber {
    private int number;

    public UglyNumber() {
    }
    public UglyNumber(int number) {
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public boolean testNumber(){
        return (number % 2 == 0)
               ||(number % 3 == 0)
               ||(number % 5 == 0);
    }
}
