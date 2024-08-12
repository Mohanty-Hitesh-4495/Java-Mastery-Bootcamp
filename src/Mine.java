import java.util.Random;
import java.util.Scanner;

class Matrix
{
    public static int[][] RandomMatrixGenerator(int mine, int row, int col)
    {
        int [][]mtx = new int[row][col];
        Random rndm = new Random();
        for(int i = 0; i < mine; i++)
        {
            int rowIndex,colIndex;

            do{
                rowIndex = rndm.nextInt(row);
                colIndex = rndm.nextInt(col);

            }while((mtx[rowIndex][colIndex] == -1));

            mtx[rowIndex][colIndex] = -1;

        }
        return mtx;
    }

    public static int[][] setValue(int[][] mtx)
    {
        int row = mtx.length,col = mtx[0].length;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {

                if(!(i - 1 < 0 || j - 1 < 0 || mtx[i][j] == -1))
                    if(mtx[i-1][j-1] == -1)
                        mtx[i][j]++;

                if(!(j - 1 < 0 || mtx[i][j] == -1) )
                    if(mtx[i][j-1] == -1)
                        mtx[i][j]++;

                if(!(j - 1 < 0 || i + 1 > row-1 || mtx[i][j] == -1))
                    if(mtx[i+1][j-1] == -1)
                        mtx[i][j]++;

                if(!(i + 1 > row-1 || mtx[i][j] == -1))
                    if(mtx[i+1][j] == -1)
                        mtx[i][j]++;

                if(!(i + 1 > row-1 || j + 1 > col - 1 || mtx[i][j] == -1))
                    if(mtx[i+1][j+1] == -1)
                        mtx[i][j]++;

                if(!( j + 1 > col - 1 || mtx[i][j] == -1))
                    if(mtx[i][j+1] == -1)
                        mtx[i][j]++;

                if(!(i - 1 < 0 || j + 1 > col - 1 || mtx[i][j] == -1))
                    if(mtx[i-1][j+1] == -1)
                        mtx[i][j]++;

                if(!(i - 1 < 0 || mtx[i][j] == -1))
                    if(mtx[i-1][j] == -1)
                        mtx[i][j]++;
            }
        }
        return mtx;
    }

    public static void mattrixPrint(int[][] mtx)
    {
        int row = mtx.length,col = mtx[0].length;
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(mtx[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}

public class Mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.print("Row : ");
        int row = sc.nextInt();
        System.out.print("column : ");
        int col = sc.nextInt();
        System.out.print("Mine : ");
        int mine = sc.nextInt();
        sc.close();
        if(row*col < mine)
        {
            System.out.println("Mine must be less than ROW x COLUMN = "+((row*col)+1));
        }
        else
        {
            System.out.println();
            int[][] mtx = Matrix.RandomMatrixGenerator(mine, row, col);
            Matrix.setValue(mtx);
            Matrix.mattrixPrint(mtx);
        }
    }
}