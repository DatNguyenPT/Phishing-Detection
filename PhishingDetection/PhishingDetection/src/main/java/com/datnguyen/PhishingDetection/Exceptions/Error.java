package com.datnguyen.PhishingDetection.Exceptions;

public class Error {
    public static void throwNullPointerException() {
        String nullString = null;
        // Attempting to use nullString will result in a NullPointerException
        int length = nullString.length();
    }

    public static void URLNotFound(){
        try {
            throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {}
}
