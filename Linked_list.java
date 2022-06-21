class LinkedList{
    Node head;

    static class Node{
        int value;
        Node next;
        Node(int d){
            value=d;
            next=null;
        }
    }

    public static void main(String args[]) {
        
        LinkedList list= new LinkedList();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        list.head.next=second;
        second.next=third;

        while(list.head!=null){
            System.out.println(list.head.value);
            list.head=list.head.next;
        }
    }
}