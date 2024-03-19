package ejercicio1;

/**
 * Clase libro donde se guardaran los metodos para hacer prestamos y devolver
 * libros
 * 
 * @author ljbellido
 * @version 1.0
 */
public class Libro {

	enum Genero {
		NARRATIVO, POÉTICO, DRAMÁTICO, LIÍRICO , DIDÁCTICO
	}

	/**
	 * Atributo donde guardar el título del libro
	 */
	private String titulo = "";
	/**
	 * Atributo donde guardar el autor del libro
	 */
	private String autor = "";
	/**
	 * Atributo donde guardar el ejemplares del libro
	 */
	private int ejemplares;
	/**
	 * Atributo donde guardar el prestados del libro
	 */
	private int prestados;

	/**
	 * Atributo de tipo genero
	 */
	private Genero genero;

	/**
	 * Constructor sin parámetros
	 */
	public Libro() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param titulo     Cadena con el titulo del libro
	 * @param autor      Cadena con el autor del libro
	 * @param ejemplares Entero con el ejemplares del libro
	 * @param prestados  Entero con el prestamos del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.equals("")) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados >= 0) {
			this.prestados = prestados;
		}
		
		this.genero = Genero.valueOf(genero.toUpperCase());
	}

	/**
	 * Método que te devuelve el titulo del libro
	 * 
	 * @return Devuelve el título
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método que te devuelve el autor del libro
	 * 
	 * @return Devuelve el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método que devuelve el número de ejemlares
	 * 
	 * @return Número de ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Método que cambia los ejemplares
	 * 
	 * @param ejemplares Número nuevo de ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Método que suma los libros prestados y devuelve un booleano si hay ejemplares
	 * disponibles
	 * 
	 * @return Devuelve un true si hay ejemplares y un false si no
	 */
	public boolean prestamo() {
		boolean prestamo = false;

		if (this.ejemplares > 0) {
			this.prestados++;
			prestamo = true;
		}

		return prestamo;
	}

	/**
	 * Método que suma los ejemplares y devuelve un booleano si hay prestamos
	 * disponibles
	 * 
	 * @return
	 */
	public boolean devuelve() {
		boolean devuelve = false;

		if (this.prestados > 0) {
			this.ejemplares++;
			this.prestados--;
			devuelve = true;
		}

		return devuelve;
	}

	@Override
	public String toString() {

		String cadena = "-------Libro-------\n";

		cadena += "Autor: " + this.autor + "\n";
		cadena += "Título: " + this.titulo + "\n";
		cadena += "Ejemplares: " + this.ejemplares + "\n";
		cadena += "Género: " + this.genero + "\n";
		cadena += "Prestados: " + this.prestados + "\n";

		return cadena;
	}
}
