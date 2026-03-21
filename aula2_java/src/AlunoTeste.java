public class AlunoTeste {
    public static void main(String[] args) {

        //Objeto Incompleto
        Aluno aluno = new Aluno();

        System.out.println("\n------------------------");
        System.out.println("Nome do aluno " + aluno.getNome());
        System.out.println("Matricula do aluno " + aluno.getMatricula());


        System.out.println("\n------------------------");
        //Objeto Completo
        Aluno outroAluno = new Aluno("Felipe", "571956");
        System.out.println("Nome do aluno " + outroAluno.getNome());
        System.out.println("Matricula do alhno " + outroAluno.getMatricula());
    }
}
