import java.util.*;
class Main{
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(123);
        list.add(1234);
        list.add(999523559);
        list.add(123456);
        list.add(1234567);
        list.add(12345678);
        list.add(123456789);
        // list.clear();
        
        System.out.println("list.contains == "+list.contains(12345));
        System.out.println("list.get == "+list.get(4));

        // Inbuild  method for sorting the array list
        Collections.sort(list);


        Iterator itr= list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int foreach:list){
            System.out.println("using for each loop = "+foreach);
        }
    }
}