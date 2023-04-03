
package com.mycompany.btth1;
import java.util.Scanner;
public class BTTH4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        // Tim uoc so
        System.out.print("Uoc so la  ");
        for(int i=1;i<=inputNumber;i++){
            if(inputNumber % i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // Tim so luong chu so cua n
        int tmp=inputNumber;
        int count =0;
        while(tmp > 0){
            tmp =tmp/10;
            count++;
        }
        System.out.println("So luong chu so la: " + count);
        //Kiem tra so doi xung
        var anArray = new int[count];
        tmp=inputNumber;
        int i=0;
        while(tmp > 0){
            anArray[i]=tmp % 10;
            tmp =tmp/10;
            i=i+1;
        }
        tmp = count - 1;
        boolean flat = false;
        for(i=0;i<count/2;i++){
           if(anArray[i] == anArray[tmp]){
               
           }else{
               flat = true;
           }
        }
        if(flat == true){
            System.out.println("Khong phai la so doi xung");
        }else{
            System.out.println("La so doi xung");
        }
        //So chinh phuong
        for(i=0;i<inputNumber;i++){
            if(i*i==inputNumber){
                System.out.println("La so chinh phuong");
            }else{
                System.out.println("Khong la so chinh phuong");
            }
        }
    }
}
