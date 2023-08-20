package org.comandos;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno();

        String nome = JOptionPane.showInputDialog("What is your name?");
        String idade = JOptionPane.showInputDialog("How old are you?");
        String dataDeNasi = JOptionPane.showInputDialog("What is your date of birth?");
        String nomeEscola = JOptionPane.showInputDialog("What is the name of your college?");
        String serieMatri = JOptionPane.showInputDialog("What period of college are you in?");


        aluno1.setDataMatricula("12");
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataDeNasi);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatri);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(9.2);

        aluno1.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");
        disciplina2.setNota(8.5);

        aluno1.getDisciplinas().add(disciplina2);


        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Sql");
        disciplina3.setNota(9.1);


        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Dba");
        disciplina4.setNota(8.0);

        System.out.println(aluno1);
        System.out.println("The average of the student's grades is: " + aluno1.getMediaNota());
        System.out.println("Result: " + (aluno1.getAlunoAprovado() ? "Approved" : "Failed"));


        /*
        Aluno aluno1 = new Aluno();
        aluno1.setNome("teste");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("teste");

        if(aluno1.equals(aluno2)){
            System.out.println("Alunos sao iguais");
        } else {
            System.out.println("Nao sao iguais");
        }
         */


    }
}