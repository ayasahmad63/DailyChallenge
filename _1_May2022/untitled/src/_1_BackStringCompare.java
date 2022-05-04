import java.util.Stack;

public class _1_BackStringCompare {

//    https://leetcode.com/problems/backspace-string-compare/

//     In this we use two stack and push the word in it and pop only when "#" occurs





    class Solution {
        public boolean backspaceCompare(String s, String t) {
            Stack<Character> str1=new Stack<>();
            Stack<Character> str2=new Stack<>();

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='#'){
                    str1.push(s.charAt(i));
                }else{
                    if(str1.size()>0){
                        str1.pop();}
                }
            }

            for(int i=0;i<t.length();i++){
                if(t.charAt(i)!='#'){
                    str2.push(t.charAt(i));
                }else{
                    if(str2.size()>0){
                        str2.pop();}
                }
            }

            if(str1.size()!=str2.size()){
                return false;
            }else{
                while(str1.size()>0){
                    char fi=str1.pop();
                    char se=str2.pop();
                    if(fi!=se)return false;
                }

            }

            return true;

        }
    }








}
