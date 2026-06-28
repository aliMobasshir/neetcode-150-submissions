class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }
            else mp.put(nums[i],mp.get(nums[i]) + 1);
        }


 int[] ans = new int[k];

 for(int i = 0;i<k;i++){
    int max = Integer.MIN_VALUE;
    int maxKey = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
            maxKey = entry.getKey();
            }
            }
            ans[i] = maxKey;
            mp.remove(maxKey);
        }

        return ans;
    }
}
