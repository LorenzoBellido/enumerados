package ejercicio2;

public class Articulo {

	enum Departamento{
		ELECTRÓNICA, DROGUERÍA, ALIMENTACIÓN
	}
	
	private int codigo;
	
	private String descripcion = "";
	
	private double precioCompra;
	
	private double precioVenta;
	
	private int stock;
	
	private Departamento departamento;

	public Articulo() {

	}
	
	

	public Articulo(int codigo) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
	}



	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock, String departamento) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
		if(descripcion != null && !descripcion.equals("")) {			
			this.descripcion = descripcion;
		}
		if(precioCompra > 0) {			
			this.precioCompra = precioCompra;
		}
		if(precioVenta > 0) {			
			this.precioVenta = precioVenta;
		}
		if(stock >= 0) {			
			this.stock = stock;
		}
		
		this.departamento = Departamento.valueOf(departamento.toUpperCase());
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if(descripcion != null && !descripcion.equals("")) {			
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if(precioCompra > 0) {			
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if(precioVenta > 0) {			
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if(stock >= 0) {			
			this.stock = stock;
		}
	}
	
	

	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = Departamento.valueOf(departamento.toUpperCase());
	}



	@Override
	public String toString() {
		String cadena = "------------ \n";
		cadena +="Código: " + this.codigo +"\n";
		cadena +="Descripcion: " + this.descripcion +"\n";
		cadena +="Precio Compra: " + this.precioCompra +"\n"; 
		cadena +="Precio Venta: " + this.precioVenta +"\n";
		cadena +="Stock: " + this.stock +"\n";
		cadena +="Departamento: " + this.stock +"\n";
		return cadena;
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Articulo art = (Articulo) obj;
		
		if(this.codigo == art.codigo) {
			iguales = true;
		}
		
		return iguales;
	}
	
	
}
