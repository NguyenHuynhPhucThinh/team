
package com.mycompany.btth1;
import java.util.*;
public class BTTH7 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] firstArray = new int[n];

        //Tạo mảng số nguyên B (kích thước m) với các giá trị ngẫu nhiên 
        int[] secondArray = new int[m];
        Random random = new Random();
      
        for(int i=0;i<m;i++){
            secondArray[i] = random.nextInt();
        }
        
        //Xuất toàn bộ các phần tử của B ra màn hình 
        System.out.println(Arrays.toString(secondArray));
        //Tạo mảng C từ mảng A (
        int[] thirdArray = Arrays.copyOf(firstArray, n);
        //Thay thế phần tử thứ 1 đến 3 của mảng C bằng 3 phần tử cuối của mảng B
        System.arraycopy(secondArray, m-3, thirdArray, 0, 2);
        //Sắp xếp mảng C tăng dần và suất ra màn hình 
       Arrays.sort(thirdArray);
        
        
    }
}
