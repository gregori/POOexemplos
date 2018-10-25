public class EmpregadoBaseMaisComissao extends EmpregadoComissao
{
    private double salarioBase;

    public EmpregadoBaseMaisComissao(String nome, String sobrenome, String cpf,
                double vendasBrutas, double taxaDeComissao, double salarioBase) 
    {
        super(nome, sobrenome, cpf, vendasBrutas, taxaDeComissao);
        setSalarioBase(salarioBase);  
    }

    
    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0.0)
            this.salarioBase = salarioBase;
        else
            throw new IllegalArgumentException(
                "Salário deve ser >= 0.0"
            );
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @return O rendimento do funcionario
     */
    @Override
    public double rendimentos() {
        return getSalarioBase() + super.rendimentos();
    }

    // retorna a representação em String do objeto
    @Override // indica que esse objeto sobrescreve o método da superclasse
    public String toString() {
        return String.format("%s %s\n%s: %.2f", 
            "Salário base e", super.toString(),
            "Salario Base", getSalarioBase());
    }
}