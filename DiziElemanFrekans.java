import java.util.Arrays;

public class DiziElemanFrekans {

    static boolean isChosen(int[]arr, int value, int deger)
    {
        for (int i=0; i<value; i++)
        {
            if (arr[i] == deger) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] liste = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0;

        for(int i = 0; i < liste.length; i++)
        {
            for(int j = 0; j < liste.length; j++)
            {
                if (i != j && liste[i] == liste[j])
                {
                    count++;
                }

                }
            if(!isChosen(liste, i, liste[i])) System.out.println(liste[i] + " sayisi " + (count +1) + " kere tekrar edildi");
            count = 0;

            }
        }
    }



