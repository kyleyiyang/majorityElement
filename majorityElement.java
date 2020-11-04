class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = (int)Math.floor(nums.length/2);
        for (int i=0;i<nums.length; i++) {
            int count = map.getOrDefault(nums[i],0)+1;
            if (count>n) {
                return nums[i];
            }
            map.put(nums[i],count);
        }
        /*for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()>Math.floor(nums.length/2)) {
                return entry.getKey();
            }
        }*/
        return 0;
    }
}
