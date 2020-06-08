package com.wipro.practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class mostOccuringDigit {
    static int mostOccuringDigit(int[] arr,int size){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < size; i++) {
            sb.append(arr[i]);
        }
        String str = sb.toString();
        System.out.println(str);
        
        int temp=1;
        HashSet<Integer> arr1=new HashSet<>();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }if(count>=temp) {
                temp = count;
                arr1.add(Character.getNumericValue(str.charAt(i)));

            }
        }
        System.out.println(Collections.max(arr1));
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        mostOccuringDigit(arr,size);
    }
}
