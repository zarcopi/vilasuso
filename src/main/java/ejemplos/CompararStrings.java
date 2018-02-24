package main.java.ejemplos;

public class CompararStrings {
    
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1 + " equals " + s2 + " -> " +
        s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2)); 
        System.out.println(s1 + " = " + s2 + " -> " + (s1 = s2)); 
        
        int num1 = 1;
        int num2 = 1;
        
        System.out.println(num1 + " == " + num1 + " -> " +(num1 == num2));
        System.out.println(num1 + " = " + num1 + " -> " +(num1 = num2));
        
        
    }

}
