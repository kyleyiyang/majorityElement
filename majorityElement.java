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

//  quick sort
class Solution {
    public int majorityElement(int[] nums) {
        System.out.println(nums.length);
        sort(nums,0,nums.length-1);
        for (int i=0;i<nums.length; i++) {
            System.out.println(nums[i]);
            int count=1;
            while (i<nums.length-1 && nums[i]==nums[i+1]) {
                count++;
                i++;
            }
            System.out.println("count="+count);
            if (count>Math.floor(nums.length/2)) {
                return nums[i];
            }
        }
        return 0;
    }
    public static void sort(int[] arr, int p, int q) {
        if (p<q) {
            int k = arr[q];
            int j = q;
            for (int i=q-1; i>=0; i--) {
                if (arr[i]>k) {
                    arr[j]=arr[i];
                    j=i;
                }
            }
            arr[j]=k;
            sort(arr, j+1, q);
            sort(arr, p, j-1);
        }
    }
}

