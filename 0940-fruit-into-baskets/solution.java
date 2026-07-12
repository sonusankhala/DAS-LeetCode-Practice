class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0;
        int n=fruits.length;
        int maxlen=0;
        Map<Integer,Integer> map=new HashMap<>();
       // int i=1;
        while (r < n) {
            // 1. Add the current fruit at 'r' to the window
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            
            // 2. If we have more than 2 types of fruit, shrink from the left 'l'
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++; // Shrink window
            }
            
            // 3. Update the maximum window length
            maxlen = Math.max(maxlen, r - l + 1);
            
            // 4. Always move 'r' forward to explore the next element
            r++;
        }
        return maxlen;
        
    }
}
