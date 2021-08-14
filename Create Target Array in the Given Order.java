class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr=new int[nums.length];
        List<Integer> n=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            n.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            arr[i]=n.get(i);
        }
        return arr;
    }
}
