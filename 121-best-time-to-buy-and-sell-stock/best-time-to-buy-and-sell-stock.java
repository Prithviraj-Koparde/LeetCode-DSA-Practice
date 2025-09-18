class Solution {
public int maxProfit(int[] prices) {
    int minimum = Integer.MAX_VALUE;
    int maxProfit = 0;

        for(int price: prices){             //this is for each loop 
         if(price<minimum){
             minimum = price;
         }else if(price - minimum > maxProfit){
             maxProfit = price - minimum;
            }
        
        }
        return maxProfit;
    }
}
    