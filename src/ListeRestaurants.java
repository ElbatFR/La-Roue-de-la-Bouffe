import java.util.Random;
import java.util.ArrayList;

public class ListeRestaurants {
    ArrayList Resaurants = new ArrayList();





    /**
     * Tire un nombre aleatoire entre min et mbdeproposition
     **/
    public static int leTirage(int max) {
        Random Rand = new Random();
        /** S'il y a qu'un restaurant on retourne 0 **/
        if (max == 1) {
            return 0;
        } else {
            /** Tirage entre 0 et max**/
            int aleatoire = Rand.nextInt(max);
            return aleatoire;
        }
    }
}

