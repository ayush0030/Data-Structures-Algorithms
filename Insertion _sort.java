class Main{
    public static void main(String[] args){
        int[] arr={20,35,-15,7,55,1,-22};
        int firstunsortedindex=0;
        for(int i=firstunsortedindex;i<arr.length;i++){
            int new_element=arr[i];
            for(int j=i;j>0&&arr[j-1]>new_element;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr, int n, int m){
        int temp=0;
        temp=arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
}