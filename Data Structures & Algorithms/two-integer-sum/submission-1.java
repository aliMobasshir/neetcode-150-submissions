class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i = 0;i < nums.length ; i++){
            int partner = target - nums[i];

            if(mp.containsKey(partner)){
                return new int[] { mp.get(partner),i};
            } else {
                mp.put(nums[i],i);
            }
        }
        return new int[] {};
    }
}
