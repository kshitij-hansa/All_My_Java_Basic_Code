package DSA;

public class Recursion {

    static int Power(int a, int b){
        if(b==0)return 1;
        return a*Power(a,b-1);
    }
    public static boolean pal(String s) {
        if (s == null) return false;
        if (s.length() <= 1) return true;
        String sf = s.substring(0, 1);
        String sl = s.substring(s.length() - 1, s.length());
        if (!sf.equals(sl)) return false;
        else {
            return pal(s.substring(1, s.length() - 1));
        }
    }
    public static int Sum(int a)
    {
        if(a==0)return 1;
        return a+Sum(a-1);
    }
    static int FastPower(int a,int b){
        if (b==0)return 1;
        if(b%2==0)return FastPower(a*a,b/2);
        return a*FastPower(a,b/2);
    }

    public static void main(String[] args) {
        // Sum of the N number-------------------------------
//        System.out.println(Sum(12));

        // Fast Power of the Number
//        System.out.println(FastPower(25,4));



    }
}
