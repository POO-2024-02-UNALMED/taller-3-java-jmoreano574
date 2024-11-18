package taller3.televisores;

public class TV 
{

    public static int getNumTv() {
        return numTv;
    }
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTv;
    
    public TV(Marca marca, boolean estado)
    {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTv++;
        //metodo setter y getter
    }
    public void setMarca(Marca marca)
    {
        this.marca=marca;
    }
    public Marca getMarca()
    {
        return this.marca;
    }
    public int getCanal()
    {
        return this.canal;
    }
    public void setPrecio(int precio)
    {
        this.precio=precio;
    }
    public int getPrecio()
    {
        return this.precio;
    }
    public int getVolumen()
    {
        return this.volumen;
    }
    public void setControl(Control control)
    {
        this.control=control;
    }
    public Control getControl()
    {
        return this.control;
    }
    //metodos para acambiar de encendido a apagado
    public void turnOn()
    {
        this.estado=true;
    }
    public void turnOff()
    {
        this.estado=false;
    }
    //metodos get estado para acambiar de encendido a apagado
    public boolean getEstado()
    {
        return this.estado;
    }
    //metodos para cambio de canal y volumen
    public void canalUp ()
    {
        this.setCanal(this.canal + 1);
    }
    public void canalDown()
    {
        this.setCanal(this.canal - 1);
    }
    public void volumenUp()
    {
        this.setVolumen(this.canal + 1);
    }
    public void volumenDown()
    {
        this.setVolumen(this.canal - 1);
    }
    //condiciones para cambiar canal y volumen
    public void setCanal(int canal)
    {
    if (this.estado = true && canal >= 1 && canal <= 120)
            this.canal = canal; 
    }
    public void setVolumen(int volumen)
    {
    if (this.estado = true && volumen >= 0 && volumen <= 7)
            this.volumen = volumen;
    }
}    
