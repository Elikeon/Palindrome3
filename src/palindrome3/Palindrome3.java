/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palindrome = JOptionPane.showInputDialog("words that are the same forwards and backwards are caled palindromes This program determines if a words is a palindrome" + "\n Enter a phrase(do not include a punctuation mark):"); 
                String palindromeCon = palindrome.toLowerCase();
                String reverse = "";
            String palindromeCon2 = palindromeCon.replaceAll("\\s","");
                for(int i = palindromeCon2.length() - 1; i >= 0; i--)
        {
            reverse = reverse + palindromeCon2.charAt(i);
        }
                if(reverse.equals(palindromeCon2)){
        System.out.println(palindrome + " Is a palindrome"); 
                }
                else {
                    System.out.println(palindrome + " Isnt a palindrome"); 
                }
                    
    }
    
    
}
