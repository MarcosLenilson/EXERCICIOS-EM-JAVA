package Exercicios_POO_Curso_em_Video;

public class ProjetoPessoas {
    public static void main(String[] args) {
        // Programa principal

        Pessoa p1 = new Pessoa();
        p1.setName("Pedro");
        p1.setIdade(18);
        p1.setSexo("Masculino");

        
        
        Aluno p2 = new Aluno();
        p2.setName("Maria");
        p2.setIdade(22);
        p2.setSexo("Feminino");
        p2.setCurso("Desenvolvedor");

        Professor p3 = new Professor();
        p3.setName("Marcos");
        p3.setIdade(56);
        p3.setSexo("Masculino");
        p3.setSalario(2500f);
        p3.setEspecialidade("Programador Senior");


        Funcionario p4 = new Funcionario();
        p4.setName("Paulo");
        p4.setIdade(44);
        p4.setSexo("Masculino");
        p4.setSetor("Dep Pessoal");


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
