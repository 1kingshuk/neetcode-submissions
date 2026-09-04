class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findLargestInPiles(piles);
        int k = 1;
        while(low<=high) {
            int mid = (high + low)/2;
            int totalTime = 0;
            for (int pile : piles) {
                if (pile<=mid) {
                    totalTime += 1;
                } else {
                    totalTime += (pile + mid - 1)/mid;
                }
            }
            if (totalTime<=h) {
                k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return k;
    }

    private int findLargestInPiles(int[] piles) {
        int largest = piles[0];
        for (int i=1; i<piles.length; i++) {
            if (piles[i]>largest) {
                largest = piles[i];
            }
        }
        return largest;
    }
}
