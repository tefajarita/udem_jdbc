package co.com.ensayoMVC.jdbc.entity;

public class Lugar {
	
	
	private int id;
	private String nombre;
	private String direccion;
	private Long alt;
	private Long lon;
	private String telefono;
	private String descripcion;
	private String horario;
	private String correo;
	
	
	public Lugar(String nombre, String direccion, long alt, long lon,String telefono,String descripcion, String horario,
			String correo) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.alt=alt;
		this.lon=lon;
		this.telefono=telefono;
		this.descripcion=descripcion;
		this.horario=horario;
		this.correo=correo;
		
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the alt
	 */
	public Long getAlt() {
		return alt;
	}
	/**
	 * @param alt the alt to set
	 */
	public void setAlt(Long alt) {
		this.alt = alt;
	}
	/**
	 * @return the lon
	 */
	public Long getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Long lon) {
		this.lon = lon;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
