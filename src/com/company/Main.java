package com.company;

public class Main {

    public static void main(String[] args) {
        String digitos=new String("1234567");
        String[] caracteres=digitos.split("");
        int n= caracteres.length;
        char[] c=new char[n];
        System.out.println("arreglo de tipo char");
        for(int i=0;i< caracteres.length;i++){

            c[i]=caracteres[i].charAt(0);
            System.out.println(c[i]);

        }
        System.out.println("arreglo de tipo int");
        int []num=new int[n];
        for(int i=0;i< c.length;i++){
            num[i]=c[i]-'0';

            System.out.println(num[i]);
        }
        System.out.println("numeros a binario");
        for(int i=0;i< c.length;i++){

            System.out.println(num[i]+"="+Integer.toBinaryString(num[i]));
        }
    }
}
