class Solution {
    public int myAtoi(String s) {
         s = s.trim();
        if (s == null || s.length() == 0) {
            return 0;
        }
       
        int maxV = Integer.MAX_VALUE;
        int minV = Integer.MIN_VALUE;
        int i = 0;
        int n = s.length();
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        System.out.println(s);
        long sum = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int res = s.charAt(i)-'0';
            sum = (sum * 10) + res;
            if(sign==-1){
             System.out.println(sum*sign);
            }
              
            if (sum * sign <= minV) {
                return minV;
            }
            if (sum *sign >= maxV) {
                return maxV;
            }
            i++;
        }
        System.out.println(sum);
        return (int) (sum * sign);
    }
}
