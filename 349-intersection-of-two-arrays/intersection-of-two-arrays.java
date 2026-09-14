class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1 = new HashSet<>();

        for(int nums :nums1){
            set1.add(nums);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int nums : nums2){
            if(set1.contains(nums)){
                result.add(nums);
            }

        }

        int[] ans = new int[result.size()];

        int i = 0 ;
        for(int nums: result){
            ans[i++] = nums;
        }
        return ans;

        
    }
}