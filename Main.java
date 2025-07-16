import java.util.Scanner;
/*
    * Projeto: Controle de Carro
    * Descrição: Um programa simples em Java, utilizando emcapsulamento para controlar as operações de um carro.
    * Autor: Gabriely Venturoso
    * Data: 16/07/2025
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        ControleCarro controleCarro = new ControleCarro();
        System.out.println("Bem-vindo ao controle de carro!");
        do {
            System.out.println("==========================");
            System.out.println("--- MENU CARRO ---");
            System.out.println("1. Ligar carro");
            System.out.println("2. Desligar carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Trocar marcha");
            System.out.println("6. Virar para esquerda");
            System.out.println("7. Virar para direita");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> controleCarro.ligar();
                case 2 -> controleCarro.desligar();
                case 3 -> {
                    controleCarro.acelerar();
                    controleCarro.statusVelocidade();
                }
                case 4 ->{
                    controleCarro.desacelerar();
                    controleCarro.statusVelocidade();
                }
                case 5 -> {
                    System.out.println("Digite a marcha desejada (1-6): ");
                    int novaMarcha = scan.nextInt();
                    controleCarro.trocarMarcha(novaMarcha);
                }
                case 6 -> controleCarro.virarEsquerda();
                case 7 -> controleCarro.virarDireita();
                case 8 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);
    }
}