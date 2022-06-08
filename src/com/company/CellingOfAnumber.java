package com.company;

public class CellingOfAnumber {
    public static void main(String[] args) {
        int []arr={2,3,4,5,7,8,11,22,25};
        int target=22;
        int ans=cellingOfANumber(arr,target);
        System.out.println(arr[ans]);
    }
    static int cellingOfANumber(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }
        }

        return start;
    }

}
