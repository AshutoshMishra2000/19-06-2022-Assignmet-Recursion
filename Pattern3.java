/*
1
22
333
4444
55555
 */

public class Pattern3 {
    static void pattern(int n) {
        if (n == 1) {
            System.out.print("1" + " ");
            return;
        }
        int k = n;
        pattern(n - 1);
        System.out.println();
        print(n, k);
    }

    static void print(int n, int k) {
if(n==0){
    return;
}
System.out.print(k+" ");
print(n-1, k);
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
