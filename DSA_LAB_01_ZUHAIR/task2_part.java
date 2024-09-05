/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB_01_ZUHAIR;

/**
 *
 * @author ana
 */
public class task2_part {
    public static void main(String[] args) {
        int []array=new int[6];
        array[0]=6;
        array[1]=12;
        array[2]=24;
        array[3]=36;
        array[4]=48;
        array[5]=60;
        System.out.print("<<<Before >>>");
        for(int i=0;i<array.length;i++){
            System.out.println(" index "+i+": "+array[i]);
        }
        int newElment=60;
        array[array.length-1]=newElment;
        System.out.println("<<<After >>>");
        for(int i=0;i<array.length;i++){
            System.out.println("index "+i+": "+array[i]);
        }
    }
    }

