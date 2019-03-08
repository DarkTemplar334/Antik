package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    private static final int ariPro=5;
    public static void main(String[] args) throws Exception{
        Pelatis Pel = new Pelatis();
        Proion[] pinPro= new Proion[ariPro];
        int proionta;

        Pel.readData();
        stoixeiaPel(Pel);
        proionta = metProPin(pinPro);
        System.out.println("Proionta: "+ proionta);






        // write your code here
    }

    public static void stoixeiaPel(Pelatis Pel) {

        System.out.println("Stoixeia Pelati: "+ "\n" + " ====================S==============");
        System.out.println("Kwdikos Pelati: "+ Pel.getKodPel());
        System.out.println("Onoma Pelati: " + Pel.getOnoma());
        System.out.println("Poso Agorwn = "+ Pel.getPosoAgor());
        System.out.println("==================================");
    }
    public static int metProPin(Proion pinPro[]) throws IOException, InterruptedException {
        int kodikos;
        String perigrafh;
        float timi;
        

        /*Scanner file = new Scanner(new File("C:\\Users\\User7\\Desktop\\methodologia\\prject antik\\src\\text"));
        StringBuilder sb = new StringBuilder();
        while(file.hasNext()){
            sb.append(file.nextLine());
        }
        String[] data = sb.toString().split(",  ");
        for(int i=0;i<ariPro;i=i+1){
            System.out.println("to proion "+ i+ " : " + data[i]);//+"\t" +data[i+1]+"\t" +data[i+2]+ "\n");
        }*/
        FileInputStream fstream = new FileInputStream("C:\\Users\\User7\\Desktop\\methodologia\\prject antik\\src\\text");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        int i=0;
        while((strLine = br.readLine()) != null)
        {
            //inPro[i]
            System.out.println(strLine);
            //Dokimastiko//////


            ///////////////////
            //TimeUnit.SECONDS.sleep(5);
            i++;
        }
        fstream.close();
        return ariPro;
    }

}
