
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPaciente {
    public static void mostrarMenu(Scanner sc, Paciente paciente,ArrayList <Agendamento> agendas){
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
                    int opcaoAgendamento;
                    do{
                        System.out.println("===== AGENDAMENTOS =====");
                        System.out.println("1 - Novo agendamento");
                        System.out.println("2 - Meus agendamentos");
                        System.out.println("0 - Voltar");

                        System.out.println("Escolha uma opção: ");
                        opcaoAgendamento = sc.nextInt();
                        sc.nextLine();

                        switch (opcaoAgendamento) {
                            case 1:

                                System.out.println("Digite a especialidade: ");
                                String especialidade = sc.nextLine();

                                while (especialidade.isBlank()) {
                                    System.out.println("A especialidade não pode ficar vazia.");
                                    especialidade = sc.nextLine();
                                }
                                
                                boolean dataValida = false;
                                LocalDate data;
                                do{
                                System.out.println("Digite a data do agendamento (dd/MM/yyyy):");
                                String dataDigitada = sc.nextLine();

                                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                                try {
                                    data = LocalDate.parse(dataDigitada, formato);
                                    
                                    if( data.isBefore(LocalDate.now())){
                                        System.out.println("Data já passou!");
                                        dataValida= false;
                                    }else{
                                        System.out.println("Data valida!");
                                        dataValida = true;
                                    }    
                                } catch (Exception e) {
                                    System.out.println("Data invalida!");
                                    dataValida = false;
                                }

                                }while(!dataValida);

                                boolean horarioValido = false;
                                LocalTime horario;
                                do{
                                System.out.println("Digite o horário do agendamento (HH:mm):");
                                String horarioDigitado =sc.nextLine();

                                DateTimeFormatter relogio =
                                DateTimeFormatter.ofPattern("HH:mm");
                                try {
                                    horario =LocalTime.parse(horarioDigitado, relogio);
                                    System.out.println("horário valido!");
                                    horarioValido = true;

                                } catch (Exception e) {
                                    System.out.println("horario invalido!");
                                    horarioValido = false;

                                }
                                
                                }while(!horarioValido);


                                Agendamento agendamento = new Agendamento(
                                    paciente,
                                    medico,
                                    data,
                                    horario,
                                    especialidade
                                );

                                agendas.add(agendamento);
                                break;
                        
                            case 2 :

                                for (int x = 0; x < agendas.size(); x++){
                                    
                                    if (agendas.get(x).getPaciente() == paciente){
                                        System.out.println("===== MEUS AGENDAMENTOS =====");
                                        System.out.println("especialidade: " + agendas.get(x).getEspecialidade());
                                        
                                        System.out.println("Data: " + agendas.get(x).getData());
                                    
                                        System.out.println("Horário: " + agendas.get(x).getHorario());
                                        
                                    }
                                }

                                break;
                        
                            case 0 :

                                break;
                            default:System.out.println("Opção invalida!");
                                break;
                        }
                    }while(opcaoAgendamento != 0);
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
