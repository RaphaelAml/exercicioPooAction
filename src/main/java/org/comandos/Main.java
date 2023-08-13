package org.comandos;

import classes.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Test");
        Aluno aluno3 = new Aluno("Teste1",26);

        aluno1.setNome("Teste");
        aluno1.setDataMatricula("12");
        aluno1.setIdade(26);
        aluno1.setNomeEscola("Testando tudo");

        System.out.println("Student name: " + aluno1.getNome());
        System.out.println("Student id: " + aluno1.getDataMatricula());
        System.out.println("Student age: " + aluno1.getIdade());
        System.out.println("School: " + aluno1.getNomeEscola());


    }
}