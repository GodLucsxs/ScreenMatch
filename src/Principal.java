public class Principal {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.setName("Mentiras doces, Verdades amargas");
        film1.setAnoDeLancamento(2004);
        film1.setSomaAvaliacoes(040);
        film1.setDuracaoMinutos(120);
        film1.setInclundoPlano(true);
        film1.setTotalAvalicao(1034);

        film1.ExibirFicha();
        film1.Avalia(7);
        film1.Avalia(4);
        film1.Avalia(8.9);
        film1.Avalia(2);
        film1.Avalia(7);

    }
}
