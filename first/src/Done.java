import java.util.Arrays;

public class Done {
    public static void main(String[] args) {

        int rg[] = new int[5];

        rg[0]=23;
        rg[1]=45;
        rg[2]=32;
        rg[3]=66;
        rg[4]=78;

         int ab = rg.length;
        {
            System.out.println(ab);
            System.out.println(rg[rg.length-1]);
            System.out.println(rg[rg.length-1]/2);
        }

        for(int r=0;r<=4;r++)
        {
            System.out.print(rg[r]);

        }

    }
}
