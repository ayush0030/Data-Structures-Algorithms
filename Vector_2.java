import java.util.*;
class Vector_2{
    public static void main(String args[]){
        List<String> ayush=new Vector<>();
        ayush.add("5");
        ayush.add("6");
        ayush.add(2, "Cat");
        System.out.println(ayush);
        Vector<String> animals = new Vector<>();
        animals.add("i am animal");
        animals.addAll(ayush);
        System.out.println(animals);
        System.out.println("Hi getting animals - get "+animals.get(2));
    }
}