import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioLista2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<String> reu = new ArrayList<>();
      
        for(int i=1; i<=5; i++){
            String next = "";
            switch(i){
                case 1:
                    System.out.println("Telefonou para a vítima? [S/N]");
                    next = scan.next();
                    break;
                case 2:
                    System.out.println("Esteve no local do crime? [S/N]");
                    next = scan.next();
                    break;
                case 3:
                    System.out.println("Mora perto da vítima? [S/N]");
                    next = scan.next();
                    break;
                case 4:
                    System.out.println("Devia para a vítima? [S/N]");
                    next = scan.next();
                    break;
                case 5:
                    System.out.println("Já trabalhou com a vítima? [S/N]");
                    next = scan.next();
                    break;
                default:
                    break;
                  
            }
          
            reu.add(next.toUpperCase());
        }
        //-----------resolução 1--------------
        int count = 0;
        Iterator<String> contador = reu.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("S")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
        //-----------resolução 2--------------
        int culpado = 0;
      
        for(String s : reu){ 
            if(s.equals("S")) culpado++;
        }
      
        System.out.println("============");
      
        if(culpado<2) System.out.println("Inocente");
        if(culpado>1 && culpado<3) System.out.println("Suspeito");
        if(culpado>=3 && culpado<=4) System.out.println("Cumplíce");
        if(culpado>4) System.out.println("Assassino");
      
        System.out.println("============");
        System.out.println("Lista de respostas: " + reu);
    }
}
