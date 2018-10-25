public class EmpregadoComissao extends Empregado
{
    private double vendasBrutas;
    private double taxaDeComissao;

    public EmpregadoComissao(String nome, String sobrenome, String cpf,
                double vendasBrutas, double taxaDeComissao) 
    {
        super(nome, sobrenome, cpf);

        setVendasBrutas(vendasBrutas);
        setTaxaDeComissao(taxaDeComissao); 
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
        return String.format("%s %s\n%s: %.2f\n%s: %.2f", 
            "Comissionado", super.toString(),
            "Vendas Brutas", getVendasBrutas(),
            "Taxa de Comissão", getTaxaDeComissao());
    }
}