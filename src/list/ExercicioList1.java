import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioList1 {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      List<Double> tempMed = new ArrayList<>();
      Double soma = 0d;
      
      for(int i=1; i<=6; i++){
          System.out.print("Temperatura média do " + i + "º mês: ");
          Double next = scan.nextDouble();
          tempMed.add(next);
          soma += next;
      }
      
      //System.out.println("Lista de temperaturas: " + tempMed);
      System.out.println("============");
      System.out.println("Média das temperaturas do 1º semestre: " + soma/tempMed.size());
      System.out.println("============");
      System.out.println("Meses com temperatura acima da média: ");
      
      for(Double tm : tempMed){
          
          if(tm > soma/tempMed.size()){
              int ctrl = tempMed.indexOf(tm);
          
            switch(ctrl){
                case 0:
                    System.out.println((ctrl+1) + " - Janeiro -> " + tm + "°C");
                    break;
                case 1:
                    System.out.println((ctrl+1) + " - Fevereiro -> " + tm + "°C");
                    break;
                case 2:
                    System.out.println((ctrl+1) + " - Março -> " + tm + "°C");
                    break;
                case 3:
                    System.out.println((ctrl+1) + " - Abril -> " + tm + "°C");
                    break;
                case 4:
                    System.out.println((ctrl+1) + " - Maio -> " + tm + "°C");
                    break;
                case 5:
                    System.out.println((ctrl+1) + " - Junho -> " + tm + "°C");
                    break;
                default:
                    break;
                  
            }
          }
      }
    }
}
