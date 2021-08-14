class Solution {
    int largest(int[] nums){
        if(nums.length==0)
            return -1;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie=largest(candies);
        Boolean[] list = new Boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>= maxCandie){
                list[i]= true;
            }else{
                list[i]= false;
            }
        }
        return Arrays.asList(list);
    }
}
