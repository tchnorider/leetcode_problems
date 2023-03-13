class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        nums1 = new int[ m + n];
        nums1Index = m + 1;

        for(int i = 0; i < n - 1; i++) {
            nums[nums1Index] = nums[i];
            nums1Index++;
        }
        nums1 = sortBubble(nums1);
    }

    public int[] sortBubble(int[] numberArray) {
        boolean done = false;
        while (!done) {
	
            done = true;
	          int itemsToBeSorted = numberArray.length - 1;
            for (int i = 0; i < itemsToBeSorted; i++) {
                if (numberArray[i] > numberArray[i + 1]) {
                    int smaller = numberArray[i + 1];
                    numberArray[i + 1] = numberArray[i];
                    numberArray[i] = smaller;
                    done = false;
		            }
            }
            itemsToBeSorted--;
        }
        return numberArray;
    }
}
