package Dominico;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public static void main(String[] args) {

        Conta ct1 = new Conta(101, 100);

        System.out.println("DADOS DA CONTA");
        System.out.println("Número da Conta: " + ct1.getNumero());
        System.out.println("Saldo da Conta Antes de creditar: " + ct1.getSaldo());
        ct1.creditar(100);
        System.out.println("Saldo da Conta: após creditar " + ct1.getSaldo());
        ct1.debitar(50);
        System.out.println("Saldo da Conta: após debitar " + ct1.getSaldo());

    }
}
