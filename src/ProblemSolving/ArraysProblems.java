package ProblemSolving;

import java.util.Arrays;

public class ArraysProblems {

	public static void MaxMin (int [] arr) {
		int max =arr[0];
		int min =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println("max ="+max+"min ="+min);
	}
	
	
	
	 public static int[] sortArray(int[] nums) {
	        int temp ;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]>nums[j]){
	                    temp = nums[i];
	                    nums[i]=nums[j];
	                    nums[j]=temp;
	                }
	            }
	        }

	        return nums;
	    }
	 
	 public static void mergeArr(int[]arr1,int[]arr2) {
		 int length=arr1.length+arr2.length;
		 
		 int[]merge =new int[length];
		 
		 for(int i=0;i<arr1.length;i++) {
			 merge[i]=arr1[i];
		 }
		 for(int i=arr1.length;i<merge.length;i++) {
			 merge[i]=arr2[i];
		 }
		 
		 System.out.println(Arrays.toString(merge));
		 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]arr = {1,0,0,4,2,6,2,9};
		int[]arr1 = {2,3,4,5,6};
//		MaxMin(arr);
//		System.out.println(Arrays.toString(sortArray(arr)));
		mergeArr(arr,arr1);

}
}
