package com.adobe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	    List<List<Integer>> result = new ArrayList<>();
	    List<Integer> temp = new ArrayList<>();
	    helper(candidates, 0, target, 0, temp, result);
	    return result;
	}
	 
	private static void helper(int[] candidates, int start, int target, int sum,
	                    List<Integer> list, List<List<Integer>> result){
	    if(sum>target){
	        return;
	    }
	 
	    if(sum==target){
	        result.add(new ArrayList<>(list));
	        return;
	    }
	 
	    for(int i=start; i<candidates.length; i++){
	        list.add(candidates[i]);
	        helper(candidates, i, target, sum+candidates[i], list, result);
	        list.remove(list.size()-1);
	    }
	}
	

	public static void main(String[] args) {

	  int[] arr= {2,4,6};
	
	  
	List<List<Integer>> l1=	combinationSum(arr,6);
	System.out.println(l1);
	
	}

}
