package org.comandos;

import classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno();

        String nome = JOptionPane.showInputDialog("What is your name?");
        String idade = JOptionPane.showInputDialog("How old are you?");
        String dataDeNasi = JOptionPane.showInputDialog("What is your date of birth?");
        String nomeEscola = JOptionPane.showInputDialog("What is the name of your college?");
        String serieMatri = JOptionPane.showInputDialog("What period of college are you in?");

        String disciplina1 = JOptionPane.showInputDialog("Qual o nome da diciplina1?");
        String nota1 = JOptionPane.showInputDialog("Nota1");

        String disciplina2 = JOptionPane.showInputDialog("Qual o nome da diciplina2?");
        String nota2 = JOptionPane.showInputDialog("Nota2");

        String disciplina3 = JOptionPane.showInputDialog("Qual o nome da diciplina3?");
        String nota3 = JOptionPane.showInputDialog("Nota3");

        String disciplina4 = JOptionPane.showInputDialog("Qual o nome da diciplina4?");
        String nota4 = JOptionPane.showInputDialog("Nota4?");

        aluno1.setDataMatricula("12");
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataDeNasi);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatri);

        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);


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