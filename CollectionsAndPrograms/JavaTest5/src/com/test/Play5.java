package com.test;
import java.util.*;

public class Play5 {

    public static void main(String[] args) throws Exception {
    	
//    	int[] nums = {-1,0,1,2,-1,-4};
//    	int target = 0;
//    	Arrays.sort(nums);	// {-4,-1,-1,0,1,2}
//    	//Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
//    	
//    	int l=0;
//    	int r=nums.length-1;
//    	int twoSum = 0;
//    	while(l<r) {
//    		twoSum = nums[l] + nums[r];
//    		//System.out.println(twoSum);
//    		for(int i=0;i<nums.length;i++) {
//    			if(i!=l && i!=r)
//    			if((twoSum+nums[i])==target) {
//    				System.out.print("["+nums[l]+","+nums[r]+","+nums[i]+"]");
//    			}
//    		}System.out.println();
//    		l++;
//    		r--;
//    	}
    	int[] nums = {1,2,1,3,5,6,4};
    
    	findMatch(nums,1,nums.length-1);
    	
    	
    	
    }
    
    public static void findMatch(int[] nums,int l,int r) {
    	int len = nums.length;
    	int m = len/2;
    	while(l<r) {
    		if(nums[l]>nums[l+1] && nums[l]>nums[l-1]) {
    			System.out.println("index of occurance is= "+l);
    			break;
    		}
    		l++;
    		findMatch(nums, l, m);
    		findMatch(nums, m, r);
    	}
    }
	
}
