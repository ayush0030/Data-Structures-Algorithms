import java.util.*;
class Main2{
    public static void main(String[] args){
        int[] arr={20,35,-15,7,55,1,-22};

        //After first cycle the array becomes this, as we have only swapped the largest element with last.
        // int[] arr={20,35,-15,7,-22,1,55};


        int last_unsorted_array=arr.length-1;

        for(int i=last_unsorted_array; i>0; i--){
            int largest=0;
            for(int j=1; j<=i; j++){
                if(arr[j]>arr[largest]){
                    largest=j;  
                }
            }
            System.out.println("The value of largest index is == "+largest);
            int temp=0;
            temp=arr[largest];

            
            arr[largest]=arr[i];
            // each time the last index gets decreased as in first cycle the largest is at the last already.


            arr[i]=temp;    
            System.out.println("arr[last_unsorted_array]== "+arr[i]);  
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}