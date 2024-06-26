import java.util.Arrays;
public class maaax {

    static int maaax(int [] a){


        int maaax=a[0];

        for(int i=0;i<a.length-1;i++)
        {

            if(a[i]>a[maaax])
            {
                maaax=a[i];
            }

        }
        return a[maaax];
    }

    public static void main(String[] args)
    {
        int[]a={12,10,15,3,14,1};

        int result=maaax(a);

        System.out.println("maximum value in array "+ Arrays.toString(a)+ "is "+result);

    }

}
