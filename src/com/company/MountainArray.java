package com.company;

public class MountainArray {
    public static void main(String[] args) {

    }
    static int peakIndexInMountainArray(int []arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //you are in decreaseing part of array
                //this may be  the ans,but look at the left
                //this is why end !=mid-1;
                end=mid;

            } else {
                //you are in ascending part of array
                start=mid+1;
                //bcz we know that mid+1 element
            }
        }
 //in the day,start ==end and positing to the largest number bcz of the 2 check above
     // start and end are always trying to find max element in the above 2 checks
  // hence,when they are pointing to just on element ,that is the max bcz that is what the chcek say
  //more elaboration:at every point of time for start and end,they have the best possible answer till that time
//and if we are saying only one item is remaining ,hence cuz  of above line that is the best possible ans
 return start;
    }
}
