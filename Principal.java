public class Principal {
    public static void main(String[] args){
        //Mas de dos objetos
        Entrada entrada1 = new Entrada("Obra de teatro",450.00 );
        Entrada entrada2 = new Entrada("Concierto",350.00);
        Entrada entrada3 = new Entrada("Cine",150.00);
        Entrada entrada4 = new Entrada("Exposición", 280.00);

//Llama al metodo mostrarInformacion() para mostrar los datos en consola
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();
        entrada4.mostrarInformacion();

    }
}
