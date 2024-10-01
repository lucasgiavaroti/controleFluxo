//https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o valor do primeiro parâmetro: ");
        parametroUm = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o valor do segundo parâmetro: ");
        parametroDois = Integer.parseInt(scan.nextLine());

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametroInvalidosException e){
            // exibe a mensagem da exceção como erro
            System.err.println(e.getMessage());
        }
        scan.close();
    }
    static void contar (int p1, int p2) throws  ParametroInvalidosException{
        // lança a exceção se o parâmetro 1 for maior que o parâmetro 2
        if (p1>p2){
            throw new ParametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        int contagem = p2 - p1;
        for (int i =1;i<=contagem;i++){
            System.out.printf("\nImprimindo número ... %d", i);
        }
    }
}
