class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0;i< nums.length;i++){
            arr[i]=nums[i];
        }
        int k = 0;
        for(int i=nums.length;i<nums.length*2;i++){
            arr[i]=nums[k];
            k++;
        }
        return arr;
    }
}
