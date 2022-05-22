package com.company;

public class CellingOfAnumber {
    public static void main(String[] args) {
//Question:Celling of a number;
        /*arr=[2,3,,5,14,16,18],target=15;
        if it sorted array then apply binary search without thinking twich
Celling=smallest element in array greater or equal to target element
CElling (arr,target=14)=14
celling (arr,target=15)=16;
target=4
step 1:search the target
step 2:search the greater than target value
step 3: select the lowest number from the greater list

         */
       int []arr={1,2,3,5,6,76,453};
       int target=5;
       int ans=cellingofANumber(arr,target);
        System.out.println(ans);

    }
    //return the index of smallest no >=target
    static int cellingofANumber(int []arr,int target){
        //but what if the target  greater than the greatest number in the arrayy
          int start=0;
          int end=arr.length-1;
          while (start<=end){
              int mid=start+(end-start)/2;

              if (target>arr[mid]){
                  start=mid+1;
              }
              if (target<arr[mid]){
                  end=mid-1;
              }
              else {
                  return mid;
              }
          }
        return start;
    }
}
