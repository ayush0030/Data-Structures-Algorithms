class MergeSort{
  public static void merge(int[] arr, int p, int q, int r){
    int n1=q-p+1;
    int n2=r-1*(q+1)+1;

    int[] L= new int[n1];
    int[] M=new int[n2];

    for(int i=0;i<n1;i++){
      L[i]=arr[p+i];
    }
    for(int i=0;i<n2;i++){
      M[i]=arr[q+1+i];
    }

    int i=0;
    int j=0;
    int k=p;

    while(i<n1&&j<n2){
      if(L[i]<=M[j]){
        arr[k]=L[i];
        i++;
      }
      else{
        arr[k]=M[j];
        j++;
      }
      k++;  
    }
    while(i<n1){
      arr[k]=L[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k]=M[j];
      j++;
      k++;
    }
  }
  public static void merge_sort(int[] arr,int p, int r){
    if(p<r){
      int q=(p+r)/2;
      merge_sort(arr, p, q);
      merge_sort(arr, q+1, r);
      merge(arr,p,q,r);
    }
  }
  public static void main(String args[]){
    int[] arr={20,35,-15,7,55,1,-22};
    int r=arr.length-1;
    merge_sort(arr, 0, r);

    for(int i=0;i<arr.length;i++){
      System.out.print("Sorted Array is as follows \n"+arr[i]+"\n\n");
    }
  }


}