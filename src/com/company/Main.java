package com.company;

public class Main {

    public static void main(String[] args) {
        // Binary search code will be here
        int []arr={23,456,7899,8908978};
        int target=342;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target){
        int s=0;
        int e=arr.length-1;
       while (s<=e){
           int mid= s+(e-s)/2;
           if (target<arr[mid]){
               e=mid-1;
           }else if (target>arr[mid]){
               s=mid+1;
           }
           else {
               return mid;
           }
       }

        return -1;
    }
}
