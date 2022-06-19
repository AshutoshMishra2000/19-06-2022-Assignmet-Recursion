/*
5 5 5 5 5 
4 4 4 4
3 3 3
2 2
1
 */




public class Pattern4 {
    static void pattern(int n) {
        if (n == 1) {
            System.out.print("1" + " ");
            return;
        }
        int k = n;
        
        print(n, k);
        System.out.println();
        pattern(n - 1);
       
        
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
