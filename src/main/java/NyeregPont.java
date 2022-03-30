
public class NyeregPont {
    public static void main(String args[])
    {
//Konstuktor létrehozása
        new NyeregPont();
    }
    public NyeregPont()
    {
//Mátrix megadása
        int[][] matrix = {{3, 3, 3}, {1, 1, 1}, {2, 1, 3}};
//Függvény hívása
        NyeregPontKereses(matrix);
    }
    //NyeregpontKereses függvény
    public void NyeregPontKereses(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            boolean NyeregPontLetezik= true;
            int minimum = matrix[i][0]; //beállítjuk az első elemet a minimumra
            int sorMinimumnakOszlopIndexe = 0;
//Megkeresi a minimumot a sorokban
            for(int j=1; j< matrix[0].length; j++)
            {
                if(matrix[i][j] < minimum)
                {
                    minimum = matrix[i][j];
                    sorMinimumnakOszlopIndexe = j;
                }
            }
//Megkeresi a maximumot az oszlopokban
            for (int j = 0; j < matrix.length; j++)
            {
                if(minimum < matrix[j][sorMinimumnakOszlopIndexe])
                {
//Ha az előbbi feltétel igaz lesz akkor nincs nyeregpont
                    NyeregPontLetezik = false;
                    break;
                }
            }
            if(NyeregPontLetezik)
            {
//Kiíratjuk a nyeregpontot
                System.out.println("A Nyeregpont értéke: "+minimum);
            }
        }
    }
}
