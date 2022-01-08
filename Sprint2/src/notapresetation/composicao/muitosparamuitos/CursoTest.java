package notapresetation.composicao.muitosparamuitos;

public class CursoTest {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Carlos");
        Aluno aluno3 = new Aluno("Rafaela");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Java Spring");
        Curso curso3 = new Curso("Java Web");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso3);

// alunos matriculados no curso
        for (Aluno aluno : curso2.alunos) {
            System.out.println("Estou matriculado no curso "+curso2.nome);
            System.out.println(" e meu nome é "+aluno.nome);
            System.out.println();

        }


        System.out.println(aluno1.cursos.get(0).alunos);

Curso  cursoencontrado = aluno1.obterCursoPorNome("Java");


if(cursoencontrado != null) {
    System.out.println(cursoencontrado.alunos);

}






    }
}
