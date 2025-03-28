A celebrity is a person who is known to all but does not know anyone at a party.
  Input: mat[][] = [[1, 1, 0], [0, 1, 0], [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1st person. Therefore, 1 is the celebrity person. 

  class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++) st.add(i);
        while(st.size()>=2){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==1) //a know b
                st.push(b);
            else
                st.push(a);
        }
        int pcele=st.pop();
        boolean ok=true;
        for(int i=0;i<mat.length;i++){
            if(i!=pcele){
                if(mat[pcele][i]==1||mat[i][pcele]==0){         //check opposite conditions as if celebrity know any one or anyone does not celebrity then we false the value of ok 
                    ok=false;
                    break;
                }
            }
        }
        if(ok) return pcele;
        else return -1;
    }
}
