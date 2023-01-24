package com.chavda.jpademo.bhaumik.test;

public class TestProg2 {

    public static void main(String[] args) {
        String number = "163";
        int length= number.length();
        char[] chars= new char[length];

        for (int i = 0; i < length; i++) {
            chars[i] = number.charAt(i);
            
        }
    }

}
