class Solution {
    public int mySqrt(int x) {
        long left = 0, right = x/2;

        if(x < 2) return x;

        while(left <= right){
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            
            if(sq == x) return (int)mid;
            else if(x > sq) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
}