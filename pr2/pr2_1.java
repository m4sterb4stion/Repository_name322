import java.util.Scanner;

public class pr2_1 {
    public static void main(String[] args) {
        int r = 10;
        int arr[] = new int[r];       
        int f=0;
        byte a=10, b=0;
        
        for (int i=0; i<r; i++)
        {
            arr[i] = (int) ((Math.random() * 10) + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int k=1; k<=a; k++) 
        {
            for (int i=0; i<r; i++)
            {
                if (k == arr[i]) 
                {
                    b++;
                    f = i+1;
                }
            }
            if (b == 1)
            {
                System.out.println(k + " pod nomerom " + f + " v matrice");
            }
                b = 0;
                f = 0;
        }
    }
}
