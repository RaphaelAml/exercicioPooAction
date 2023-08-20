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

        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " +pos+ "?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " +pos+ "?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null,"Do you want to remove any disciplina 1, 2, 3 ou 4 ?");

        if(escolha == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("What is the discipline?");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }

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