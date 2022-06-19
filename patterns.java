/*
*
**
***
****
*****

*****
****
***
**
*

1
22
333
4444
55555

1
23
456
78910

A
AB
ABC
ABCD
ABCDE


A
BB
CCC
DDDD
EEEEE
 





 */

public class patterns {
    static void pattern1(int n) {
        if (n == 1) {
            System.out.print("*");
            return;
        }
        
        pattern1(n - 1);//this first prints first *
        System.out.println();
        print1(n);
    }

    static void print1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*" + " ");
        print1(n - 1);
    }

    public static void main(String[] args) {
        pattern1(2);

        // System.out.println((char)(0+65)); //to print A
    }
}
