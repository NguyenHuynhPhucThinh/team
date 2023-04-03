
package com.mycompany.btth1;
import java.util.*;
public class BTTH8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 0){
            System.err.println("So phai lon hon 0");
            return;
        }
        Random random = new Random();
        int tmp = random.nextInt(n);
        int Input;
        int lowMargin =0;
        int highMargin = n;
        while(true){
            Input = scanner.nextInt();
            if(Input != tmp){
                if(highMargin - lowMargin <= 2){
                    System.out.println("Ban thua roi");
                    return;
                }
            if(Input >= lowMargin || Input <= highMargin){
                if(Input > tmp){
                    System.out.println("Too High");
                    highMargin = Input - 1;
                    System.out.println(lowMargin + " "+ highMargin);
                }
                if(Input < tmp){
                    System.out.println("Too Low");
                    lowMargin = Input;
                    System.out.println(lowMargin + " "+ highMargin);
                }
            } else{
                System.err.println("Error out of range");
                return;
            }
                
                
            } else {
                System.out.println("Correct");
                return;
            }
        }
    }
}
