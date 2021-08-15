class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int flag=0;
        if(ruleKey.equals("color")){
            flag=1;
        }else if(ruleKey.equals("name")){
            flag=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(flag).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
