/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_01_ZUHAIR;

/**
 *
 * @author ana
 */
public class Task_5 {
     public class ReverseArray {
    public static void reverse(int[] arr) {
        int first=0, last=arr.length-1;
        while(first<last) {
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int []array={1,3,5,7,9};
        reverse(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
    }

