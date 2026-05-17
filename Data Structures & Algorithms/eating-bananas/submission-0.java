class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int p : piles){
            right = Math.max(p, right);
        }

        while(left < right){
            int mid = left + (right - left)/2;
            long hours = calculateHours(piles, mid);
            if(hours <= h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    private long calculateHours(int[] piles, int k){
        long totalHours = 0;
        for(int p : piles){
            totalHours += (p + k - 1)/k;
        }
        return totalHours;
    }
}
