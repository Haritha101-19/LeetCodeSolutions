class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> res=new ArrayList<Integer>();
        int[] min=new int[m];
        int[] max=new int[n];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                min[i]=Math.min(min[i],matrix[i][j]);
                max[j]=Math.max(max[j],matrix[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(min[i]==max[j]){
                    res.add(min[i]);
                    return res;
                }
            }
        }
        return res;
    }
}
