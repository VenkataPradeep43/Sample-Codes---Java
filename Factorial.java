class Main {
    static int Factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++)
            res*=i;
        
        return res;
    }
    
    public static void main(String[] args) {
        int n=5;
        int result=Factorial(n);
        System.out.println(result);
    }
}

// Output:
// 120