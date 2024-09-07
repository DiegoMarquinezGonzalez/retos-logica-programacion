package org.example;

public class ReverseStrings {
    public static void main(String[] args) {
        /*
         * Crea un programa que invierta el orden de una cadena de texto
         * sin usar funciones propias del lenguaje que lo hagan de forma automática.
         * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
         */
        String str = "Hola mundo";
        System.out.println(reverseString(str));

    }
    public static String reverseString (String str){
        String reverseStr = "";
        char[] arrayStr = str.toCharArray();
        char[] reverseArray = new char[arrayStr.length];
        for(int i = arrayStr.length-1, j = 0; i >= 0; i--, j++){
            reverseArray[j] = arrayStr[i];
            reverseStr += reverseArray[j];
        }

        return reverseStr;
    }
}
