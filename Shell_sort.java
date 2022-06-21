class Main{
    public static void main(String args[]){
        int[] arr={20,35,-15,7,55,1,-22};
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int new_element=arr[i];
                int j=i;

                 while(j>=gap && arr[j-gap]>new_element){
                    arr[j]=arr[j-gap];
                    j-=gap;                
                }
            arr[j]=new_element;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}