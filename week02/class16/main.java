package week02.class16;

public class main {
    public static void main(String[] args) {
        String s="I@Love@Bangladesh.";
        String [] a=s.split("@");
        for(int i=0;i<a.length; i++){
            System.out.println(a[i]);
        }


        String s1="I@#Love@#Bangladesh.";
        String [] a1=s1.split("@");
        for(int i=0;i<a.length; i++){
            System.out.println(a1[i]);
        }


        String s2="I Love Bangladesh.";
        String [] a2=s2.split("\\s");
        for(int i=0;i<a.length; i++){
            System.out.println(a2[i]);
        }


        String s3="I       Love    Bangladesh.";
        String [] a3=s3.split("\\s+");
        for(int i=0;i<a.length; i++){
            System.out.println(a3[i]);
        }
    }
    
}
