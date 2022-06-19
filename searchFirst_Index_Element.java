public class searchFirst_Index_Element {
    static int search(int arr[],int index,int element){
if(index==arr.length){
return -1;
}

if(arr[index]==element){
    return index;
}
return search(arr,index+1,element);
    }
    public static void main(String[] args) {
       int arr[]={4,2,13,6,8,3,31,13,8,13}; 

       int res=search(arr,0,90);
       System.out.println(res);
  
    }
}