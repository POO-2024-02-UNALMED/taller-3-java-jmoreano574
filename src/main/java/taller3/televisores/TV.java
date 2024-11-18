package taller3.televisores;

public class TV 
{
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTv = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTv++;  // Incrementar el contador de televisores
    }

    // Método getter para el número de televisores
    public static int getNumTv() {
        return numTv;
    }

    // Métodos setter y getter para los atributos
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setCanal(int canal) {
        if (estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return this.canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setVolumen(int volumen) {
        if (estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return this.control;
    }

    // Métodos para cambiar de encendido a apagado
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    // Método getter para el estado
    public boolean getEstado() {
        return this.estado;
    }

    // Métodos para cambio de canal y volumen
    public void canalUp() {
        if (estado && canal < 120) {
            this.canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            this.canal--;
        }
    }

    public void volumenUp() {
        if (estado && volumen < 7) {
            this.volumen++;
        }
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            this.volumen--;
        }
    }

    // Métodos para cambiar canal y volumen con condiciones
    public void setTV(int canal) {
        if (this.estado == true && canal >= 1 && canal <= 120) {
            this.canal = canal; 
        }
    }

    public void setVolumen(int volumen) {
        if (this.estado == true && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }
}
