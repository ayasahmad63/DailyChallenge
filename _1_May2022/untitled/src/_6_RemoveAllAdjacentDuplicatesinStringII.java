import java.util.Stack;

public class _6_RemoveAllAdjacentDuplicatesinStringII {


//    In This queue we stack of pair and check the peek count if it equal to k then pop out

//    Youtube :- https://youtu.be/w6LcypDgC4w

    class Solution {
        public String removeDuplicates(String s, int k) {

            Stack<Pair> str=new Stack<>();
            String ans="";
            str.push(new Pair(s.charAt(0),1));
            for(int i=1;i<s.length();i++){

                char c=s.charAt(i);


                if(str.size()>0 && str.peek().ch==c)
                {
                    Pair pa=str.peek();
                    pa.count=pa.count+1;
                    if(pa.count==k)
                    {
                        str.pop();
                    }
                }
                else
                {
                    str.push(new Pair(s.charAt(i),1));
                }


            }

            while(str.size()>0){
                Pair pq=str.pop();
                int n=pq.count;
                while(n>0){
                    ans=pq.ch+ans;
                    n--;
                }
            }
            return ans;
        }

        class Pair{
            char ch;
            int count;

            Pair(char ch,int count){
                this.ch=ch;
                this.count=count;
            }
        }


    }






}
