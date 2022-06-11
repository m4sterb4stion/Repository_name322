package praktika2;

public class pr2_2 {
    public static void main(String[] args) {
        int r=10, j=0;
        int c[] = new int[r];
        int x[] = new int[r];
        System.out.println("massiv do: ");
        for (int i=0; i<r; i++)
        {
            c[i] = (int) (Math.random() * 10);
            System.out.print(c[i] + " ");
        }
        System.out.println();
            for (int i=0; i<r; i++) 
            {
                if (c[i] !=0)
                {
                    x[j] = c[i] * 4;
                    j++;
                }
            }
            System.out.println("massiv posle: ");
            for (int i=0; i<j; i++)
            	
            System.out.print(x[i] + " ");
    }
}