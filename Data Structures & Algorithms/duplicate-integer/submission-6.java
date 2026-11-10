class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean answer = false;

        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int num: nums){
            if (hash.containsKey(num)){
                return true;
            } else{
                hash.put(num, 1);
            }
        }

        return false;
    }
}