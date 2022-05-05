import java.util.ArrayDeque;
import java.util.Queue;

public class _5_ImplementStackUsingQueue {


// Using Two Queue



    class MyStack {

        Queue<Integer> mainqueue;
        Queue<Integer> helperqueue;


        public MyStack() {
            mainqueue=new ArrayDeque<>();
            helperqueue= new ArrayDeque<>();
        }

        public void push(int x) {
            mainqueue.add(x);
        }

        public int pop() {
            if(mainqueue.size()==0){
                return -1;
            }
            while(mainqueue.size()!=1)
            {
                helperqueue.add(mainqueue.remove());
            }

            while(helperqueue.size()>0){
                mainqueue.add(helperqueue.remove());
            }
            return mainqueue.remove();

        }

        public int top() {
            if(mainqueue.size()==0){
                return -1;
            }int ans=0;
            while(mainqueue.size()>0){
                if(mainqueue.size()==1){
                    ans=mainqueue.peek();
                }
                helperqueue.add(mainqueue.remove());
            }

            while(helperqueue.size()>0){
                mainqueue.add(helperqueue.remove());
            }
            return ans;
        }

        public boolean empty() {
            if(mainqueue.size()>0){
                return false;}

            return true;
        }
    }









//   USing Only One Queue


    class MyStack2 {

        Queue<Integer> mainqueue;

        public MyStack2() {
            mainqueue=new ArrayDeque<>();

        }

        public void push(int x) {
            mainqueue.add(x);
        }

        public int pop() {
            if(mainqueue.size()==0){
                return -1;
            }
            int k=mainqueue.size();
            while(k!=1){
                mainqueue.add(mainqueue.remove());
                k--;
            }
            return mainqueue.remove();
        }

        public int top() {
            if(mainqueue.size()==0)
            {    return -1;
            }
            int k=mainqueue.size();
            int ans=0;
            while(k>0){
                if(k==1){
                    ans=mainqueue.peek();
                }
                mainqueue.add(mainqueue.remove());
                k--;
            }
            return ans;
        }

        public boolean empty() {
            if(mainqueue.size()>0){
                return false;
            }
            return true;
        }
    }











}
