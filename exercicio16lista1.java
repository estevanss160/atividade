//Escreva um programa em Java para calcular a redução do tempo de vida de
//um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já
//fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos
//dias de vida um fumante perderá e exiba o total em dias.

import java.util.Scanner;
public class exercicio16lista1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de cigarros fumados por dia: ");
        int cigarros = sc.nextInt();
        System.out.print("Anos fumando: ");
        int anos = sc.nextInt();
        int vida = (cigarros * 10);
        float tempo = 0;
        if (vida >= 60) {
            tempo = (vida / 60);
            if (tempo >= 24) {

            }
            System.out.printf("horas de vida perdida: "+tempo);
        }
        if (vida < 60) {
            System.out.printf("Minutos de vida perdida: "+tempo);
        }
    }
}
