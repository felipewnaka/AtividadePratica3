public class Gerente extends Funcionario {
    private double bonusAnual;
    // Removendo a variável não utilizada 'equipe'
    
    public Gerente(String nome, int matricula, double bonusAnual) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        // Exemplo de implementação do cálculo do salário do gerente
        // Supondo um salário base mais o bônus anual
        double salarioBase = 5000; // Exemplo de salário base
        return salarioBase + bonusAnual;
    }
    // Getters e Setters
}