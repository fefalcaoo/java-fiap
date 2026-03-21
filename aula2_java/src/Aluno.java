public class Aluno {

    //atributos
    private String nome;
    private String matricula;

    //construtor

    //construtor vazio - criação de objetos incompletos
    public Aluno() {
        System.out.println("Criação de Objeto Imcompleto");
    }

    //construtor parametrizado - criação de objetos completos
    public Aluno(String nome, String matricula){
        System.out.println("Criação de Objeto Completo");
        this.nome = nome;
        this.matricula = matricula;
    }

    //getters and setters
    public String getNome(){
        return this.nome;
    }

    //metodos
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
