package estruturaDeDados.composicao.muitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;

    final List<Curso> cursos = new ArrayList<>();


    public Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }


    @Override
    public String toString() {
        return nome;
    }

    Curso obterCursoPorNome(String nome){
        Curso procurado = null;


        for (Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }


        }

        return null;


    }


}
