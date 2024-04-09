package Loja_De_Departamentos;

import java.util.Calendar;

public class Projeto_Teste {
    public static void main(String[] args) {
        
        //Testa ai no Diagrama UML
        
        Cliente cliente = new Cliente
        ("João", "123.456.789-00", Calendar.getInstance(), "123456789", "Rua A");

        Funcionario funcionario = new Funcionario
        ("Maria", "987.654.321-00", "Vendas", 2500.0);

        Produto produto = new Produto
        ("Camisa", 30.0, 50.0);

        Estoque estoque = new Estoque
        (produto, 100, Calendar.getInstance());

        Fornecedor fornecedor = new Fornecedor
        ("Fornecedor X", "12345678901234", "Rua B", "987654321");

        
        System.out.println("Informações do Cliente:");
        System.out.println(cliente);

        System.out.println("\nInformações do Funcionário:");
        System.out.println(funcionario);

        System.out.println("\nInformações do Produto:");
        System.out.println(produto);

        System.out.println("\nInformações do Estoque:");
        System.out.println(estoque);

        System.out.println("\nInformações do Fornecedor:");
        System.out.println(fornecedor);
    }
}

