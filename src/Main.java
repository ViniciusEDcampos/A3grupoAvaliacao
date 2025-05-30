import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<AlunoAcademia> Registros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("----- Academia OxyFit -----\n");
        boolean continuar = true;
        int opcao = 0;
        

        System.out.println("Escolha a opção que deseja utilizar: \n");
        System.out.println(" 1 - Criar novo registro"
                + "\n 2 - Listar todos os Registros"
                + "\n 3 - Buscar registro por matricula"
                + "\n 4 - Editar registro"
                + "\n 5 - Excluir registro"
                + "\n 6 - Sair");

        //verificação se o que a pessoa digitou e um numero
        while (true) {
            if (entrada.hasNextInt()) {
                opcao = entrada.nextInt();
                entrada.nextLine(); // consome a quebra de linha
                break; // sai do loop se foi digitado um número

            } else {
                System.out.println("Entrada inválida! Digite apenas números.");
                entrada.nextLine(); // consome a entrada inválida
            }
        }

        switch(opcao){
            case 1:
                System.out.println("Criar novo registro");
                break;
        }


        switch (opcao) {
            case 1:
                AlunoAcademia alunov1 = new AlunoAcademia();

                System.out.println("---- Informações  necessárias para Registro----");

                System.out.println(" Digite o Nome do Aluno");
                alunov1.setNome(entrada.nextLine());

                System.out.println("Digite a Matricula do Aluno");
                alunov1.setMatricula(entrada.nextLine());

                System.out.println("Digite o Endereço do Aluno");
                alunov1.setEndereco(entrada.nextLine());

                System.out.println("Digite a Cidade do Aluno");
                alunov1.setCidade(entrada.nextLine());

                System.out.println("Digite o CPF do Aluno");
                alunov1.setCpf(entrada.nextLine());

                System.out.println(" Digite o CEP do Aluno");
                alunov1.setCep(entrada.nextLine());

                System.out.println("Digite o Telefone do Aluno");
                alunov1.setTelefone(entrada.nextLine());

                System.out.println("Digite o RG do Aluno");
                alunov1.setRg(entrada.nextLine());

                System.out.println("Digite o Email do Aluno");
                alunov1.setEmail(entrada.nextLine());

                System.out.println("Digite a Data de Nascimento do Aluno");
                alunov1.setDataNascimento(entrada.nextLine());

                System.out.println("Digite o sexo do Aluno");
                alunov1.setSexo(entrada.nextLine());

                System.out.println("Digite o Plano escolhido ");
                alunov1.setPlanoAcademia(entrada.nextLine());

                Registros.add(alunov1);

                System.out.println("Parabéns seu cadastro foi concluido");
                break;

                case 2:
                System.out.println("----Lista de todos os Registros----");

                for (AlunoAcademia listaAlunos : Registros ) {

                    System.out.println(listaAlunos);
                }
                break;

                case 3:
                System.out.println(" ----Buscar dados Matricula----");
                System.out.println("Informe o numero de matricula do Aluno: ");
                String matricula = entrada.nextLine();

                AlunoAcademia  alunoEncontrado = null;

                for (AlunoAcademia listaAlunos : Registros) {
                    if (listaAlunos.getMatricula().equals(matricula)) {
                        alunoEncontrado = listaAlunos;
                        break;
                    }
                }
                if (alunoEncontrado != null) {
                    System.out.println("Aluno encontrado");
                    System.out.println(alunoEncontrado);

                }else{

                        System.out.println("Nenhum aluno encontrado");
                }


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