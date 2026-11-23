class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> num_hash = new HashMap<>();

        for(int num: nums){
            num_hash.put(num, num_hash.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(num_hash.keySet());

        list.sort((a, b) -> Integer.compare(num_hash.get(b), num_hash.get(a)));

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
