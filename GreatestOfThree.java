
class GreatestOfThree {
    public static void main(String[] args) {
        int a=20;
        int b=23;
        int c=17;
        System.out.println("A = "+a+" "+"B = "+b+" "+"C = "+c);
        if(a>b && a>c) System.out.println("A is Greater");
        else if(b>a && b>c) System.out.println("B is Greater");
        else System.out.println("C is Greater");
    }
}

// Output:
// A = 20 B = 23 C = 17
// B is Greater
