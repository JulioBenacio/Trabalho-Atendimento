import java.time.LocalDate;

public class Paciente{

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone){
     this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public Paciente(
        String nome,
        LocalDate dataNascimento,
        String cpf,
        String telefone,
        String email,
        String senha
    ) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    @Override
    public String toString() {
        return  "========================\n"+
                "Nome: " + nome +
                "\nData de nascimento: " + dataNascimento +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nSenha: " + senha +
                "\n=======================";
    }
}
