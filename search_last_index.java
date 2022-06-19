public class search_last_index {
    static int searchlast(int arr[],int start,int end,int k){
if(start<end){
    return -1;
}
if(arr[start]==k){
return start;
}
return searchlast(arr, start-1, end,k);
    }
    public static void main(String[] args) {
        int arr[]={4,2,13,6,8,3,31,13,8,13}; 
        int a=searchlast(arr, arr.length-1, 0,8);
        System.out.println("Index is :"+a);

    }
}
