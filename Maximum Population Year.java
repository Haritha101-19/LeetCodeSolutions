class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2050-1950+1]; 
        
        for(int[] l : logs){
            years[l[0]-1950]+=1;
            years[l[1]-1950]-=1;
        }
        int max = years[0];
        int maxYear = 0;
        for(int i=1;i<years.length;i++){
            years[i] +=years[i-1];
            
            if(max < years[i]){
                max = years[i];
                maxYear = i;
            }
                
        }
        return maxYear + 1950;
    }
}
