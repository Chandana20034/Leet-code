class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int longest = 0;
        for(int num: set) {
            if (!set.contains(num - 1)) {
                int j = num;
                while(set.contains(j)) {
                    j++;
                }
                longest = Math.max(longest, j - num);
            }
        }
        return longest;
    }
}