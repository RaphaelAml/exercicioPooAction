package classes;

public class Disciplina {

    private double nota;
    private String disciplina;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDisciplina(String bancoDeDados) {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina that)) return false;

        if (Double.compare(that.getNota(), getNota()) != 0) return false;
        return getDisciplina("Banco de dados") != null ? getDisciplina("Banco de dados").
                equals(that.getDisciplina("Banco de dados")) : that.getDisciplina("Banco de dados") == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getNota());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDisciplina("Banco de dados") != null ? getDisciplina("Banco de dados").hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota=" + nota +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
