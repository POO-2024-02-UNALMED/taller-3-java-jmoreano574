package taller3.televisores;

public class Control 
{
    private TV tv;

    
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void set_Canal(int canal) {
		this.tv.set_Canal(canal);
	}
	
	public void set_Volumen(int volumen) {
		this.tv.set_Volumen(volumen);
	}
    public Tv enlazar(Tv tv )
    {
        this.tv = tv;
		tv.set_Control(this);
    }

    public void TV set_Tv(TV tv)
    {
        this.tv = tv;
    }
    public TV get_Tv()
    {
        return this.tv;
    }
     
}
