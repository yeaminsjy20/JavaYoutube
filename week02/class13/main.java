package week02.class13;

public class main {
       public static void main(String[] args) {
        int a[]=new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;

        int x=a[0]+a[2];
        System.out.println("Value of x:" +x);

        a[2]=100;
        x=a[0]+a[2];
        System.out.println("Value of x:" +x);


        int b[] = {1,3,44,-4,5};
        System.out.println("Size of x:" +b.length);
        System.out.println("Value of index 0:" +b[0]);
        System.out.println("Value of index 3:" +b[3]);

        char arr[]= {'H','i'};
        System.out.println(arr);

    }
}
