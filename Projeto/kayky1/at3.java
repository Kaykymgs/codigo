package Projeto.kayky1;

public class at3 {import java.util.Scanner;

    public class EstatisticasPessoas {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int[] idades = new int[10];
            double[] pesos = new double[10];
            double[] alturas = new double[10];
    
            // Coletando os dados
            for (int i = 0; i < 10; i++) {
                System.out.println("\nPessoa " + (i + 1) + ":");
                System.out.print("Digite a idade: ");
                idades[i] = scanner.nextInt();
    
                System.out.print("Digite o peso (em kg): ");
                pesos[i] = scanner.nextDouble();
    
                System.out.print("Digite a altura (em metros): ");
                alturas[i] = scanner.nextDouble();
            }
    
            int opcao;
            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Mostrar média das idades");
                System.out.println("2. Mostrar total de pessoas com > 90kg e < 1,50m");
                System.out.println("3. Mostrar % de pessoas entre 10 e 30 anos com altura > 1,90m");
                System.out.println("4. Mostrar todos os dados coletados");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
    
                switch (opcao) {
                    case 1:
                        double somaIdades = 0;
                        for (int idade : idades) {
                            somaIdades += idade;
                        }
                        double mediaIdade = somaIdades / idades.length;
                        System.out.printf("Média das idades: %.2f anos\n", mediaIdade);
                        break;
    
                    case 2:
                        int contPesadasBaixas = 0;
                        for (int i = 0; i < 10; i++) {
                            if (pesos[i] > 90 && alturas[i] < 1.5) {
                                contPesadasBaixas++;
                            }
                        }
                        System.out.println("Total com peso > 90kg e altura < 1,50m: " + contPesadasBaixas);
                        break;
    
                    case 3:
                        int totalAltos = 0;
                        int contIdadeEntre10e30 = 0;
                        for (int i = 0; i < 10; i++) {
                            if (alturas[i] > 1.9) {
                                totalAltos++;
                                if (idades[i] >= 10 && idades[i] <= 30) {
                                    contIdadeEntre10e30++;
                                }
                            }
                        }
                        if (totalAltos > 0) {
                            double porcentagem = (double) contIdadeEntre10e30 / totalAltos * 100;
                            System.out.printf("Porcentagem com idade entre 10 e 30 anos e altura > 1,90m: %.2f%%\n", porcentagem);
                        } else {
                            System.out.println("Nenhuma pessoa com altura > 1,90m.");
                        }
                        break;
    
                    case 4:
                        System.out.println("\n--- Dados Coletados ---");
                        for (int i = 0; i < 10; i++) {
                            System.out.printf("Pessoa %d: Idade: %d anos, Peso: %.2f kg, Altura: %.2f m\n",
                                    i + 1, idades[i], pesos[i], alturas[i]);
                        }
                        break;
    
                    case 5:
                        System.out.println("Encerrando o programa...");
                        break;
    
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
    
            } while (opcao != 5);
    
            scanner.close();
        }
    }
    
    
}
