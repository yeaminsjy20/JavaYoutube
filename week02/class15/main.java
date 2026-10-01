package week02.class15;

public class main {
    public static void main(String[] args) {
        char st[]= {'H','i'};
        System.out.println(st);

        String s1="Hi.I'm good.";
        String s2= new String("Bangladesh");
        System.out.println(s1+ " " +s2);

        String s="Dhaka, Bangladesh";
        int l=s.length();
        System.out.println(l);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(4));

        if(s1.equals(s2)){
            System.out.println("They are equal.");
        }else{
            System.out.println("Not equal.");
        }
    }
}
