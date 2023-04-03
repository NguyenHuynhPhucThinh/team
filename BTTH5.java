
package com.mycompany.btth1;
import java.util.Scanner;
public class BTTH5 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        System.out.println("Tong chieu dai cua chuoi mot va hai la: "+(firstString.length()+secondString.length()));
        // 3 ky tu dau tien cua chuoi thu nhat 
        System.out.println("Ba ky tu dau tien cua chuoi la: ");
        for(int i=0;i<3;i++){
            System.out.print(firstString.charAt(i)+" ");
        }
        // 3 ky tu dau tien cua chuoi thu hai 
        System.out.println("Ba ky tu dau tien cua chuoi la: ");
        for(int i=0;i<3;i++){
            System.out.print(secondString.charAt(i)+" ");
        }
        //Ky tu so 6 cua chuoi mot
        System.out.println("Ky tu so 6 cua chuoi mot la: " + firstString.charAt(5));
        //Kiem tra chuoi mot co bang chuoi hai khong
        if(firstString.equals(secondString)){
            System.out.println(" hai chuoi bang nhau");
        } else{
            System.out.println(" hai chuoi do khong bang nhau");
        }
        
        //kiem tra chuoi hai co xuat hien trong chuoi 1 khong 
        int viTri = firstString.indexOf(secondString);
        if(viTri >=0){
            System.out.println(" Chuoi hai co xuat hien trong chuoi 1 o vi tri" + viTri);
        }else{
            System.out.println(" Chuoi hai khong xuat hien trong chuoi mot");
        }
    }
}
