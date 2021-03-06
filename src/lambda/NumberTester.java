/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vmatheis 3. Beispiel
 */
public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    private String filename;
    List<Integer[]> numbers = new ArrayList<>();
    int numberOfLines;

    public NumberTester(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            numberOfLines = Integer.parseInt(line);
            line = br.readLine();
            while (line != null) {
                String[] splitted = line.split(" ");
                numbers.add(new Integer[]{Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1])});
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        for (int i = 0; i < numbers.size(); i++) {
            Integer[] get = numbers.get(i);

            if (get[0] != null) {
                switch (get[0]) {
                    case 1:
                        boolean oddEven = oddTester.testNumber(get[1]);
                        if (oddEven) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }
                        break;
                    case 2:
                        boolean prime = primeTester.testNumber(get[1]);
                        if (prime) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        boolean palin = palindromeTester.testNumber(get[1]);
                        if (palin) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                    default:
                        break;
                }
            }

        }
    }
}
