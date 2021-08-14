class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++){
            arr[index]=nums[i];
            arr[index+1]=nums[n+i];
            index+=2;
        }
        return arr;
    }
}
