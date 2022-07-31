import java.util.*;

public class DiziTekrarEdenEleman {
    static boolean isChosen(int[]arr, int value)
    {
        for (int i: arr)
        {
            if ( i == value) return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] liste = {3, 7, 3, 7, 2, 9, 7, 9, 2, 20, 1, 31, 1, 31};
        int startIndex = 0;
        int[] duplicate = new int[liste.length];

        for(int i = 0; i < liste.length; i++)
        {
            for(int j = 0; j < liste.length; j++)
            {
                if (i != j && liste[i] == liste[j])
                {
                    if(!isChosen(duplicate, liste[i])) {
                        duplicate[startIndex++] = liste[i];

                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }


}
