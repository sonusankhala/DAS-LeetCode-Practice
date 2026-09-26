class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for (int num : nums1) {
            freq[num] = 1;
        }

        int count = 0;
        for (int num : nums2) {
            if (freq[num] == 1) {
                freq[num] = 2; // Mark as found match
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i <= 1000; i++) {
            if (freq[i] == 2) {
                result[index++] = i;
            }
        }
        return result;
        
    }
}
