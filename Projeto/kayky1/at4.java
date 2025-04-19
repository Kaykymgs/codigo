package Projeto.kayky1;

public class at4 {public class SomaSerie {

    public static void main(String[] args) {
        double soma = 0;
        int numerador = 1000;

        for (int i = 1; i <= 50; i++) {
            double termo = (double) numerador / i;

            // Alterna o sinal com base na posição
            if (i % 2 == 0) {
                termo *= -1;
            }

            soma += termo;
            numerador -= 3;
        }

        System.out.printf("A soma dos 50 primeiros termos da série é: %.2f\n", soma);
    }
}

    
}
