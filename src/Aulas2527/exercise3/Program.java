package Aulas2527.exercise3;

//import java.util.Scanner;

public class Program extends Aluno {
  public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Victor";
    aluno1.matricula = 230201;
    aluno1.curso = "Direito";

    System.out.println(aluno1.nome + "tudo certo");

    System.out.println(aluno1.nome + "\n" + aluno1.matricula + "\n" +
        aluno1.curso);
    aluno1.disciplinaI(6);
    aluno1.disciplinaI(5);
    aluno1.disciplinaI(5);
    System.out.println(aluno1.nome + "\n" + aluno1.matricula + "\n" +
        aluno1.curso);
    // sc.close();
  }

}
