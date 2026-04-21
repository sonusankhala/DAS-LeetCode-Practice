class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int k=0;
        for(int j=1;j<prices.length;j++){
            if(prices[k]<prices[j]){
                i+=prices[j]-prices[k];
            }
            k++;
        }
        return i;
    }
}
