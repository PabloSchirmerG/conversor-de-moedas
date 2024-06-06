import java.io.IOException;

public class Menu {

    public void print(){
        System.out.println("**************************************************** \n \n" +
                "$$ Seja bem-vindo(a) ao Conversor de Moedas $$ \n" +
                "1- Dólar >> Peso argentino \n" +
                "2- Peso argentino >> Dólar \n" +
                "3- Dólar >> Real brasileiro \n" +
                "4- Real brasileiro >> Dólar \n" +
                "5- Dólar >> Peso colombiano \n" +
                "6- Peso colombiano >> Dólar \n" +
                "7- Sair \n \n" +
                "****************************************************");
    }

    public boolean checarOpcao (int opcao) {
        if (opcao == 7){
            return false;
        }else {
            System.out.println("Informe o valor (separado por vírgula): ");
            return true;
        }
    }

    public void operar(int opcao, double valor) throws IOException, InterruptedException {
        Conversor conversor = new Conversor();
        switch (opcao) {
            case 1:
                System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "USD", "ARS") + " [ARS]" );
                break;
            case 2:
                System.out.println("Valor " + valor + " [ARS] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "ARS", "USD") + " [USD]" );
                break;
            case 3:
                System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "USD", "BRL") + " [BRL]" );
                break;
            case 4:
                System.out.println("Valor " + valor + " [BRL] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "BRL", "USD") + " [USD]" );
                break;
            case 5:
                System.out.println("Valor " + valor + " [USD] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "USD", "COP") + " [COP]" );
                break;
            case 6:
                System.out.println("Valor " + valor + " [COP] corresponde ao valor final de =>>> "
                        + conversor.converter(valor, "COP", "USD") + " [USD]" );
                break;
            default:
                break;
        }
    }
}
