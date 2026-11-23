class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max_length = 1;
        HashMap<Integer, Integer> nums_hash = new HashMap<>();

        for(int num: nums){
            nums_hash.put(num, nums_hash.getOrDefault(num, 0)+ 1);
        }

        List<Integer> list = new ArrayList<>(nums_hash.keySet());
        list.sort(null);

        int prevNum = list.get(0);
        int conNum = 1;
        for(int i = 1; i < list.size(); i++){
            if (list.get(i) == prevNum + 1){
                conNum += 1;
            } else {
                conNum = 1;
            }

            prevNum = list.get(i);
            max_length = Math.max(max_length, conNum);
        }

        return max_length;
    }
}
