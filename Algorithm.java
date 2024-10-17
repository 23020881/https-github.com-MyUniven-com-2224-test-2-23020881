/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algorithm;

/**
 *
 * @author Sdala
 */
public class algorithm {
    public static int findProductIndex(int[] array, int target) {
        int low = 0;
        int high = productIDs.length - 1;

        while (low <= high) {
            int mid = low + (high- low) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

           
            if (productIDs[low] <= productIDs[mid]) {
                if (productIDs[low] <= target&& target< productIDs[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
        
            else {
        
                if (productIDs[mid] < target&& target<= productIDs[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[]productIDs = {104, 105, 106, 107, 101, 102, 103};
        int target = 102;
        int index = findProductIndex(productIDs, target);
        System.out.println("productIDs" + target + " found at index " + index);
    }
}

