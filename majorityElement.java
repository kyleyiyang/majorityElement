class Solution {
    public int majorityElement(int[] nums) {
        for (int i=0;i<nums.length; i++) {
            int count=0;
            for (int j=i;j<nums.length;j++) {
                if (nums[i]==nums[j]) {
                    count++;
                    if (count>Math.floor(nums.length/2)) {
                        return nums[i];
                    }
                }
            }
        }
        return 1;
    }
}//very slow

//still slow
class Solution {
    public int majorityElement(int[] nums) {
        var mySet = Set.of(nums);
        for (int[] a:mySet) {
            for (int i=0;i<a.length;i++){
                int count=0;
                for (int j=0;j<nums.length;j++) {
                    if (a[i]==nums[j]) {
                        count++;
                    }
                }
                if (count>Math.floor(nums.length/2)) {
                    return a[i];
                }
            }
            
        }
        return 0;
    }
}
