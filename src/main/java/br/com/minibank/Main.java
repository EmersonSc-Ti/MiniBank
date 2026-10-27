package br.com.minibank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" =====MiniBank=====");

    Cliente cliente1 = new Cliente("Emerson", "123");
    Cliente cliente2 = new Cliente("Ana", "1234");

        System.out.println("Cliente 1: " + cliente1.getNome() + " - Cpf: " + cliente1.getCpf());
        System.out.println("Cliente 2: " + cliente2.getNome() + " - Cpf: " +cliente2.getCpf());
    }
}