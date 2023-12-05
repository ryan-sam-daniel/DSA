public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={1,2,445,35,3432,324};
        int target=0;
        if(LinearSearch(arr,target)==1){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }

    }

    private static int LinearSearch(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
}