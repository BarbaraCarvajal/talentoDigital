package empresaClase13;

public class Capacitacion {

	private String identificador, rut, dia, hora, lugar, duracion, cantAsistentes;
	private int numeroInterno;
	/**
	 * @param identificador
	 * @param rut
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantAsistentes
	 * @param numeroInterno
	 */
	public Capacitacion(String identificador, String rut, String dia, String hora, String lugar, String duracion,
			String cantAsistentes, int numeroInterno) {
		
		this.identificador = identificador;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
		this.numeroInterno = numeroInterno;
	}
	
	
	
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes=" + cantAsistentes
				+ ", numeroInterno=" + numeroInterno + "]";
	}



	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the cantAsistentes
	 */
	public String getCantAsistentes() {
		return cantAsistentes;
	}
	/**
	 * @param cantAsistentes the cantAsistentes to set
	 */
	public void setCantAsistentes(String cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	/**
	 * @return the numeroInterno
	 */
	public int getNumeroInterno() {
		return numeroInterno;
	}
	/**
	 * @param numeroInterno the numeroInterno to set
	 */
	public void setNumeroInterno(int numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	
	




}
