class Solution {
    public String longestCommonPrefix(String[] strings) {
      
        if (strings == null || strings.length == 0) return "";
        for (int i = 0; i < strings[0].length(); i++){
            char c = strings[0].charAt(i);

            for (int j = 1; j < strings.length; j++) {
                if (i >= strings[j].length() || strings[j].charAt(i) != c){
                    return strings[0].substring(0, i);
                }
            }
        }
        return strings[0];  
    }
}