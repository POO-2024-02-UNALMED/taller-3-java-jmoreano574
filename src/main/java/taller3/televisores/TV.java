package taller3.televisores;

public class TV 
{
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
    public void set_Marca(Marca marca)
    {
        this.marca=marca;
    }
    public Marca get_Marca()
    {
        return this.marca;
    }
    public int get_canal()
    {
        return this.canal;
    }
    public void set_precio(int precio)
    {
        this.precio=precio;
    }
    public int get_precio()
    {
        return this.precio;
    }
    public int get_volumen()
    {
        return this.volumen;
    }
    public void set_control(Control control)
    {
        this.control=control;
    }
    public Control get_control()
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
    public boolean get_estado()
    {
        return this.estado;
    }
    //metodos para cambio de canal y volumen
    public void canalUp ()
    {
        this.set_canal(this.canal + 1);
    }
    public void canalDown()
    {
        this.set_canal(this.canal - 1);
    }
    public void volumenUP()
    {
        this.set_volumen(this.canal + 1);
    }
    public void volumenDown()
    {
        this.set_volumen(this.canal - 1);
    }
    //condiciones para cambiar canal y volumen
    public void set_canal(int canal)
    {
    if (this.estado = true && canal > 0 && canal <= 120)
            this.canal = canal; 
    }
    public void set_volumen(int volumen)
    {
    if (this.estado = true && volumen >= 0 && volumen <= 7)
            this.volumen = volumen;
    }
}    
