import java.util.*;
class Main{
    public static void main(String args[]){
        PriorityQueue<Integer> ayush=new PriorityQueue<>();
        ayush.add(51);
        ayush.add(41);
        ayush.add(31);
        ayush.add(21);
        ayush.add(11);
        System.out.println("Head of the priority queue is the min == "+ayush.peek());
        
        Iterator<Integer> itr= ayush.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}