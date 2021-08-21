class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> sol = new ArrayList<>();
        int n = matrix.length * matrix[0].length;
        int minr = 0, minc = 0, maxr = matrix.length-1, maxc = matrix[0].length-1;
        while(sol.size() < n) {
            for(int i = minr, j = minc;j <= maxc && sol.size() < n;j++) {
                sol.add(matrix[i][j]);
            }
            minr++;
            for(int i = minr, j = maxc;i <= maxr && sol.size() < n;i++) {
                sol.add(matrix[i][j]);
            }
            maxc--;
            for(int i = maxr, j = maxc;j >= minc && sol.size() < n;j--) {
                sol.add(matrix[i][j]);
            }
            maxr--;
            for(int i = maxr, j = minc;i >= minr && sol.size() < n;i--) {
                sol.add(matrix[i][j]);
            }
            minc++;
        }
        return sol;
    }
}
