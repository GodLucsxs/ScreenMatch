public class Film {
    private String name;
    private int anoDeLancamento;
    private boolean inclundoPlano;
    private double somaAvaliacoes;
    private int totalAvalicao;
    private int duracaoMinutos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvalicao() {
        return totalAvalicao;
    }

    public void setTotalAvalicao(int totalAvalicao) {
        this.totalAvalicao = totalAvalicao;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public boolean isInclundoPlano() {
        return inclundoPlano;
    }

    public void setInclundoPlano(boolean inclundoPlano) {
        this.inclundoPlano = inclundoPlano;
    }

    void ExibirFicha(){
        System.out.println("Nome: "+name);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }
    void Avalia(double nota){
        somaAvaliacoes+= nota;
        totalAvalicao ++;

    }

    }

