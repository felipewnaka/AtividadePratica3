public class Desenvolvedor extends Funcionario {
    private String tecnologias;

    public Desenvolvedor(String nome, int matricula, String tecnologias) {
        super(nome, matricula);
        this.tecnologias = tecnologias;
    }

    @Override
    public double calcularSalario() {
        // Exemplo de implementação do cálculo do salário do desenvolvedor
        // Supondo um salário base mais um adicional por tecnologias dominadas
        double salarioBase = 4000; // Exemplo de salário base
        double adicionalPorTecnologias = 500 * tecnologias.split(",").length; // Exemplo de adicional por tecnologia
        return salarioBase + adicionalPorTecnologias;
    }
    // Getters e Setters
}