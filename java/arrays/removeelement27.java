class Solution {
    public int removeElement(int[] nums, int val) {
        
        int n=nums.length;
        if(n==0)
        return 0;
        for(int i=0; i<n;i++){
            if(nums[i]==val){
                for(int j=n-1;j>=0;j--){
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i]=nums[j];
                        nums[j]=-1;
                        break;
                    }
                    if(j==i){
                        nums[i]=nums[j];
                        nums[j]=-1;
                        break;
                    }
                }
            }
        }
        int i;
        for(i=0; i<n && nums[i]!=-1  ;i++);
        return i;
    }
}
