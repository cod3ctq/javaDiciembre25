public class Cientifica extends Calculadora implements OperacionesAvanzadas{

//Metodos de la forma 2
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
        double resultado = 0.0;
        for (int i = 1; i < b; i++){
            resultado += a;
        }

        return resultado;
    }

//Metodos de la forma 3, traidos de una interface
    @Override
    public double raisCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double num) {
        return Math.sin(num);
    }

    @Override
    public double potencia(double base, double exponente) {
        return Math.pow(base,exponente);
    }


}
