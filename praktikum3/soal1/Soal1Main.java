package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {

    public static void main(String[] args) {
    Dadu roll = new Dadu();
    LinkedList<Integer> daduAngka = new LinkedList<>();
    Scanner dadu = new Scanner(System.in);
    
    int j = dadu.nextInt();
    int sum =0;
    
    for (int i = 1; i <= j; i++){
        int n = roll.getRand_dadu();
        System.out.println("Dadu ke-"+ i +" bernilai " + n);
        daduAngka.add(n);
        }
    for (int i = 0; i < daduAngka.size();i++){
        sum += daduAngka.get(i);
        }
    System.out.println("Total nilai dadu keseluruhan " + sum);
    }
}
