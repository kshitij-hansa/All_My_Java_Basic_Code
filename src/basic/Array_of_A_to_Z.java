import java.util.*;
public class Array_of_A_to_Z {
    public static void main(String[] args) {
        // Making the Array
        String []alp={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for(int i=0; i<alp.length; i++){
            int Nterm = (int)(Math.random()*alp.length);
            String term2=alp[i];
            alp[i]=alp[Nterm];

            alp[Nterm]=term2;
        }

        for (String as:alp) {
            System.out.print(" "+as);
        }




//        char[] alp1={'A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//        for (int j=0;j<=alp1.length;j++){
//            int Nterm = (int)(Math.random()*alp1.length);
//            char term2=alp1[j];
//            alp1[j]=alp[Nterm];
//            alp1[Nterm]=term2;
//        }




//                char[] alp1={'A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//                int index = 0;
//                int x=1;
//                char[]shuffle=new char[26];
//                Random ran = new Random();
//
//                for(int i=0;i<=26;i++){
//                    index=ran.nextInt(27);
//                    shuffle[i]=alp1[index];
//                    alp1[index]=0;
//
//                    if(shuffle[i]!=0){
//                        System.out.println(shuffle[i]+" "+x);
//                    }
//                    else {
//                        i--;
//                    }
//                    x++;
//                }


    }
}
