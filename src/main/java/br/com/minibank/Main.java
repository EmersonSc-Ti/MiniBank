package br.com.minibank;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" =====MiniBank=====");

    //Cliente cliente1 = new Cliente("Emerson", "123");
  //  Cliente cliente2 = new Cliente("Ana", "1234");

     //   System.out.println("Cliente 1: " + cliente1.getNome() + " - Cpf: " + cliente1.getCpf());
      //  System.out.println("Cliente 2: " + cliente2.getNome() + " - Cpf: " +cliente2.getCpf());

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf do cliente:");
        String cpf = scanner.nextLine();

        System.out.println("Cliente cadastrado com sucesso!");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Emerson", "123"));
        clientes.add(new Cliente("Ana", "1234"));
        clientes.add(new Cliente(nome, cpf));

        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - Cpf: " + cliente.getCpf());
        }
        System.out.println("Total de clientes cadastrados: " + clientes.size());



    }

}