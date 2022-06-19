/*
A
A B
A B C
A B C D
A B C D E
 */




public class Pattern6 {
    static void pattern(int n) {
        if (n == 1) {
            System.out.print((char)(65+0));
            return;
        }
        int k = n;
        pattern(n - 1);
        System.out.println();
        print(n, 0);
    }

    static void print(int n, int k) {
if(n==0){
    return;
}
System.out.print((char)(k+65)+" ");
print(n-1, k+1);
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
