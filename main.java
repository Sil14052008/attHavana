import models.Carro;
import models.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro1 = cadastrarCarro(scanner);
        Carro carro2 = cadastrarCarro(scanner);
        Carro carro3 = cadastrarCarro(scanner);

        Moto moto1 = cadastrarMoto(scanner);
        Moto moto2 = cadastrarMoto(scanner);
        Moto moto3 = cadastrarMoto(scanner);

        System.out.println("Dados dos Carros:");
        carro1.imprimirDados();
        System.out.println();
        carro2.imprimirDados();
        System.out.println();
        carro3.imprimirDados();

        System.out.println("\nDados das Motos:");
        moto1.imprimirDados();
        System.out.println();
        moto2.imprimirDados();
        System.out.println();
        moto3.imprimirDados();

        scanner.close();
    }

    public static Carro cadastrarCarro(Scanner scanner) {
        System.out.println("Cadastro de Carro:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantidade de Portas: ");
        int quantidadePortas = scanner.nextInt();
        scanner.nextLine();
        return new Carro(marca, modelo, ano, quantidadePortas);
    }

    public static Moto cadastrarMoto(Scanner scanner) {
        System.out.println("Cadastro de Moto:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cilindrada: ");
        int cilindrada = scanner.nextInt();
        scanner.nextLine();
        return new Moto(marca, modelo, ano, cilindrada);
    }
}
