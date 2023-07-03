package tp3;
public class Computadora {
    // Atributos
    private String marca;
    private String modelo;
    private int capacidadRAM;
    private double capacidadAlmacenamiento;

    // Constructor explicito nulo
    public Computadora(){}
    
    //Constructor explicito con un argumento, inicializa esa variable de instancia "marca"
    public Computadora(String marcaCompu){
      this.marca = marcaCompu;
    }

    //Constructor explicito con un argumento, inicializa esa variable de instancia "modelo"
    public Computadora(String modeloCompu){
      this.modelo = modeloCompu;
    }
  
    //Constructor explicito con dos argumento, inicializa esa variable de instancia "modelo", "marca"
    public Computadora(String marcaCompu, String modelo){
      this.marca = marcaCompu;
      this.modelo = modeloCompu;
    }

    //Constructor explicito con la inicializacion de todas las variables de instancia del objeto
    public Computadora(String marcaCompu, String modelo, int cantidadRam, double store){
      this.marca = marcaCompu;
      this.modelo = modeloCompu;
      this.capacidadRAM = cantidadRam;
      this.capacidadAlmacenamiento = store;
    }


    
    // Métodos
    public void encender() {
        System.out.println("La computadora se ha encendido.");
    }

    public void apagar() {
        System.out.println("La computadora se ha apagado.");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("RAM: " + capacidadRAM + " GB");
        System.out.println("Almacenamiento: " + capacidadAlmacenamiento + " TB");
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(int capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public double getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }
}
