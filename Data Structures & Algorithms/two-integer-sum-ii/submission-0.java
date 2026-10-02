class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int k = 0;
        int[] ans = new int[2];
        while(i < j){  
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                ans[k] = i + 1;
                ans[k + 1] = j + 1;
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}
