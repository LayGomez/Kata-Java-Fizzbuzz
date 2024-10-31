package org.example;

import java.util.ArrayList;


public class NumberList {
    public ArrayList<Integer> checkNumber(int number, ArrayList<Integer> numberListArray) {
        ArrayList<Integer> divisibles = new ArrayList<>();
        for (Integer dividendo : numberListArray) {
            if (dividendo % number == 0) {
                divisibles.add(dividendo);
            }
        }
        return divisibles;
    }
}