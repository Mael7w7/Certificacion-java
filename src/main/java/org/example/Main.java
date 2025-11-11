package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int numero[] = { 1,2,3,4,5,6,7,8,9,10};
        for(int n : numero) {
            System.out.println(n);
        }

        esMenor(numero);
        esMayor(numero);
        promedio(numero);


    }

    public static void esMayor( int[] numero){
        int num =numero[0];
        for(int i = 0; i < numero.length; i++) {

            if (num <=numero[i]) {
                num=numero[i];
            }

        }
        System.out.println("El numero mayor es " + num);
    }

    public static void esMenor( int[] numero){
        int num=numero[0];
        for(int i = 0; i < numero.length; i++) {

            if (num >=numero[i]) {
                num=numero[i];
            }


        }
        System.out.println("El numero menor es " + num);
    }

    public static void promedio(int[] numero){
        int acumulador=0;
        for (var i = 0; i < numero.length; i++) {
            acumulador += numero[i];

        }
        System.out.println("El promedio es :  " +(double)acumulador/ numero.length);
    }
}