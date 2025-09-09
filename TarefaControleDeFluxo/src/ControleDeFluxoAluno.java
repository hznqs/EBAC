import java.util.ArrayList;
import java.util.Scanner;

public class ControleDeFluxoAluno{


    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        int cont = 1;
        while(notas.size() < 4){
            System.out.println("Digite sua " + cont + "nº nota: " );
            double nota = s.nextDouble();
            notas.add(nota);
            cont++;
        }

        double soma = 0;
        for(double num : notas){
            soma += num;
        }

        if (soma/(notas.size()) >= 7){
            System.out.println("Aluno aprovado!");
        }
        else if(soma/(notas.size()) >= 5){
            System.out.println("Aluno de recuperação!!");
        }
        else{
            System.out.println("Aluno reprovado!!!");
        }








    }


}