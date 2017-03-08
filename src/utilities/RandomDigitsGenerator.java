package utilities;

/**
 * Created by vs on 08.03.17.
 */
public class RandomDigitsGenerator {

    static int generator (int min, int max){

        return (int)Math.random()*max + min;
    }

}
