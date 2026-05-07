class Solution {
    int MOD = 1_000_000_007;
    public int distinctSubseqII(String s) {

        int MOD = 1_000_000_007;
        int n = s.length();
        
        // dp[i] = number of distinct subsequences using the first i characters
        // We use long to prevent overflow during intermediate calculations
        long[] dp = new long[n + 1];
        dp[0] = 1; // Base case: the empty subsequence ""
        
        // last[char] stores the last index (1-based) where char appeared
        int[] last = new int[26];
        java.util.Arrays.fill(last, -1);
        
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            int charIdx = c - 'a';
            
            // Standard case: double the count
            dp[i] = (dp[i - 1] * 2) % MOD;
            
            // If this character appeared before, subtract duplicates
            if (last[charIdx] != -1) {
                dp[i] = (dp[i] - dp[last[charIdx] - 1] + MOD) % MOD;
            }
            
            // Update last seen position
            last[charIdx] = i;
        }
        
        // Subtract 1 to remove the empty subsequence ""
        return (int) (dp[n] - 1 + MOD) % MOD;

        /*
        List<String> list = new ArrayList<>();
        solveRec(s, 0, new StringBuilder(), list);
        return list.size() % MOD;

        */
        
        /* Set<List<Character>> root=new HashSet<>();
        List<Character> child=new ArrayList<>();
        countSub(s,0,root,child);

        return (root.size())% MOD;
        */
    }

    /*public void countSub(String s, int i, Set<List<Character>> root, List<Character> child){
        if(i>=s.length()){
            if(child.size()!=0){
               root.add(child);
            }
            return;
        }
       // if(i)
      child.add(s.charAt(i));
      countSub(s,i+1, root,child);
      child.remove(child.size()-1);
      countSub(s,i+1,root,child);
        
    }*/
    private void solveRec(String s, int idx, StringBuilder sb, List<String> list) {
        // Base Case
        if (idx >= s.length()) {
            if (sb.toString().length() != 0) {
                if (list.contains(sb.toString())) {
                    return;
                }
                list.add(sb.toString());
            }
            return;
        }

        // take it
        sb.append(s.charAt(idx));
        solveRec(s, idx + 1, sb, list);
        sb.deleteCharAt(sb.length() - 1);

        // nontake
        solveRec(s, idx + 1, sb, list);
    }


}
