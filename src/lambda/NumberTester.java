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
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vmatheis 3. Beispiel
 */
public class NumberTester {

    private String filename;
    Map<Integer, Integer> numbers = new HashMap<>();
    int numberOfLines;
    
    public NumberTester(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            numberOfLines = Integer.parseInt(line);
            line = br.readLine();
            while (line != null) {
                String[] splitted = line.split(" ");
                numbers.put(Integer.parseInt(splitted[1]), Integer.parseInt(splitted[0]));
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void setOddEvenTester(NumberTest oddTester) {
    }

    public void setPrimeTester(NumberTest primeTester) {
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
    }

    public void testFile() {
    }
}
