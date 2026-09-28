import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        ArrayList <Paciente> list = new ArrayList<>();
        ArrayList <Agendamento> agendas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String resposta;
        int opcao;
        do {

            System.out.println("========== SISTEMA DE SAÚDE ==========");
            System.out.println("1 - Cadastrar paciente");
            System.out.println("2 - Fazer login");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){ 
                case 1:
                    do{
                        System.out.println("====== CADASTRO DE PACIENTE ======");
            
                        String nome = CadastroPaciente.cadastrarNome(sc);
                
                        LocalDate data = CadastroPaciente.cadastrarData(sc);     
               
                        String cpf = CadastroPaciente.cadastrarCpf(sc, list);
                
                        String telefone = CadastroPaciente.cadastrarTelefone(sc);
            
                        String email = CadastroPaciente.cadastrarEmail(sc);
            
                        String senha = CadastroPaciente.cadastrarSenha(sc);
            
                        Paciente paciente = new Paciente(nome, data, cpf, telefone, email, senha);
                        list.add(paciente);
                        System.out.println("paciente cadastrado!");
                        do{
                            System.out.println("Deseja cadastrar outro paciente? (s/n) ");
                            resposta = sc.nextLine();

                            if(!resposta.equalsIgnoreCase("n") && !resposta.equalsIgnoreCase("s")){
                                System.out.println("Resposta inválida");
                            }     
                        }while (
                            !resposta.equalsIgnoreCase("n")  && 
                            !resposta.equalsIgnoreCase("s")
                        ); 
                    } while(resposta.equalsIgnoreCase("s"));
                        System.out.println("====== PACIENTES CADASTRADOS ======");
                        for (int x=0;x < list.size();x++){
                            System.out.println(list.get(x));
                        }
                break;
            
            case 2:
                
                boolean loginRealizado = false;  
                Paciente paciente = null;      
                do{
                

                    System.out.println("Digite seu CPF: ");
                    String cpf = sc.nextLine();

                    paciente = LoginPaciente.buscarPaciente(cpf, list);
                    
                    if(paciente == null){
                        System.out.println("CPF não encontrado");
                    }else {
                        System.out.println("Digite sua senha:");
                        String senha = sc.nextLine();
                        if (senha.equals(paciente.getSenha())) {
                            System.out.println("Login realizado!");
                            loginRealizado=true;
                        } else {
                            System.out.println("Senha incorreta!");
                        }
                    }
                }while(!loginRealizado);

                MenuPaciente.mostrarMenu(sc, paciente, agendas);
                break;

            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção invalida");                   
            }

        }while(opcao != 0);
        
    }

}
