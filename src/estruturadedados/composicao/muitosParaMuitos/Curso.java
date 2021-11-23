package estruturadedados.composicao.muitosParaMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;

    final List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {

        this.nome = nome;
        //não pode fazer isso pois cursos é constatnte, e arraylist pode adicionar remover ...
        //this.cursos = new ArrayList<>();
    }



    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }




}
