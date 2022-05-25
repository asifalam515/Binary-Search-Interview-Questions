package com.company;

public class CellingOfAnumber {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6,7,8,15};
        int target=14;
        int ans=cellingOfNumber(arr,target);
        System.out.println(ans);
    }
    static int cellingOfNumber(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        if (target>arr[arr.length-1]){
            return -1;
        }
        while (end>=start){
            int mid=start+(end-start)/2;

            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end=mid-1;
            }
            if (target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
}
