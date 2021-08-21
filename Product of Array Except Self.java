class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int mul=1;
        res[0]=1;
        if(nums == null || nums.length == 1){
            return nums;
        }
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        for(int j=nums.length-1;j>=0;j--){
            res[j]=res[j]*mul;
            mul=mul*nums[j];
        }
        return res;
    }
}
