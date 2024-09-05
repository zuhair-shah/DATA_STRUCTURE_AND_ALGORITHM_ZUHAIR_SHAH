/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_01_ZUHAIR;

/**
 *
 * @author ana
 */
public class Task2_Part_3 {
    public static void main(String[] args) {
        int []array=new int[6];
        array[0]=8;
        array[1]=16;
        array[2]=24;
        array[3]=32;
        array[4]=40;

        System.out.print("<<<Before insertion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
        int newElment=24;
        array[array.length-1]=newElment;
        System.out.println("<<<After insetion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element index "+i+": "+array[i]);
        }
    }
    }

