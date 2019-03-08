package com.company;
import java.util.Scanner;

public class Pelatis {
    Scanner input = new Scanner(System.in);
    private int kodPel;
    private String onoma;
    private float posoAgor;



    public void readData()
    {
        System.out.println("Onoma: ");
        this.onoma = input.nextLine();
        System.out.println("kwdikos: ");
        this.kodPel = input.nextInt();
        this.posoAgor = 0;

    }

    public int getKodPel() {
        return kodPel;
    }

    public String getOnoma() {
        return onoma;
    }

    public float getPosoAgor() {
        return posoAgor;
    }
    public void agoraProiontos(Proion agora,int paragontas)
    {
        posoAgor = posoAgor + agora.getTimPro() * paragontas;
    }



}
