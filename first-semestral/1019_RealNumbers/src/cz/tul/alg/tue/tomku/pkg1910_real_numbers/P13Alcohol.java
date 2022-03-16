package cz.tul.alg.tue.tomku.pkg1910_real_numbers;

public class P13Alcohol {
    public static void main(String[] args) {
        double qLiters = 1000;
        double pAlc = 5;
        double mW = 78;
        final double rho = 0.8;
        final double r = 0.7;
        final double beta = 0.1;
        int hour = 2;

        double met = (qLiters * pAlc * rho) / 100;
        double prom = met / (mW * r);
        double uet = mW * beta;
        double remain = met - (uet * hour);
        double reProm = remain / (mW * r);
        double sober = met / uet;


        System.out.format("Hmotnost vypitého ethanolu: %.2fg.", met);
        System.out.format("\nPromile v krvi ihned po konzumaci: %.2f.", prom);
        System.out.format("\nBudete střízlivět: %.2f hodin. \nPo %s hod. máte %.2f promile alkoholu.", sober, hour, reProm);
    }
}
