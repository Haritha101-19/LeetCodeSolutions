class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
   if (Arrays.deepEquals(mat, target))
   	return true;
   for (var i = 0; i < 3; i++) {
   	rotate(mat);
   	if (Arrays.deepEquals(mat, target))
   		return true;
   }
   return false;
}

private void rotate(int[][] mat) {
   // reverse the rows
   for (int start = 0, end = mat.length - 1; start < end; start++, end--) {
   	var row = mat[start];
   	mat[start] = mat[end];
   	mat[end] = row;
   }
   // transpose
   for (var i = 0; i < mat.length; i++)
   	for (var j = i + 1; j < mat[0].length; j++) {
   		var temp = mat[i][j];
   		mat[i][j] = mat[j][i];
   		mat[j][i] = temp;
   	}
}
}
