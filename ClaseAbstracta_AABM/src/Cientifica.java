public class Cientifica extends calculadora implements OperacionesAvanzadas, Graficacion{

    //Heredando de 1 clase, implementando 1 interface
    //
//metodos de la forma 2
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

        for(int i=1; i<=b; i++){
           resultado =resultado + a;

        }
        return resultado;
    }
//Metodos de la forma 3: Traidos de una interface

    @Override
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double num) {
        return Math.sin(num);
    }
    @Override
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }

    @Override
    public void crearGrafica() {

    }

    @Override
    public void enviargraficaFuncion() {

    }

    @Override
    public void enviarPorBluethooth() {

    }

    //Cuando colocar manualmente el @Overrride en el codigo??
        //Al momento de sobreescribir los metodos heredados de una clase no abstracta

        //Cuando se coloca automaticamente el @Override
        //Al heredar  y sobreeescribir los metodos de una clase abstracta
        //Al implementar los metodos de una interface


}
