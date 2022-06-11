package praktika2;

public class pr2_4 {
    public static void main(String[] args) {
    	int u = 12;
        int r = 5;        
        int mat[][] = new int[r][r];
        for (int i=0; i<r; i++)
        {
            for (int j=0; j<r; j++)
            {
                mat[i][j] = (int)((Math.random() * 20)-10);
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i=0; i<r-1; i++)
        {
            if (mat[i][i+1] < u && mat[i][i+1] >= 0)
            {
                u = mat[i][i+1];
            }
        }
        System.out.println(u);
    }
}
