class Solution {
	    public void sortColors(int[] nums) {
	    	
	    	int l=0;
	    	int r=nums.length-1; 
	    	int curr =0;
	    	
	    	while (curr<=r) {
	    		
	    		if (nums[curr] == 0 && curr>=l) {
	    			
	    			swap(nums, l, curr);
	    			l++;
	    			
	    		}else if (nums[curr] == 2 && curr<r) {
	    			
	    			swap(nums, r, curr);
	    			r--;
	    			continue;
	    		}
	    		curr++;
	    	}
	        
	    }

		private void swap(int[] nums, int l, int curr) {
			int temp = nums[l];
			nums[l] = nums[curr];
			nums[curr] = temp;
		}
	}