/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cMath;

import cMath.Factorize;
import java.util.ArrayList;

/**
 *
 * @author i++
 * @version 1.0.0.0
 * The class determines whether a number is prime or complex
 * 
 * Клас визначає чи є число простим, чи складним
 * 
 */
public class PrimeNumber {
    
    /**
     * method of determining a prime number
     * @param nam is a number
     * @return true - prime number false - complex
     * 
     * метод визначення простого числа
     * @param nam - число
     * @return true - просте число  false - складне
     */
    public boolean thisPrimeNamber(int nam){
        int copy = nam;
        ArrayList<Integer> mn = Factorize.factorize(nam);
        return mn.size() == 1;
    }
    
    /**
     * method for determining a complex number
     * @param nam is a number
     * @return true - complex number false - simple
     * 
     * метод визначення складного числа
     * @param nam - число
     * @return true - складне число  false - просте
     */
        public boolean thisСomplexNamber(int nam){
        int copy = nam;
        ArrayList<Integer> mn = Factorize.factorize(nam);
        return mn.size() > 1;
    }
    
}
