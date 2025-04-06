public class Entrada {
    //Atributos
    String nombre;
    double precio;

    //Constructor
    public Entrada(String nombre    , double precio) {
        this.nombre = nombre;
        this.precio = precio;
        }

    //Metodo
    public void mostrarInformacion()
    {
        System.out.println("Evento: " + nombre);
        System.out.println("Precio: $" + precio);
    }

}