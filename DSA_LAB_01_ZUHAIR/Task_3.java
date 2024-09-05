/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_01_ZUHAIR;

/**
 *
 * @author ana
 */
public class Task_3 {
    public static void main(String[] args) {
          int []array={3,6,9,12,15,18};
        int ElementPosition=2;
        for(int i=ElementPosition;i<array.length-1;i++){
            array[i]=array[i+1];
        }  
        array[array.length-1]=0;
        System.out.println("<<<After Deleting Element>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
    }
    }

