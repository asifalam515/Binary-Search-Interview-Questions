package com.company;

public class GuessNumber {
    public static void main(String[] args) {
int pick=1;
int n=2;
int ans=number(n,pick);
        System.out.println(ans);
    }
    static int number(int  n,int pick){
       int  start=0;
       int end=n;
       while (start<=end){
           int mid=start+(end-start)/2;
           if (mid>pick){
               end=mid-1;
           }
           else if (mid<pick){
               start=mid+1;
           }
           else {
               return mid;
           }
       }
       return -1;
    }
}
