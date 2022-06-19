/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15 
 */


public class Patter5{
    static int a=1;
    static void pattern(int n) {
        if (n == 1) {
            System.out.print("1" + " ");
            return;
        }
       
        pattern(n - 1);
        System.out.println();
        print(n);
    }

    static void print(int n) {
if(n==0){
    return;
}
System.out.print((++a)+" ");
print(n-1);
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
