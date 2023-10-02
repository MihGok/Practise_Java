package Practise_Java.Practice20;

import java.util.Scanner;

class INN extends Exception {
    public INN(String message) {
        super(message);
    }

    public static void isValid(String inn) throws INN {
        if (inn.length() != 10) {
            if (inn.length() != 12) {
                throw new INN("There must be 10 OR 12 characters. And your one is " + inn.length());
            }
        }
        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            throw new INN("Not a number");

        }
        System.out.println("It is OK");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the INN number in the format of 10-12 digits: ");
        String inn = scanner.next();
        try {
            isValid(inn);
        } catch (INN e) {
            System.out.println("Invalid INN format: " + e.getMessage());
        }
    }
}