class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hash = new HashMap<>();

        for(char c: s.toCharArray()){
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            if (hash.containsKey(c)){
                if (hash.get(c) == 0){
                    return false;
                }
                hash.put(c, hash.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
