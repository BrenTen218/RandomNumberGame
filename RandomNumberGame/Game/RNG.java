package Game;
import java.util.Random;

public class RNG 
{
    
    Random rand = new Random();
    int number = 0;

    public RNG()
    {

    }

    public int generator(int number)
    {
        int upperBound = 10;
        number = rand.nextInt(upperBound);

        return number;
    }

    
}
