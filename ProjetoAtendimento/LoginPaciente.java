import java.util.ArrayList;

public class LoginPaciente {
    public static Paciente buscarPaciente(String cpf, ArrayList<Paciente> list) {

    Paciente pacienteEncontrado = null;

    for(int x = 0; x < list.size(); x++){
        if (cpf.equals(list.get(x).getCpf())) {
            pacienteEncontrado = list.get(x);
        
        }
    
     
    }
    return pacienteEncontrado; 
    }
}
