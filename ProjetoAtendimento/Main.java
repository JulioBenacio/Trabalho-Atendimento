import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        ArrayList <Paciente> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String resposta;
        do{
            System.out.println("====== CADASTRO DE PACIENTE ======");
            System.out.println("Digite o seu nome: ");
                String nome =sc.nextLine();
            System.out.println("Digite a sua data de nascimento: ");
                String dataNascimento=sc.nextLine();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(dataNascimento, formato);
            System.out.println("Digite o seu CPF: ");
                String cpf =sc.nextLine();
            System.out.println("Digite o seu telefone: ");
                String telefone =sc.nextLine();
            System.out.println("Digite o seu email: ");
                String email=sc.nextLine();
            System.out.println("Digite a sua senha: ");
                String senha =sc.nextLine();

            Paciente paciente = new Paciente(nome, data, cpf, telefone, email, senha);
            list.add(paciente);
            System.out.println("paciente cadastrado!");
            do{
            System.out.println("Deseja cadastrar outro paciente? (s/n) ");
                resposta = sc.nextLine();

            if(!resposta.equalsIgnoreCase("n") && !resposta.equalsIgnoreCase("s")){
                System.out.println("Resposta inválida");
            }     
            }while (!resposta.equalsIgnoreCase("n")  && !resposta.equalsIgnoreCase("s")); 
        } while(resposta.equalsIgnoreCase("s"));
        System.out.println("====== PACIENTES CADASTRADOS ======");
        for (int x=0;x < list.size();x++){
            System.out.println(list.get(x));
        }

    }

}
