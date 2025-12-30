void main() {
//Clase abstracta es aquella que contiene almenos 1 metodo abstracto
    //Metodo abstracto es cuando el metodo no tiene cuerpo ni logica de implementacion
    //Es un modelo generico de algo... define una base conseptual incompleta
    //con 1 o mas metodos abstractos no se puede crear instancias de ella

    //Profesionista prof = new Profesionista();
    Profesionista c1= new Contador();

    //el polimorfismo:
    //Sobreescrirura: cambiar la logica
    //sobrecarga de metodos
    //herencia
    //
    Calculadora cc1= new Basica();//objeto de la clase hija
    System.out.println(cc1.suma(5,9));
    System.out.println(cc1.resta(7,2));
    System.out.println(cc1.multiplicacion(3,9));

    Cientifica cc2= new Cientifica();
    System.out.println(cc2.suma(3,20));
    System.out.println(cc2.resta(5,4));
    System.out.println(cc2.multiplicacion(8,5));
    System.out.println(cc2.raizCuadrada(40));
    System.out.println(cc2.seno(80));
    System.out.println(cc2.potencia(4,8));

}
