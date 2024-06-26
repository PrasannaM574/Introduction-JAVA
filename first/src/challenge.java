import java.util.Scanner;

public class challenge {

    public void rate(int a)
    {
        if(a%2==0)
        {
            System.out.println("Even no");
        }
        else {
            System.out.println("-----");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        challenge a= new challenge();
        a.rate(number);

    }
}
