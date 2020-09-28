/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.ArrayList;

/**
 *
 * @author vmatheis
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }

    public void test() {
        NumberTester tester = new NumberTester("lambda.txt");

        tester.setOddEvenTester((n) -> n % 2 == 0);
        tester.setPrimeTester((n) -> {
                if (n <= 1)
                    return false;

                for (int i = 2; i <= n / 2; i += 2)
                    if ((n % i) == 0)
                        return false;

                return true;
        });
    }
}
