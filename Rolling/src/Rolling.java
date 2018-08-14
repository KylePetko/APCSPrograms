
import java.util.Random;

public class Rolling {

    private int numSides;

    public Rolling(int s){
        numSides = s;
    }

    public void rollEm(){
        int r1, r2, r3, count = 0;

        Random rand = new Random();

        r1 = rand.nextInt(numSides) +1;
        r2 = rand.nextInt(numSides) +1;
        r3 = rand.nextInt(numSides) +1;

        count++;

        System.out.println(r1 + " " + r2 + " " + r3);

        while((r1 == r3) || (r1 == r2) || (r2 == r3)){
            count++;

            r1 = rand.nextInt(numSides) +1;
            r2 = rand.nextInt(numSides) +1;
            r3 = rand.nextInt(numSides) +1;

            System.out.println(r1 + " " + r2 + " " + r3);


        }
    System.out.print("count = " + count);

    }
}
