import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private LocalTime horario;
    private String especialidade;

    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public Medico getMedico(){
        return medico;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public LocalTime getHorario(){
        return horario;
    }
    public void setHorario(LocalTime horario){
        this.horario = horario;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public Agendamento(
        Paciente paciente,
        Medico medico,
        LocalDate data,
        LocalTime horario,
        String especialidade
    ) {

        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
        this.especialidade = especialidade;
    }
}

