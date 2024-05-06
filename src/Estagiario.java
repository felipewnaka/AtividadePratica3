public class Estagiario extends Funcionario {
    private int horasTrabalho;
    // Removendo a variável não utilizada 'supervisor'

    public Estagiario(String nome, int matricula, int horasTrabalho) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public double calcularSalario() {
        // Exemplo de implementação do cálculo do salário do estagiário
        // Supondo um salário base por hora trabalhada
        double salarioBasePorHora = 10; // Exemplo de salário base por hora
        return salarioBasePorHora * horasTrabalho;
    }
    // Getters e Setters
}