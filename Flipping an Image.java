class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flipped=new int[image.length][image.length];
        int reverse=0;
        for(int i=0;i<image.length;i++){
            reverse=image[i].length-1;
            for(int j=0;j<image[i].length;j++,reverse--){
                flipped[i][j]=image[i][reverse]==0?1:0;
            }
        }
        return flipped;
    }
}
