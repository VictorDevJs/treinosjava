package Aulas2527.exercise2;

//usar apenas métodos com return
public class Account {
  Integer numero;
  double saldo;
  String Status;
  double limite;

  public double saque(double valor) {
    if (saldo >= valor)
      ;
    return saldo - valor;

  }

  double depositar(double valor) {
    return saldo = valor + saldo;
  }

  double consultarSaldo() {
    return saldo;
  }

  /* double chequeEspecial() {
    if (saldo < 0)
      ;
    return limite = saldo;
 */
  }

