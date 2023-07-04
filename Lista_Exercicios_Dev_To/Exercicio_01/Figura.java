package Lista_Exercicios_Dev_To.Exercicio_01;

public abstract class Figura {
    String cor;


    public Figura(){
    }

    public Figura(String cor){
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura [cor=" + cor + "]";
    }

    public abstract double area();

}