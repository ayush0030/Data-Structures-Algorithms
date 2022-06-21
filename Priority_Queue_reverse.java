import java.util.*;
class Main{
    public static void main(String[] args){
        PriorityQueue<Integer> ayush=new PriorityQueue<>(new customComparator());
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        System.out.print("PriorityQueue: " + numbers);

    }
    class customComparator implements Comparator<Integer>{
        @Override
        public int comapare(Integer number1, Integer number2){
            int value=number1.compareTo(number2);
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }        }

    }
}