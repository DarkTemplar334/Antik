package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final int ariPro=5;
    public static void main(String[] args) throws Exception{
        Pelatis Pel = new Pelatis();

        Pel.readData();
        stoixeiaPel(Pel);
        List<Product> products = metProPin();
        // write your code here
    }

    public static void stoixeiaPel(Pelatis Pel) {

        System.out.println("Stoixeia Pelati: "+ "\n" + " ====================S==============");
        System.out.println("Kwdikos Pelati: "+ Pel.getKodPel());
        System.out.println("Onoma Pelati: " + Pel.getOnoma());
        System.out.println("Poso Agorwn = "+ Pel.getPosoAgor());
        System.out.println("==================================");
    }
    public static List<Product> metProPin() throws IOException {
        FileInputStream fstream = new FileInputStream("C:\\Users\\User7\\Desktop\\methodologia\\prject antik\\src\\text");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        ArrayList<Product> productList = new ArrayList<>();
        while((strLine = br.readLine()) != null)
        {
            Product product = new Product(strLine);
            productList.add(product);

        }
        fstream.close();
        return productList;
    }

}
