package org.example;

public class Main {
    public static void main(String[] args) {
        if(args.length < 1 || args.length > 2) {
            System.out.println("Nieprawidlowa ilosc argumentow");
            return;
        }
        Shape myShape;
        if(args.length == 1){
            myShape = new Circle(Double.parseDouble(args[0]));
        } else {
            myShape = new Rectangle((Double.parseDouble(args[0])), Double.parseDouble(args[1]));

        }
        System.out.println(myShape.area());
    }
}