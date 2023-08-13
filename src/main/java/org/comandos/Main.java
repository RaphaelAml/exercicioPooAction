package org.comandos;

import classes.Aluno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        /*
        Aluno aluno2 = new Aluno("Test");
        Aluno aluno3 = new Aluno("Teste1",26);
        */

        String nome = JOptionPane.showInputDialog("What is your name?");
        String idade = JOptionPane.showInputDialog("How old are you?");
        String dataDeNasi = JOptionPane.showInputDialog("What is your date of birth?");
        String nomeEscola = JOptionPane.showInputDialog("What is the name of your college?");
        String serieMatri = JOptionPane.showInputDialog("What period of college are you in?");
        String nota1 = JOptionPane.showInputDialog("Nota1");
        String nota2 = JOptionPane.showInputDialog("Nota2");
        String nota3 = JOptionPane.showInputDialog("Nota3");
        String nota4 = JOptionPane.showInputDialog("Nota4?");

        aluno1.setDataMatricula("12");
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataDeNasi);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatri);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));


        System.out.println(aluno1);
        System.out.println("The average of the student's grades is: " + aluno1.getMediaNota());
        System.out.println("Result: " + (aluno1.getAlunoAprovado() ? "Approved" : "Failed"));




    }
}