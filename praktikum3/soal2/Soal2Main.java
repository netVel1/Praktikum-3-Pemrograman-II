package praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {

    public static void main(String[] args) {
        String nama = "";
        String jenis="";
        String namaPemimpin="";
        int tanggal=0;
        int bulan=0; 
        int tahun=0;
        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, namaPemimpin, tanggal, bulan, tahun);
        LinkedList<Negara> Negara1 = new LinkedList<>();

        int n;
        n = input.nextInt();

        for (int i=0; i<n; i++){
            Negara sample = new Negara(nama, jenis, namaPemimpin, tanggal, bulan, tahun);
            sample.getData();
            Negara1.add(sample);
        }

        for (int i = 0; i < Negara1.size(); i++){
            Negara indeks = Negara1.get(i);
            indeks.tampilkan();
    }
    }
    
}
