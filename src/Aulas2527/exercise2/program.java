package Aulas2527.exercise2;

public class program {
  public static void main(String[] args) {
    Account acc1 = new Account();
    acc1.numero = 0142;
    acc1.limite = 100;
    acc1.Status = "Especial";
    acc1.saldo = 100;

    acc1.saque(100.0);
     System.out.println(acc1.saldo);
    acc1.depositar(0.0);
    System.out.println(acc1.consultarSaldo());

    /* System.out.println(acc1.chequeEspecial()); */

  }
}
