/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vmatheis
 * 2. Beispiel
 */
public class HalloJavamitForEach {
    static List<String> list = new ArrayList<String>();
    
    public static void main(String[] args) {
       while(true){
           list.add("lol");
           if(list.size() == 6){
               break;
           }
       }
        
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("Lambda:");
        list.forEach(System.out::println);
    }
        
}
