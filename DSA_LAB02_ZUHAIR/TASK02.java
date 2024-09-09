/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB02_ZUHAIR;

/**
 *
 * @author ana
 */
  import java.util.ArrayList;
import java.util.List;

public class TASK02 {
   
    public static List<Integer> findIndices(String[] words,char a){
        List<Integer> indices =new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(a) != -1){
                indices.add(i);
            }}
        return indices;
 }
  public static void main(String[] args){
      String[] words1={"leet","code"};
        char a1='e';
        System.out.println("Output: " + findIndices(words1,a1)); //Output: [0, 1]

        String[] words2={"abc","bcd","aaaa","cbc"};
        char a2 = 'a';
        System.out.println("Output: " + findIndices(words2,a2)); //Output: [0, 2]

        String[] words3 = {"abc","bcd","aaaa","cbc"};
        char a3 = 'z';
        System.out.println("Output: "+findIndices(words3, a3)); //Output: []
    }
}
    

