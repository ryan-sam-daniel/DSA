public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,445,35,3432,324};
        int target=0;
        int start=0;
        int end=arr.length-1;
        if(BinarySearch(arr,target,start,end)==1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }

    private static int BinarySearch(int[] arr, int target, int start, int end) {
        while(start<end){
        int mid=(start+end)/2;
        if (arr[mid]==target){
            return 1;}
        else if (arr[mid]>target) {
            return BinarySearch(arr, target, start, mid);
        }
        else if (arr[mid]<target) {
            return BinarySearch(arr, target, mid+1, end);}
        }
        return -1;
    }
}