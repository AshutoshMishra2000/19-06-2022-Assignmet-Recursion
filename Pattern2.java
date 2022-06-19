/*
*****
****
***
**
*
 */


public class Pattern2 {
    static void pattern1(int n) {
        if (n == 1) {
            System.out.print("*");
            return;
        }
        print1(n);
        System.out.println();
        pattern1(n - 1);//this first prints first *
        
        
    }

    static void print1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*" + " ");
        print1(n - 1);
    }
    public static void main(String[] args) {
        pattern1(6);
    }
}
