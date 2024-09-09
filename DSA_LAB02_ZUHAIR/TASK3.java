/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB02_ZUHAIR;

/**
 *
 * @author ana
 */
public class TASK3 {
    
  
    public static int mostWordsFound(String[] sentences){
        int maxWords=0;
 for (String sentence:sentences){
      String[] words=sentence.split(" ");
          if (words.length>maxWords){
                maxWords=words.length;
            }  }
return maxWords;
    }
    public static void main(String[] args){
        String[] sentences1 ={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println("Output: "+mostWordsFound(sentences1)); 
     
        String[] sentences2 = {" wait","continue to fight","continue to win"};
        System.out.println("Output: "+mostWordsFound(sentences2)); 
    }}
    
