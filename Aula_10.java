package aulas;

import java.util.Scanner;

public class Aula_10{
   public static void main(String[]args){
       Scanner input=new Scanner(System.in);
      double base, altura, arearetangulo;
       
      System.out.println("informe o valor da base:");
       base=input.nextDouble();
       
       System.out.println("informe o valor da altura:");
       altura=input.nextDouble();
       
       arearetangulo= base * altura;
       
       System.out.println("A area de um retangulo de base= " + base);
       System.out.println("e altura= " + altura);
       System.out.println("A área do retangulo é = " + arearetangulo);
       
   }
}