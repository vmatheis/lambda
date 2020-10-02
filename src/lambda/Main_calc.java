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

    static RationalCalculator rc;
    static VectorCalculator vc;
    static ComplexCalculator cc;

    public static void main(String[] args) {
        initialize();
        Scanner s = new Scanner(System.in, "Windows-1252");
        chooseCalcMenu();
        int calc = s.nextInt();

        while(calc<4 && calc>0) {
            System.out.print("Enter number x a> ");
            int xa = s.nextInt();
            System.out.print("Enter number x b> ");
            int xb = s.nextInt();
            System.out.print("Enter number y a> ");
            int ya = s.nextInt();
            System.out.print("Enter number y b> ");
            int yb = s.nextInt();
            System.out.println();
            calcOperations();
            int calcOp = s.nextInt();
            Number num1 = new Number();
            num1.setA(xa);
            num1.setB(xb);
            Number num2 = new Number();
            num2.setA(ya);
            num2.setB(yb);
            Number result = new Number();
            if (calcOp != 5) {
                switch (calc) {
                    case 1:
                        switch (calcOp) {
                            case 1:
                                result = rc.add(num1, num2);
                                break;
                            case 2:
                                result = rc.subtract(num1, num2);
                                break;
                            case 3:
                                result = rc.multiply(num1, num2);
                                break;
                            case 4:
                                result = rc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        };
                        break;
                    case 2:
                        switch (calcOp) {
                            case 1:
                                result = vc.add(num1, num2);
                                break;
                            case 2:
                                result = vc.subtract(num1, num2);
                                break;
                            case 3:
                                result = vc.multiply(num1, num2);
                                break;
                            case 4:
                                result = vc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:

                                break;
                        };
                        break;
                    case 3:
                        switch (calcOp) {
                            case 1:
                                result = cc.add(num1, num2);
                                break;
                            case 2:
                                result = cc.subtract(num1, num2);
                                break;
                            case 3:
                                result = cc.multiply(num1, num2);
                                break;
                            case 4:
                                result = cc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        };
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }

                System.out.println("---------------------");
                System.out.println("Solution:");
                System.out.println("a = " + result.getA());
                System.out.println("b = " + result.getB());
                System.out.println("---------------------");
                System.out.println("");
                chooseCalcMenu();
                calc = s.nextInt();
            }
        }
        System.exit(0);
    }

    public static void menu() {
        initialize();
        Scanner s = new Scanner(System.in, "Windows-1252");
        chooseCalcMenu();
        int calc = Integer.parseInt(s.nextLine());
        while (!(calc > 1 && calc < 3)) {
            System.out.print("Enter number x a> ");
            int xa = Integer.parseInt(s.nextLine());
            System.out.print("Enter number x b> ");
            int xb = Integer.parseInt(s.nextLine());
            System.out.print("Enter number y a> ");
            int ya = Integer.parseInt(s.nextLine());
            System.out.print("Enter number y b> ");
            int yb = Integer.parseInt(s.nextLine());

            calcOperations();
            int calcOp = Integer.parseInt(s.nextLine());

            Number num1 = new Number();
            num1.setA(xa);
            num1.setB(xb);
            Number num2 = new Number();
            num2.setA(ya);
            num2.setB(yb);
            Number result = new Number();
            if (calcOp != 5) {

                switch (calc) {

                    case 1:
                        switch (calcOp) {
                            case 1:
                                result = rc.add(num1, num2);
                                break;
                            case 2:
                                result = rc.subtract(num1, num2);
                                break;
                            case 3:
                                result = rc.multiply(num1, num2);
                                break;
                            case 4:
                                result = rc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (calcOp) {
                            case 1:
                                result = vc.add(num1, num2);
                                break;
                            case 2:
                                result = vc.subtract(num1, num2);
                                break;
                            case 3:
                                result = vc.multiply(num1, num2);
                                break;
                            case 4:
                                result = vc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:

                                break;
                        }
                        ;
                        break;
                    case 3:
                        switch (calcOp) {
                            case 1:
                                result = cc.add(num1, num2);
                                break;
                            case 2:
                                result = cc.subtract(num1, num2);
                                break;
                            case 3:
                                result = cc.multiply(num1, num2);
                                break;
                            case 4:
                                result = cc.divide(num1, num2);
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                        ;
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }

                System.out.println("---------------------");
                System.out.println("Solution:");
                System.out.println("a = " + result.getA());
                System.out.println("b = " + result.getB());
                System.out.println("---------------------");
                chooseCalcMenu();
                calc = Integer.parseInt(s.nextLine());
            }
        }
        System.exit(0);
    }

    public static void chooseCalcMenu() {
        System.out.println("Choose calculator:");
        System.out.println("1 - Rational calculator");
        System.out.println("2 - Vector calculator");
        System.out.println("3 - Complex calculator");
        System.out.println("4 - Exit program");
    }

    public static void calcOperations() {
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
    }

    public static void initialize() {
        rc = new RationalCalculator((a, b) -> {
            double Zaehler = a.getA() * b.getB() + b.getA() * a.getB();
            double Nenner = a.getB() * b.getB();
            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        }, (a, b) -> {
            double Zaehler = a.getA() * b.getB() - b.getA() * a.getB();
            double Nenner = a.getB() * b.getB();
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
            double Zaehler = a.getA() / b.getB();
            double Nenner = a.getB() / b.getA();

            Number n = new Number();
            n.setA(Zaehler);
            n.setB(Nenner);
            return n;
        });

        vc = new VectorCalculator((a, b) -> {
            double x = a.getA() + b.getA();
            double y = b.getB() + a.getB();
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

        cc = new ComplexCalculator((a, b) -> {
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
    }
}
