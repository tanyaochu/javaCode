package Tanyc.Grammar;

public class WhileStatement1 {
    public static void main(String[] args) {
                                  //计算斐波那契数列的前16项
        final int MAX=17;
        int i=0,j=1,k=1;
        while (k<MAX){
            System.out.print(" "+i+" "+j);
            i=i+j;
            j=i+j;
            k+=2;
        }
}
}
