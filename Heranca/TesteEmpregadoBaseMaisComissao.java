/**
 * TesteEmpregadoComissao
 */
public class TesteEmpregadoBaseMaisComissao {

    public static void main(String[] args) {
        EmpregadoBaseMaisComissao empregado = new EmpregadoBaseMaisComissao(
            "Bob", "Lewis", "321.654.987-11", 5000, .04, 300);

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
        System.out.printf(
            "%s %s\n", "Salário base é", empregado.getSalarioBase()
        );

        empregado.setSalarioBase(1000);

        System.out.printf(
            "\n%s:\n\n%s\n", 
            "Informação atualizada obtida via toString", empregado
        );

    }
}