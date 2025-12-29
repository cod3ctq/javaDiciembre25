public class Cientifica extends Calculadora implements OperacionesAvanzadas{
//Heredadndo 1 de calse, implementando otro de interface
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
        double resultado=0.0;
        for (int i=1; i<=b; i++){
            resultado=resultado+a;
        }
        return resultado;
    }
//Metodos de la forma 3:traidos de una interface

    @Override
    public double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double seno(double num) {
        return Math.sin(num);
    }

    @Override
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    //Cuando colocal manualmenteel override en el codigo?
    //Al momento de sobreescribir los metodos heredados de una clase no abstracta

    //Cuando se coloca automaticamente?
    //Al heredar y sobreescribir los metodos de una clase abstracta
    //al implementar los metodos de una interface
}
