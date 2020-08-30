package taller3.televisores;
import taller3.televisores.*;
public class TV {

	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;

	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(estado) {
			if(canal>0 && canal<=120) {
				this.canal=canal;
			}
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(estado) {
			if(volumen>=0 && volumen<=7) {
				this.volumen = volumen;}}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	public static int getNumTV(){
		return numTV;
	}
	public static void setNumTV(int numTV){
		 TV.numTV=numTV;
	}
	public boolean getEstado() {
		return estado;
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public void canalUp() {
		if(estado) {
		if(canal<120) {canal++;}}
	}
	public void canalDown() {
		if(estado) {
		if(canal>1){canal--;}}
	}
	public void volumenUp() {
		if(estado && volumen<7) {volumen++;}
	}
	public void volumenDown() {
		if(estado && volumen>0) {volumen--;}
	}

	
}
