/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Scanner;

/**
 *
 * @author vmatheis
 */
public class Main_calc {

    public static void main(String[] args) {
        RationalCalculator rc = new RationalCalculator((a, b) -> {
            double Zaehler = a.getA() * b.getB() + b.getA() * a.getB();
            double Nenner = a.getB() * b.getB();
            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        }, (a, b) -> {
            double Zaehler = a.getA() * b.getB() - b.getA() * b.getB();
            double Nenner = a.getB() * b.getA() + b.getB() * a.getA();
            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        }, (a, b) -> {
            double Zaehler = a.getA() * b.getA();
            double Nenner = a.getB() * b.getB();
            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        }, (a, b) -> {
            double Zaehler = a.getA() * b.getB();
            double Nenner = a.getB() * b.getA();
            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        });

        VectorCalculator vc = new VectorCalculator((a, b) -> {
            double x = a.getA() + b.getA();
            double y = b.getB() + b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        }, (a, b) -> {
            double x = a.getA() - b.getA();
            double y = a.getB() - b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        }, (a, b) -> {
            double neuZaehler = a.getA() * b.getB() + a.getB() * b.getA();
            Number n = new Number();
            n.setA(neuZaehler);
            n.setB(1);
            return n;
        }, (a, b) -> {
            double neuZaehler = a.getA() * b.getA() + a.getB() + b.getB();
            Number n = new Number();
            n.setA(neuZaehler);
            n.setB(1);
            return n;
        });

        ComplexCalculator cc = new ComplexCalculator((a, b) -> {
            double x = a.getA() + b.getB();
            double y = a.getB() + b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        }, (a, b) -> {
            double x = a.getA() - b.getB();
            double y = a.getB() - b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        }, (a, b) -> {
            double x = a.getA() * b.getA() - a.getB() * b.getB();
            double y = a.getA() * b.getA() + a.getB() * b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        }, (a, b) -> {
            double x = a.getA() + a.getB();
            double y = b.getA() + b.getB();
            Number n = new Number();
            n.setA(x);
            n.setB(y);
            return n;
        });

        Scanner s = new Scanner(System.in, "Windows-1252");
        chooseCalcMenu();
        int calcInput = Integer.parseInt(s.nextLine());

    }

    public static void chooseCalcMenu() {
        System.out.println("Choose calculator:"
                + "1 - Relational calculator"
                + "2 - Vector calculator"
                + "3 - Complex calculator"
                + "4 - Exit");
    }

    public static void calcOperations() {
        System.out.println("Choose operation:"
                + "1 - add"
                + "2 - subtract"
                + "3 - multiply"
                + "4 - divide");
    }
}
