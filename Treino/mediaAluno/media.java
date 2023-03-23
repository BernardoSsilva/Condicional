package mediaAluno;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.next();
        System.out.print("Digite a primeira nota: ");
        float primNota = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float segNota = scan.nextFloat();
        float media = (primNota + segNota)/2;
        if(media >= 6){
            System.out.print("O aluno "+nome+" foi aprovado");
            System.out.printf(", com media %.1f",media);
        } else {
            System.out.print("O aluno "+nome+" foi para recuperação");
            System.out.printf(", com media %.1f",media);
            System.out.println(" ");
            System.out.println("O Aluno precisa tirar 6 na recuperação para ser aprovado");
             System.out.print("Digite a nota da recuperação: ");
            float notaRec = scan.nextFloat();
            if (notaRec >= 6){
                System.out.printf("O aluno "+nome+" Foi aprovado com nota %.1f",notaRec);
            } else {
                System.out.printf("O aluno "+nome+" Foi reprovado com nota %.1f",notaRec);
            }
        }
    }
}
