import java.util.Scanner;// importando biblioteca de leitura.

public class MenuExercicios { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao; // criando a primeira variável.

        do {
            System.out.println("\n===== MENU DE EXERCÍCIOS =====");
            System.out.println("1. Exercício 1 - ");
            System.out.println("2. Exercício 2 - ");
            System.out.println("3. Exercício 3 - ");
            System.out.println("4. Exercício 4 - ");
            System.out.println("5. Exercício 5 - ");
            System.out.println("6. Exercício 6 - ");
            System.out.println("7. Exercício 7 - ");
            System.out.println("8. Exercício 8 - ");
            System.out.println("9. Exercício 9 - ");
            System.out.println("10.Exercício 10- ");
            System.out.println("11.Exercício 11- ");
            System.out.println("12.Exercicio 12-");
            System.out.println("14.Exercício 14 -");
            System.out.println("15.Exercício 15 -");
            System.out.println("16.Exercício 16 -");
            System.out.println("17.Exercício 17 -");
            System.out.println("18.Exercício 18 -");
            System.out.println("19.Exercício 19 -");
            System.out.println("20.Exercício 20 -");
            System.out.println("21.Exercício 21 -");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();// chamando o scanner para a leitura dos dados.


            // lendo a opção do usuário.
            switch (opcao) {
                case 1:
                    Exercício1(scanner);
                    break;
                case 2:
                    Exercício2(scanner);
                    break;
                case 3:
                    Exercício3(scanner);
                    break;
                case 4:
                    Exercício4(scanner);
                    break; 
                case 5:
                    Exercício5(scanner);
                    break;
                case 6:
                     Exercício6(scanner);
                    break;
                case 7:
                    Exercício7(scanner);
                    break;
                case 8:
                    Exercício8(scanner);
                    break;
                case 9:
                    Exercício9(scanner);
                    break;
                case 10:
                    Exercício10(scanner);
                    break;
                case 11:
                    Exercício11(scanner);
                    break;
                case 12:
                    Exercício12(scanner);
                    break;
                case 13:
                    Exercício13(scanner);
                    break;
                case 14:
                    Exercício14(scanner);
                    break ;
                case 15:
                    Exercício15(scanner);
                    break;
                case 16:
                    Exercício16(scanner);
                    break;
                case 17:
                    Exercício17(scanner);
                    break;
                case 18:
                    Exercício18(scanner);
                    break;
                case 19:
                    Exercício19(scanner);
                    break;
                case 20:
                    Exercício20(scanner);
                    break;
                case 21:
                    Exercício21(scanner);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);// o progroma será encerrado caso o numéro digitado pelo o usuário seja igual a 0.

        scanner.close();// fechando o scanner.
    } 
    // Exercício 1.
    public static void Exercício1(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");// declarando o primeiro numero.
        int a = scanner.nextInt(); // lendo o primeiro numero .
        System.out.print("Digite o segundo número: ");// declarando o segundo numero.
        int b = scanner.nextInt();// lendo o segundo numero .
        System.out.println("Digite o terceiro número:"); // declarando o terceiro numero.
        int c = scanner.nextInt();// lendo o terceiro numero.
        int soma = a + b;// realizando a soma de a+b.
        if(soma<c){
            System.out.println("a + b é menor que c.");
        } else{
            System.out.println("a + b é maior ou igual a c.");
        }
        scanner.close();
    }
    // Exercício 2
    public static void Exercício2(Scanner scanner) {
        System.out.print("Digite um número: "); // declarando um número.
        double num = scanner.nextDouble();// lendo o número declarado.
        if(num % 2 ==0) {
            System.out.println(" é um número par ");
            num= Math.pow(num,2);// realizando a exponenciação.
        System.out.println("o quadrado do número é" + num);
             } else{ System.out.println("o número é impar");
             num= Math.pow(num, 3); // realizando a exponenciação.
            System.out.println("o cubo do número é " + num);
         }
        scanner.close();

    }
    // Exercício 3
    public static void Exercício3(Scanner scanner) {
        System.out.print("Qual é o seu nome? ");// declarando o primeiro numero .
        String nome = scanner.nextLine();// lendo o primeiro numero .
        System.out.println("Qual é o seu sexo? F para Feminino e M para Masculino :"); // declarando o sexo do usuário.
        String sexo = scanner.nextLine();// lendo o sexo do usuario.
        System.out.println("Qual é o seu estado civil? C para casado(a) e S para solteiro(a):");
        String estadocivil = scanner.nextLine();
        int anoscasado = 0;
        // se for mulher e casada, perguntar tempo de casamento.
        if(sexo.equals("F") && estadocivil.equals("casada")) {
            System.out.println("Há quantos anos está casada?");
            anoscasado = scanner.nextInt();}
            //exibindo as informações.
            System.out.println("/n===== Informações:=====");
            System.out.println("Nome: " + nome);
            System.out.println("sexo:" + (sexo.equals("F") ? "Feminino" : "Masculino"));
            System.out.println("Estado civil: " + (estadocivil.equals("c")? "Casado(a)" : "Solteiro"));
            if (sexo.equals("F") && estadocivil.equals("C")){
                System.out.println("Tempo de casada: " + anoscasado + "Anos");
            }
            scanner.close(); }

        // Exercício 4
    
    public static void Exercício4(Scanner scanner){
        System.out.println("Digite um numero :");
        double numero = scanner.nextDouble();
        if(numero % 2==0){// numero é par.
            if(numero % 3 ==0){
            System.out.println("O número é par e divisível por 3");

            } else{
                System.out.println("O numero é par e não é divisível por 3.");  
            }
        }else {
                if (numero % 5 ==0) {
                    System.out.println("O numero é impar e divisível por 5.");
                    
                } else{
                    System.out.println("o numero é impar e não é divisivel por 5.");
                }
            } scanner.close();
        }

    //Exercício 5 
    public static void Exercício5(Scanner scanner){
        System.out.println("Em qual turno você estuda ? M para Matudino ou V para Vespertino ou N para Noturno.");
        String turno = scanner.nextLine();
        if(turno.equals("M")){
            System.out.println("Bom dia");
        } else{
            if(turno.equals("M")){
                System.out.println("Boa tarde ");
            } else{
                if(turno.equals("N")){
                    System.out.println("Boa noite");
                }
            }
        } scanner.close();

    }

    //Exercício 6
    public static void Exercício6(Scanner scanner){
        int i=0;
        while (i<10) {
            System.out.println(i);
            i++;
            
        } 
        int e = 0;
        do{
            System.out.println(e);
            e++;
        }while (e<10);

        for(int u=0; u<10;u++);

    }

    //Exercicio 7
    public static void Exercício7(Scanner scanner){
        for(int n = 1; n<=20;n++);
    }

    // Exercício 8
    public static void Exercício8(Scanner scanner){

        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
        

        

    













    }




 





}





      
   
 





                
            



            
            
            

            

            




        

            
        

