/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cMath;

import java.util.ArrayList;

/**
 *
 * @author i++
 * @version 1.0.0.0
 * multiplication class of numbers
 * 
 * клас розкладу числа на множники
 */
public class Factorize {
    
    /**
     * method of decomposition of numbers into prime factors
     * @param nam is a number
     * @return - list of multipliers
     * 
     * метод розкладу числа на простi множники
     * @param nam - число
     * @return  - список множників
     */
    public static ArrayList<Integer> factorize(int nam){
        ArrayList<Integer> mn = new ArrayList<Integer>();
        while(nam != 1){
            for(int i = 2; i <= nam; i++){
                if(nam % i == 0){
                    nam = nam / i;
                    mn.add(i);
                    break;
                }
            }
        }
        return mn;
    }
    
    /**
     * method of decomposition of numbers into prime factors
     * @param nam is a number
     * @return - array of multipliers
     * 
     * метод розкладу числа на просты множники
     * @param nam - число
     * @return  - масив множників
     */
    public static int[] getFactorizeArray(int nam){
        ArrayList<Integer> mn = factorize(nam);
        int[] mi = new int[mn.size()];
        for(int i = 0; i < mi.length; i++){
            mi[i] = mn.get(i).intValue();
        }
        return mi;
    }
    
    /**
     * method of output to the console
     * if a complex number outputs a format string: number = multiplier1 * multiplier2 * ... * multipliern
     * as a prime number displays messages that the number is prime.
     * @param nam is a number
     * 
     * метод виведення в консоль 
     * якщо число складне виводить строку формату: число = множник1 * множник2 * ... * множникn
     * як що число просте виводить повідомленя про те, що число просте.
     * @param nam - число
     */
    public static void printFactorize(int nam){
        int copy = nam;
        ArrayList<Integer> mn = factorize(nam);
        System.out.println(mn.size() == 1 ? "число " + copy + " - простое!" : toString(copy, mn));
    }

    /**
     * The method creates a format string: number = multiplier1 * multiplier2 * ... * multipliern
     * @param copy - source number
     * @param mn - list of multipliers
     * @return - format string: number = multiplier1 * multiplier2 * ... * multipliern
     * 
     * Метод створює строку формату: число = множник1 * множник2 * ... * множникn
     * @param copy - вихідне число
     * @param mn - список множників
     * @return - строка формату: число = множник1 * множник2 * ... * множникn
     */
    private static String toString(int copy, ArrayList<Integer> mn) {
        String s = "" + copy + " = ";
        for(int i = 0; i < mn.size(); i++){
            s += i < mn.size() - 1 ? mn.get(i).toString() + " * " : mn.get(i).toString();
        }
        return s;
    }
    
}
