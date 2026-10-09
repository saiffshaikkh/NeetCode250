class Solution {
    public int[] findBuildings(int[] heights) {
        int n = heights.length;
        List<Integer> list = new ArrayList<>();

        int maxHeight = 0;

        for(int i = n - 1; i >= 0; i--){
            if(heights[i] > maxHeight){
                list.add(i);
                maxHeight = heights[i];
            }
        }

        Collections.reverse(list);

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}