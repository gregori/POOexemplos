/**
 * TesteEmpregadoComissao
 */
public class TesteEmpregadoComissao {

    public static void main(String[] args) {
        EmpregadoComissao empregado = new EmpregadoComissao(
            "Sue", "Jones", "123.456.789-00", 10000, .06);

        System.out.println(
            "Informação do empregado obtida por métodos get: ");
        System.out.printf(
            "%s %s\n", "Nome é", empregado.getNome()
        );
        System.out.printf(
            "%s %s\n", "Sobrenome é", empregado.getSobrenome()
        );
        System.out.printf(
            "%s %s\n", "CPF é", empregado.getCpf()
        );
        System.out.printf(
            "%s %s\n", "Vendas brutas é", empregado.getVendasBrutas()
        );
        System.out.printf(
            "%s %s\n", "Taxa de comissão é", empregado.getTaxaDeComissao()
        );

        empregado.setVendasBrutas(500);
        empregado.setTaxaDeComissao(.1);

        System.out.printf(
            "\n%s:\n\n%s\n", 
            "Informação atualizada obtida via toString", empregado
        );

    }
}