public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int diaAtual;
    private int mesAtual;
    private int anoAtual;

    public FrequenciaCardiaca(String nome, String sobrenome,
                int diaNascimento, int mesNascimento, int anoNascimento,
                int diaAtual, int mesAtual, int anoAtual) 
    {
        setNome(nome);
        setSobrenome(sobrenome);
        setDiaNascimento(diaNascimento);
        setMesNascimento(mesNascimento);
        setAnoNascimento(anoNascimento);
        setDiaAtual(diaAtual);
        setMesAtual(mesAtual);
        setAnoAtual(anoAtual);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getIdade() {
        int idade = anoAtual - anoNascimento;
        if (mesAtual == mesNascimento) {
            if (diaAtual < diaNascimento) {
                idade--;
            }
        } else if (mesAtual < mesNascimento) {
            idade--;
        }

        return idade;
    }

    public int getFCM() {
        return 220 - getIdade();
    }

    public int getFCAMax() {
        return 85 * getFCM() / 100;
    }

    public int getFCAMin() {
        return 50 * getFCM() / 100;
    }

}