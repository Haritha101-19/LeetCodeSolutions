class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<k){
            k=k%nums.length;
        }
        int[] dup=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dup[i]=nums[i];
        }
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[index]=nums[i];
            index++;
        }
        for(int i=0;i<dup.length-k;i++){
            nums[index]=dup[i];
            index++;
        }
    }
}
