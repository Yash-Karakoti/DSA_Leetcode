class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int ans = n+1, total = 0, left = 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        for(int right =0; right < n; right++){
            total += arr[right];
            while (total > target) total -= arr[left++];
            dp[right+1] = dp[right];
            if(total == target){
                ans = Math.min(ans, right - left + 1 + dp[left]);
                dp[right+1] = Math.min(dp[right+1], right - left +1);
            }
        }
        return ans == n+1 ? -1 : ans;
    }
}