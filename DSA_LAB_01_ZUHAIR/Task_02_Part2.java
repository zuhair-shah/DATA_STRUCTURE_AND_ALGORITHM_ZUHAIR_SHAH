/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_01_ZUHAIR;

/**
 *
 * @author ana
 */
public class Task_02_Part2 {
    public static void main(String[] args) {
           int []array=new int[6];
        array[0]=100;
        array[1]=200;
        array[2]=250;
        array[3]=300;
        array[4]=400;
        array[5]=500;
        System.out.println("<<<Before Insertion>>>");
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+i+":"+array[i]);
        }
        int NewElement=5;
        int position=2;
        System.out.println("<<<After Insertion>>>");
        for(int i=array.length-1;i>position;i--){
            array[i]=array[i-1];
        }
        array[position]=NewElement;
        for(int i=0;i<array.length;i++){
            System.out.println("Element at index "+i+":"+array[i]);
        }


    }
}
