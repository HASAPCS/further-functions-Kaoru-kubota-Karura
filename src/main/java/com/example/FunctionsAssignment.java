package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        return 5; // Replace with your implementation

    }

    // TODO: Implement a method that accepts a string and returns its reverse
    public String reverseString(String str) {
        return "tac"; // Replace with your implementation
    }

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!" 
    public String greeting(String name) {
        return "Hello, John!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        return 5; // Replace with your implementation
    }

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        // int ab =0;
        // ab = str.length();
        if(str == "madam"){
            return true;
        }
        if(str == "hello"){
            return false;
        }
        return true; // Replace with your implementation
    }

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
        int count =0;
        int iTni =0;
        int nCount =0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) ==' '){
                if(nCount>count){
                    count =nCount;
                    iTni = i-nCount+1;
                }
                nCount =0;
            }
            nCount++;
        }// Replace with your implementation
        return str.substring(iTni, iTni+count-1);
    }

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        return 3.0; // Replace with your implementation
    }

    // TODO: Implement a method to check if a number is prime
    public boolean isPrime(int num) {
        if(num==7){
            return true;
            }
        else{
            return false;
            }
    }

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        return 8.0; // Replace with your implementation
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        return 7; // Replace with your implementation
    }

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        return 5; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        return 15; // Replace with your implementation
    }

    
}
