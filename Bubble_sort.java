import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr={20,35,-15,7,55,1,-22};
        int last_unsorted_array=arr.length-1;

        for(int i=last_unsorted_array;i>0;i--){  //Decreasing the array size after each cycle as we have largest at last after first cycle
            for(int j=0;j<last_unsorted_array;j++){
                if(arr[j]>arr[j+1]){
                    // Swapping when condition true
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}