public class pr2_3 {
    public static void main(String[] args) {
        int n=6, r=3, a=1;
        boolean f = false;
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j=0; j<n; j++)
            {
                mat[i][j] = (int)((Math.random() * 9) + 1);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++)
        {
            if(mat[r][i] > mat[r][i-1])
                f = true;
            else
            {
                f = false;
                System.out.println("0");
                break;
            }
        }
        if (f)
        {
            System.out.print("1");
        }
    }
}
