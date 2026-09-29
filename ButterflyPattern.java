public class ButterflyPattern {
    public static void main(String[] args){

        int n =4;

        for(int row=1;row<=n; row++){
            for(int col =1;col<=row; col++){
                System.out.print("* ");
            }

            for(int col =1; col<=(2*n-2*row); col++){
                System.out.print("  ");
            }
            for(int col =1;col<=row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
        //for inverted symmetrical half
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1; col++){
                System.out.print("* ");
            }
            for(int col=1;col<=(row-1)*2; col++){
                System.out.print("  ");
            }
            for(int col=1;col<=n-row+1; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
