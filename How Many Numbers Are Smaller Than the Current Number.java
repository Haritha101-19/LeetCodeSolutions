class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] arr=new int[nums.length];
        for(int row=0;row<nums.length;row++){
            count=0;
            for(int col=0;col<nums.length;col++){
                if(nums[col]<nums[row]){
                    count+=1;
                }
                arr[row]=count;
            }
        }
        return arr;
    }
}
