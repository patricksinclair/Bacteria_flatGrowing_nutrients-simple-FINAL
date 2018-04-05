public class Bacteria {

    private int m;

    private double d= 0., b = 0.1;
    private double K_prime = 33.;

    public Bacteria(int m){
        this.m = m;
    }

    public int getM(){return m;}
    public double getB(){return b;}
    public double getD(){return d;}


    public double beta(double s, double s_max){

        return 5.;
    }

    public double growthRate(double c, double s, double s_max){

        double phi_c = 1. - (c/beta(s, s_max))*(c/beta(s, s_max));
        return (phi_c > 0.) ? phi_c : 0.;
    }

    public double replicationRate(double c, double s, double s_max){

        return growthRate(c, s, s_max)*(s/(K_prime + s));
    }
}
