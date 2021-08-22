package Tanyc.Experiment.Experiment2;

public class hw7 {
    public static void main(String[] args) {
        int k = 1,i,j,l=0;
        for(i=0;i<=4;i++){
            for(j=i+1;j<=5;j++){
                if(i==0 && j==i+1){
                    l=k+i;
                    System.out.print(k);
                    System.out.print("  ");
                }
                else if(j==i+1)
                {
                   l= k=k+i;
                    System.out.print(k);
                    System.out.print("  ");
                }
                else{
                    l=l+j;
                    System.out.print(l);
                    System.out.print("  ");}
            }

            System.out.println("\n");

        }

    }
}