public class EmpregadoComissao extends Object
{
    private String nome;
    private String sobrenome;
    private String cpf;
    private double vendasBrutas;
    private double taxaDeComissao;

    public EmpregadoComissao(String nome, String sobrenome, String cpf,
                double vendasBrutas, double taxaDeComissao) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        setVendasBrutas(vendasBrutas);
        setTaxaDeComissao(taxaDeComissao); 
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
     * @return O rendimento do funcionario
     */
    public double rendimentos() {
        return getTaxaDeComissao() * getVendasBrutas();
    }

    // retorna a representação em String do objeto
    @Override // indica que esse objeto sobrescreve o método da superclasse
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
            "Comissionado", getNome(), getSobrenome(),
            "CPF", getCpf(),
            "Vendas Brutas", getVendasBrutas(),
            "Taxa de Comissão", getTaxaDeComissao());
    }
}