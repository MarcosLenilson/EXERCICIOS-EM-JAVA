package Exercicios_POO_Curso_em_Video.Heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(){
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [name = " + getName() + ", idade = " + getIdade() + ", sexo = " + getSexo() + ", especialidade = " + especialidade + ", salario = " + salario + "]";
    }
    
}
