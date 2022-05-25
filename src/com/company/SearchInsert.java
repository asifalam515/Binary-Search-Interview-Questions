package com.company;

public class SearchInsert {
    public static void main(String[] args) {

        int[] arr={1,2,5,6};
        int target=3;
        int ans=searchinsert(arr,target);
        System.out.println(ans);
    }
    static int searchinsert(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[start] == target ||arr[start] > target) {
                return start;
            }

            if (arr[end] == target) {
                return end;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(start<arr[mid]){
                end=mid-1;
            }
            if (target==arr[mid]){
                return mid;
            }

        }
        return start ;
    }
}
