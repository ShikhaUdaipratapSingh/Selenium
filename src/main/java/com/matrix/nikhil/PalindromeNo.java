package com.matrix.nikhil;

public class PalindromeNo {
    public static void main(String[] args) {
        int palindrome=1221;
        int sum=0;
        int r;
        int temp=palindrome;
        System.out.println(palindrome);
        while (palindrome>0){
            r=palindrome%10;
            sum=(sum*10)+r;
            palindrome=palindrome/10;
        }
        if (temp==sum){
        System.out.println("Palindrome No :"+sum);
    }else {
            System.out.println(" Not  Palindrome :"+sum);
        }
    }

}
