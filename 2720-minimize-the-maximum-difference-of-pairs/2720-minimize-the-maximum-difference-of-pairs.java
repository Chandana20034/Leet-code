import java.util.*;

class Solution {
    public int countPairs(int[] nums, int diff) {
        int i = 0, cnt = 0, n = nums.length;
        while (i < n - 1) {
            if (nums[i + 1] - nums[i] <= diff) {
                cnt++;
                i++;
            }
            i++;
        }
        return cnt;
    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1] - nums[0];
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countPairs(nums, mid) >= p) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
