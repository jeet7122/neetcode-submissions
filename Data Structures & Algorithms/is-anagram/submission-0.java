class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if (map.containsKey(c)){
                map.replace(c, map.get(c), map.get(c) + 1);
            }else map.put(c, 0);
        }
        for(char c : t.toCharArray()){
            if (map.containsKey(c) && map.get(c) != 0){
                map.replace(c, map.get(c), map.get(c) - 1);
            } else if (map.containsKey(c) && map.get(c) == 0) {
                map.remove(c);
            }
            else map.put(c, 0);
        }
        return map.isEmpty();
    }
}
