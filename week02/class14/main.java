package week02.class14;

public class main {
    public static void main(String[] args) {
        int a[][]={{10,20,30},
                    {40,50,60}};
        int sum=0;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sum=sum+a[i][j];
            }
            
        }  
        System.out.println("Value of average:" +sum/6);     
    }
    
}
