/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB02_ZUHAIR;

/**
 *
 * @author ana
 */
public class TASK4 {


    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) ==k){
                    count++;
                }}}

        return count;
    }
public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int k1 = 1;
        System.out.println("Output: " + countKDifference(nums1,k1)); 

        int[] nums2={1,3};
        int k2=3;
        System.out.println("Output: " +countKDifference(nums2,k2)); 

        int[] nums3={3, 2, 1, 5, 4};
        int k3 = 2;
        System.out.println("Output: "+countKDifference(nums3,k3)); 
    }}

