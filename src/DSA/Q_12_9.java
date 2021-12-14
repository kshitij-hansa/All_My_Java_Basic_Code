package DSA;

public class Q_12_9 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};

        int res=0;
        for (int i = 0; i <a.length ; i++) {
            res=res^a[i];
        }
        System.out.println(res);
    }
}
