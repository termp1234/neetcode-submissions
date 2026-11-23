class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_character = s.toCharArray();
        Arrays.sort(s_character);
        
        char[] t_character = t.toCharArray();
        Arrays.sort(t_character);

        if(s_character.length != t_character.length){
            return false;
        }

        for(int i = 0; i < s_character.length; i++){
            if (s_character[i] != t_character[i]){
                return false;
            }
        }
        
        return true;
    }
}
