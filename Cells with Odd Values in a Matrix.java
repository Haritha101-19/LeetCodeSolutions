class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr=new int[m][n];
        for(int k=0;k<indices.length;k++){
            int[] index=indices[k];
            int x=index[0];
            int y=index[1];
            for(int i=0;i<arr[x].length;i++){
                arr[x][i]++;
            }
            for(int j=0;j<arr.length;j++){
                arr[j][y]++;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
