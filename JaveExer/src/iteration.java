import java.util.*;
import java.lang.*;

public class iteration {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        int n ;
        n=reader.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(i );
            }
        }
    }
}

