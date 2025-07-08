// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Prime {
    public static void main(String[] args) {
        int n=17;
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1) System.out.println(n+" is Not a Prime");
        else System.out.println(n+" is a Prime");
    }
}

// Output:
// 17 is a Prime