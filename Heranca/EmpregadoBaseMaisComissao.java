public class EmpregadoBaseMaisComissao 
{
    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasBrutas;
    private double taxaDeComissao;
    private double salarioBase;

    public EmpregadoBaseMaisComissao(String nome, String sobrenome, String cpf,
                double vendasBrutas, double taxaDeComissao, double salarioBase) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        setVendasBrutas(vendasBrutas);
        setTaxaDeComissao(taxaDeComissao);
        this.salarioBase = salarioBase;  
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param vendasBrutas the vendasBrutas to set
     */
    public void setVendasBrutas(double vendasBrutas) {
        if (vendasBrutas >= 0.0)
            this.vendasBrutas = vendasBrutas;
        else
            throw new IllegalArgumentException(
                "Vendas Brutas devem ser >= 0.0"
            );
    }

    /**
     * @return the vendasBrutas
     */
    public double getVendasBrutas() {
        return vendasBrutas;
    }

    /**
     * @param taxaDeComissao the taxaDeComissao to set
     */
    public void setTaxaDeComissao(double taxaDeComissao) {
        if (taxaDeComissao > 0.0 && taxaDeComissao < 1.0)
            this.taxaDeComissao = taxaDeComissao;
        else
            throw new IllegalArgumentException(
                "A taxa de comissão deve ser > 0.0 e < 1.0"
            );
    }

    /**
     * @return the taxaDeComissao
     */
    public double getTaxaDeComissao() {
        return taxaDeComissao;
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
    public double rendimentos() {
        return salarioBase + taxaDeComissao * vendasBrutas;
    }

    // retorna a representação em String do objeto
    @Override // indica que esse objeto sobrescreve o método da superclasse
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
            "Empregado de Comissão", nome, sobrenome,
            "CPF", cpf,
            "Vendas Brutas", vendasBrutas,
            "Taxa de Comissão", taxaDeComissao,
            "Salario Base", salarioBase);
    }
}