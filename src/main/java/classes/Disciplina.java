package classes;

public class Disciplina {

    private double nota1;
    private String disciplina1;
    private double nota2;
    private String disciplina2;
    private double nota3;
    private String disciplina3;
    private double nota4;
    private String disciplina4;


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String diciplina1) {
        this.disciplina1 = diciplina1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getDisciplina4() {
        return disciplina4;
    }

    public void setDisciplina4(String disciplina4) {
        this.disciplina4 = disciplina4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina disciplina)) return false;

        if (Double.compare(disciplina.getNota1(), getNota1()) != 0) return false;
        if (Double.compare(disciplina.getNota2(), getNota2()) != 0) return false;
        if (Double.compare(disciplina.getNota3(), getNota3()) != 0) return false;
        if (Double.compare(disciplina.getNota4(), getNota4()) != 0) return false;
        if (getDisciplina1() != null ? !getDisciplina1().equals(disciplina.getDisciplina1()) : disciplina.getDisciplina1() != null)
            return false;
        if (getDisciplina2() != null ? !getDisciplina2().equals(disciplina.getDisciplina2()) : disciplina.getDisciplina2() != null)
            return false;
        if (getDisciplina3() != null ? !getDisciplina3().equals(disciplina.getDisciplina3()) : disciplina.getDisciplina3() != null)
            return false;
        return getDisciplina4() != null ? getDisciplina4().equals(disciplina.getDisciplina4()) : disciplina.getDisciplina4() == null;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nota1=" + nota1 +
                ", disciplina1='" + disciplina1 + '\'' +
                ", nota2=" + nota2 +
                ", disciplina2='" + disciplina2 + '\'' +
                ", nota3=" + nota3 +
                ", disciplina3='" + disciplina3 + '\'' +
                ", nota4=" + nota4 +
                ", disciplina4='" + disciplina4 + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getNota1());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDisciplina1() != null ? getDisciplina1().hashCode() : 0);
        temp = Double.doubleToLongBits(getNota2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDisciplina2() != null ? getDisciplina2().hashCode() : 0);
        temp = Double.doubleToLongBits(getNota3());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDisciplina3() != null ? getDisciplina3().hashCode() : 0);
        temp = Double.doubleToLongBits(getNota4());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDisciplina4() != null ? getDisciplina4().hashCode() : 0);
        return result;
    }
}
