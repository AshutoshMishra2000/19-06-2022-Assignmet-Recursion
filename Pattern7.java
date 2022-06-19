public class Pattern7 {
   
    static void pattern(int n) {
        if (n == 1) {
            System.out.print((char)(65+0));
            return;
        }
      
        pattern(n - 1);
        System.out.println();
        print(n, n-1);
    }

    static void print(int n, int k) {
if(n==0){
    return;
}
System.out.print((char)(k+65)+" ");
print(n-1, k);
    }

    public static void main(String[] args) {
        pattern(5);
        String str="abc";
        String str1=new String("abc");
        System.out.println(str.equals(str1));
        System.err.println(str==str1);
    }
}
