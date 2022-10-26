package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Random;

public class Dadu {
     private int rand_dadu;
     Random rand = new Random();

    public int getRand_dadu() {
        return rand_dadu = rand.nextInt(6) + 1;
    }

    public void setRand_dadu(int rand_dadu) {
        this.rand_dadu = rand_dadu;
    }
    
}
