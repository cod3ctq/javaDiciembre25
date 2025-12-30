public class Cientifica extends Calculadora implements OperacionesAvanzadas, Graficacion{

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
        double result = 0.0;
        for(int i=1; i<=b; i++){
            result = result + a;
        }
        return result;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base,exponente);
    }

    // Metodos de la forma 3: traidos de una interface
    @Override
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double num) {
        return Math.sin(num);
    }

    @Override
    public void crearGrafica() {

    }

    @Override
    public void enviarGraficaFuncion() {

    }

    @Override
    public void enviarPorBluetooth() {

    }
}
