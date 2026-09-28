
import java.util.Scanner;

public class MenuPaciente {
    public static void mostrarMenu(Scanner sc, Paciente paciente){
        int opcao;

        do { 
            
            System.out.println("========== MENU DO PACIENTE ========");
            System.out.println("1 - Meus dados");
            System.out.println("2 - Agendamentos");
            System.out.println("3 - Consultas");
            System.out.println("4 - Exames");
            System.out.println("5 - Medicamentos");
            System.out.println("0 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 :
                    System.out.println("Nome: " + paciente.getNome());
                    System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
                    System.out.println("CPF: " + paciente.getCpf());
                    System.out.println("Telefone: " + paciente.getTelefone());
                    System.out.println("Email: " + paciente.getEmail());
                    
                    break;
            
                case 2 :

                    break;

                case 3 :

                    break;

                case 4 :

                    break;

                case 5 :

                    break;

                case 0 :

                    System.out.println("saindo...");

                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao !=0);
    }
}
