
package com.mycompany.btth1;
import java.util.*;
public class BTTH9 {

    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int input = scanner.nextInt();
       var array = new int[input];
       for(int i=0;i<input;i++){
           array[i] = random.nextInt(input);
           for(int j=0;j<i;j++){
               while(array[j]==array[i]){
                   array[i] = random.nextInt(input);
               }
           }
       }
       
       System.out.println("Ma so can kiem tra: ");
       int searchValue = scanner.nextInt();
       System.out.println("Ma so cong dan bi be di la");
       while(array[searchValue] != 0){
           System.out.print(array[searchValue]);
           searchValue = array[searchValue];
       } 
       System.out.print(searchValue);
            
    }
}
