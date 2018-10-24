package tba;

import java.util.Scanner;

public class TBA {
	//printDelay outputs a string input with a delay on each character
    public static void printDelay(String input, int delay) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.print(c);
            try{
              Thread.sleep(delay);
            }catch(Exception InterruptedException) {
                
            }
        }
    }
    public static void printDelay(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.print(c);
            try{
              Thread.sleep(15);
            }catch(Exception InterruptedException) {
                
            }
        }
    }
    public static void printlnDelay(String input, int delay) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.print(c);
            try{
              Thread.sleep(delay);
            }catch(Exception InterruptedException) {
                
            }
        }
        System.out.println();
    }
    public static void printlnDelay(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.print(c);
            try{
              Thread.sleep(15);
            }catch(Exception InterruptedException) {
                
            }
        }
        System.out.println();
    }
    //wait is a shortened version of Thread.sleep
    public static void wait(int seconds) {
        try{
              Thread.sleep(seconds*1000);
        }catch(Exception InterruptedException) {
                
        }
    }
    //Receive takes an input
    public static String recieve() {
        Scanner sc = new Scanner(System.in);
        String output = sc.nextLine();
        return output;
    }
}
