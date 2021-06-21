package list;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em lista.
   Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
   e em que mês elas ocorreram */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerListTemperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double tempMedSem;
        List<Double> TempMed = new ArrayList<>();

        for(int i=1; i<=6; i++){
            System.out.print(i+"ª temp: ");
            tempMedSem = scan.nextDouble();
            TempMed.add(tempMedSem);
        }

        Iterator<Double> somador = TempMed.iterator();
        Double soma = 0d;

        while(somador.hasNext()){
            Double next = somador.next();
            soma += next;
        }

        Double r = soma/TempMed.size();
        System.out.print("temperaturas do primeiro semestre: ");
        System.out.println(TempMed);
        System.out.print("média semestral de temperatura: ");
        System.out.println(r);
    }
}
