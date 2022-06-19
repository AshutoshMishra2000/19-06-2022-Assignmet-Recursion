public class allOccurances {
    static void allOccurance(int arr[], int index, int k) {
        if ((index == arr.length - 1) && (arr[index] != k)) {

            return;
        }
        if ((index == arr.length - 1) && (arr[index] == k)) {
            System.out.print(index+" ");
            return;
        }
        if (arr[index] == k) {
            System.out.print(index+", ");
        }

        allOccurance(arr, index+1, k);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 13, 6, 8, 3, 31, 13, 8, 13 };
        allOccurance(arr, 0, 13);
    }
}
