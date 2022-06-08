package com.company;

import javax.swing.*;
// will code later
public class SmallestLetter {
    public static void main(String[] args) {

    }
    static int smallestNumber(char []letters,int target){
        int start=0;
        int end=letters.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (letters[mid]<target){
                start=mid+1;
            }else if (letters[mid]>target){
                end=mid-1;
            }

        }
        return letters[start%letters.length];
    }
}
