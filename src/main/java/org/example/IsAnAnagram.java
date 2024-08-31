package org.example;

import java.util.Arrays;

public class IsAnAnagram {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        String str1 = "Roma";
        String str2 = "amor";
        System.out.println(isAnAnagram(str1,str2));

    }
    public static boolean isAnAnagram(String str1, String str2){
        //comprobacion de que no sean la misma palabra
        if (str1.toLowerCase().equals(str2.toLowerCase())){
            return false;
        }
        //una vez comprobado que no es la misma palabra, se pasa a crear array, ordenarlo y comprobar que tienen mismo contenido
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1, array2)){
            return true;
        }else{
            return false;
        }
    }
}
