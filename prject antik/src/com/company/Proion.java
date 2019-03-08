package com.company;

public class Proion {

    private int kodPro;
    private String perPro;
    private float timPro;

    public void setData(int kodPro, String perPro, float timPro) {
        this.kodPro = kodPro;
        this.perPro = perPro;
        this.timPro = timPro;
    }

    public int getKodPro() {
        return kodPro;
    }

    public String getPerPro() {
        return perPro;
    }

    public float getTimPro() {
        return timPro;
    }

    public void printData(int kodPro, String perPro, float timPro){
        System.out.println("o kwdikos einai: "+ kodPro);
        System.out.println("Perigrafh Proiontos: "+ perPro);
        System.out.println("H timi einai: "+ timPro);
    }
    public int metaforika(int posoAgor)
    {
        if(posoAgor > 500)
            return 0;
        else
            return 50;
    }




}
