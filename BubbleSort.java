public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={999999,2,445,35,3432,324};
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int t=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=t;
    }

   
}
