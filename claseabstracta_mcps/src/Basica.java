public class Basica extends Calculadora {



    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a*b;
    }

    @Override
    public double potencia(double base, double exponente) {
        return 0;
    }
}
