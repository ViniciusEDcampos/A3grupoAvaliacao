import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<AlunoAcademia> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Academia PedroFit -----");
        boolean continuar = true;
        int opcao = 0;

        int soma = 0;
        int media = 00;

        System.out.println("Escolha a opção que deseja usar: ");
        System.out.println(" 1 - Criar novo registro"
                + "\n 2 - Listar todos os Registros"
                + "\n 3 - Buscar registro por matricula"
                + "\n 4 - Editar registro"
                + "\n 5 - Excluir registro"
                + "\n 6 - Sair");

        //verificação se o que a pessoa digitou e um numero
        while (true) {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // consome a quebra de linha
                break; // sai do loop se foi digitado um número
            } else {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); // consome a entrada inválida
            }
        }

        switch(opcao){
            case 1:
                System.out.println("Criar novo registro");
                break;
        }


        switch (opcao) {
            case 1:

            break;

            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            default:
                System.out.println("Digite algum numero valido!");
                break;
        }


    }
}