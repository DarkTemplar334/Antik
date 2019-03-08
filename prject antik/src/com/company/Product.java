package com.company;

public class Product {

    private int kodPro;
    private String perPro;
    private float timPro;

    public Product(String item) {

        String[] items = item.trim().split(",");

        if (items.length!=3) {
            throw new IllegalArgumentException("Expecting something in the form of <code>,<description>,<price) and got: " + item);
        }
        kodPro = Integer.parseInt(items[0]);
        perPro = items[1].trim();
        timPro = Float.parseFloat(items[2]);
    }

    public Product(int kodPro, String perPro, float timPro) {
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
