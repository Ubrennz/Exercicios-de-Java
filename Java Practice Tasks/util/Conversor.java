package util;

public class Conversor {
    public static double ConverterParaDolar(Double precoDolar, double compraDolar) {
        double compra = precoDolar * compraDolar;
        double taxa = 6.0 / 100 * compra;
        double precoFinal = taxa + compra;
        return precoFinal;
    }
}
