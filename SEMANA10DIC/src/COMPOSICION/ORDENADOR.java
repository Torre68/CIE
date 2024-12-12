package COMPOSICION;

public class ORDENADOR {
	
	private Monitor monitor;
	private CPU cpu;
	
	
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public ORDENADOR(Monitor monitor, CPU cpu) {
		super();
		this.monitor = monitor;
		this.cpu = cpu;
	}
	public double getPrecioTotal() {
	//Ojo al hacer esta funcion ya que hay que recoger las variables, no el nombre de las variables
		// monitor y cpu (en este caso) en vez de Monitor y Cpu
	return monitor.getPrecio()+cpu.getPrecio();
	}

}
