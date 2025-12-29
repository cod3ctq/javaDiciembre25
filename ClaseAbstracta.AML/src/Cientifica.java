public class Cientifica extends Calculadora implements OperecionesAvanzadas{
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
        for (int i=1; i<=b;i++){
            resultado=resultado+a;
        }
        return resultado;
    }

    @Override
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double num) {
        return Math.sin(num);
    }

    public double potencia(double base, double exponente){
        return Math.pow(base,exponente);
    }
    
}
