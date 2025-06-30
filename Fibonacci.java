
class Main {
    static void fibonaci(int n){
        int n1=0,n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=3;i<=n;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
    public static void main(String[] args) {
        int n=10;
        fibonaci(n);
    }
}

// Output:
// 0
// 1
// 1
// 2
// 3
// 5
// 8
// 13
// 21
// 34
