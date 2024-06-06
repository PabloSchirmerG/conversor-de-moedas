import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String moeda1 = "BRL";
        String moeda2 = "USD";
        Menu menu = new Menu();

        boolean continuar = true;

        while(continuar){
            menu.print();
            Scanner leitor = new Scanner(System.in);
            int opcao = leitor.nextInt();
            if(opcao < 1 || opcao > 7){
                System.out.println("Opção inválida. Escolha novamente!");
            } else {
                continuar = menu.checarOpcao(opcao);
                double valor = leitor.nextDouble();
                menu.operar(opcao, valor);
            }
        }
    }
}