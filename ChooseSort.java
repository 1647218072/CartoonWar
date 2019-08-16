import java.util.*;
public class ChooseSort{
	public static void main(String[] args){
		int [] nums = {1,693,88,60,20};
		for(int i=0;i<nums.length-1;i++){
		    for(int j=i+1;j<nums.lenght;j++){
			if(nums[i] > nums[j]){
				int temp = nums[i];
				nums[i] = nums[j];
 				nums[j] = temp;
			}
		}
		}
	System.out.print(Arrays.toString(nums));
	}
	
}