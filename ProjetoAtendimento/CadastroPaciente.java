import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPaciente {

    public static String cadastrarNome(Scanner sc) {

        String nome;

        do {
            System.out.println("Digite o seu nome: ");
            nome = sc.nextLine();

            if (nome.isBlank()) {
                System.out.println("Nome não pode ficar vazio!");
            }

        } while (nome.isBlank());

        return nome;
    }

    public static LocalDate cadastrarData(Scanner sc){

        LocalDate data = null;
        boolean dataValida = false;

        do{
                    
                System.out.println("Digite a sua data de nascimento: ");
                String dataNascimento=sc.nextLine();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                try{
                     data = LocalDate.parse(dataNascimento, formato);
                    System.out.println("Data válida!");
                    dataValida = true;
                }catch(Exception e){
                    System.out.println("Data inválida,tente novamente.");
                    dataValida = false;
                }
            }while(!dataValida);
            return data;
    }

    public static String cadastrarCpf(Scanner sc, ArrayList<Paciente>list){
            String cpf; 
            boolean cpfExiste;
            do{
                System.out.println("Digite o seu CPF: ");
                cpf =sc.nextLine();
                cpfExiste = false;
                if(cpf.isBlank()){
                    System.out.println("CPF não pode ficar vazio!");   
                }else if(!cpf.matches("\\d+")){
                    System.out.println("CPF tem que ser composto só com números!");
                }else if(cpf.length() != 11){
                    System.out.println("CPF deve ter 11 números!");
                }
                
                for (int x =0;x < list.size();x++) {
                    if(cpf.equals(list.get(x).getCpf())){
                    cpfExiste=true;
                    }
                }
                    if(cpfExiste){
                    System.out.println("CPF já existente!");
                    }
            
            }while(
                cpf.isBlank() || 
                !cpf.matches("\\d+") ||
                cpf.length() != 11  ||
                cpfExiste
            );
            return cpf;
    }

    public static String cadastrarTelefone(Scanner sc){
            String telefone;
            do{
                System.out.println("Digite o seu telefone: ");
                telefone =sc.nextLine();
                if(telefone.isBlank()){
                    System.out.println("Telefone não pode ficar vazio!");
                }else if(!telefone.matches("\\d+")){
                    System.out.println("Telefone não pode ter letras!");
                }else if(telefone.length() !=11 && telefone.length() != 10){
                    System.out.println("Telefone deve ter 10 ou 11 números!");
                }
            }while(
                telefone.isBlank() || 
                !telefone.matches("\\d+") || 
                telefone.length() !=11 && 
                telefone.length() != 10
            );
            return telefone;
    }

    public static String cadastrarEmail(Scanner sc){
        String email;
        do{
                System.out.println("Digite o seu email: ");
                email=sc.nextLine();
                if(email.isBlank()){
                    System.out.println("Email não pode ficar vazio!");
                }else if(!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")){
                System.out.println("Email inválido!");
                }
            }while(
                email.isBlank() ||
                !email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")
            );
            return email;
    }

    public static String cadastrarSenha(Scanner sc){
           String senha;
            do{
                System.out.println("Digite a sua senha: ");
                senha =sc.nextLine();
                if(senha.isBlank()){
                    System.out.println("Senha não pode ficar vazia!");
                }else if(senha.length() < 8){
                    System.out.println("Senha tem que ter pelo 8 caracteres! ");
                }
            }while(
                senha.isBlank() || 
                senha.length() < 8
            );
            return senha;
    }
}