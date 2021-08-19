class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n==1){
            arr[0]=0;
        }
        int left=0;
        int right=n-1;
        while(left<=right){
            arr[left]=n-1;
            arr[right]=-(n-1);
            n=n-2;
            left++;
            right--;
        }
        return arr;
    }
}
