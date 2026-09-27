import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        ArrayList <Paciente> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String resposta;

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

    }

}
