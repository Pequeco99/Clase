

package com.mycompany.argumetos;


public class Argumetos {

    public static void main(String[] args) {
        
        String argumento1;//Como utilizar argumentos para introducir en consola
        //String argumento2;
        
        argumento1 = args[0];
        //argumento2 = args[1];
        
        System.out.println("Argumento 1: "+argumento1);
        //System.out.println("Argumento 2: "+argumento2);
        
        switch (argumento1){
            case "1":{
                System.out.println("Idioma español");
                break;
            }
            case "2":{
                System.out.println("Hi! I'm Muzzy");
                break;
            }
            default:{
                System.out.println("Argumento invalido");
            }
        }
    }
}
