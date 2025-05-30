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
                System.out.println("Editar registro");
                System.out.println("Registro que deseja editar: ");
                String Editarmatricula = scanner.nextLine();
                boolean encontrado = false;
                for (AlunoAcademia alunoRegistrado : list) {
                    if (alunoRegistrado.getMatricula().equalsIgnoreCase(Editarmatricula)) {
                        encontrado = true;
                        System.out.println(alunoRegistrado);
                        System.out.println("oq deseja editar: ");
                        System.out.println("opções: nome, matricula, endereço, cidade, cep, telefone, rg, email, dataNascimento, sexo, " + "planoAcademia");
                        String campo = scanner.nextLine().toLowerCase();
                        switch (campo) {
                            case "nome":
                                System.out.println("Digite o nome do aluno: ");
                                alunoRegistrado.setNome(scanner.nextLine());
                                break;
                                case "matricula":
                                    System.out.println("Digite a nova matricula do aluno: ");
                                    alunoRegistrado.setMatricula(scanner.nextLine());
                                    break;
                                    case "endereco":
                                        System.out.println("Digite o novo endereco do aluno: ");
                                        alunoRegistrado.setEndereco(scanner.nextLine());
                                        break;
                                        case "cidade":
                                            System.out.println("Digite a nova cidade do aluno: ");
                                            alunoRegistrado.setCidade(scanner.nextLine());
                                            break;
                                            case "cep":
                                                System.out.println("Digite o novo cep do aluno: ");
                                                alunoRegistrado.setCep(scanner.nextLine());
                                                break;
                                                case "rg":
                                                    System.out.println("Digite o novo rg do aluno: ");
                                                    alunoRegistrado.setRg(scanner.nextLine());
                                                    break;
                                                    case "telefone":
                                                        System.out.println("Digite o novo telefone do aluno: ");
                                                        alunoRegistrado.setTelefone(scanner.nextLine());
                                                        break;
                                                        case "email":
                                                            System.out.println("Digite o novo email do aluno: ");
                                                            alunoRegistrado.setEmail(scanner.nextLine());
                                                            break;
                                                            case "dataNascimento":
                                                                System.out.println("Digite o novo data de nascimento do aluno: ");
                                                                alunoRegistrado.setDataNascimento(scanner.nextLine());
                                                                break;
                                                                case "sexo":
                                                                    System.out.println("Digite o novo sexo do aluno: ");
                                                                    alunoRegistrado.setSexo(scanner.nextLine());
                                                                    break;
                                                                    case "planoAcademia":
                                                                        System.out.println("Digite o novo plano do aluno: ");
                                                                        alunoRegistrado.setPlanoAcademia(scanner.nextLine());
                                                                        break;
                                                                        default:
                                                                            System.out.println("invalido tente novamente");
                                                                            break;
                        }
                        System.out.println("editado com sucesso!");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Aluno com a matricula " + Editarmatricula + " nao encontrado" );
                }
            break;

            case 5:
                System.out.println("Excluir registro");
                System.out.println("Registro que deseja excluir: ");
                String registroExcluir = scanner.nextLine();
                boolean removido = false;
                for (AlunoAcademia alunoRegistrado : list) {
                    if (alunoRegistrado.getMatricula().equalsIgnoreCase(registroExcluir)) {
                        list.remove(alunoRegistrado);
                        removido = true;
                        System.out.println("Registro excluido com sucesso!");
                        break;

                    }
                }
                if (!removido) {
                    System.out.println("registro não encontrado");
                }

            break;

            case 6:
                System.out.println("Saindo...");
            break;

            default:
                System.out.println("Digite algum numero valido!");
                break;
        }


    }
}