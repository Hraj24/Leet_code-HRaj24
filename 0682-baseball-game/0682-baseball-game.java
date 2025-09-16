class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        int res=0;
        for(int i=0;i<operations.length;i++){
             
            if(!operations[i].equals("D") && !operations[i].equals("C") && !operations[i].equals("+")){
                st.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("D")){
                
                st.push(2*st.peek());
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                int n1=st.pop();
                int n2=st.peek();
                st.push(n1);
                st.push(n1+n2);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();

        }
        return res;
    }
}