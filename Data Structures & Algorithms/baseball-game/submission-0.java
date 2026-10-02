class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for(String str : operations){
            if(str.equals("+")){
                int v1 = st.pop();
                int v2 = st.peek();
                st.push(v1);
                st.push(v1+v2);
            }else if(str.equals("D")){
                st.push(2*st.peek());
            }else if(str.equals("C")){
                st.pop();
            }else st.push(Integer.parseInt(str));
        }
        for(int score : st) sum += score;
        return sum;
    }
}