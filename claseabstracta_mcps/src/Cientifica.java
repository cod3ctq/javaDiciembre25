public class Cientifica extends Calculadora  implements OperacionesAvanzadas, Graficacion{
    //Herendado de 1 clase, implementando 1 interface

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
        double resultado= 0.0;
        for(int i=1; i<=b; i++){
            resultado= resultado + a;
        }
    return resultado;


    }

    //Metodos de la forma 3: traidos de una interface
    @Override
    public double raizaCuadrada(double num) {
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

    @Override
    public void crearGrafica() {
        
    }

    @Override
    public void enviarGraficaFuncion() {

    }

    @Override
    public void enviarPorBluetooth() {

    }

//Cuando colocar manualmente el @Override en el codigo?
    //Al momento

}



