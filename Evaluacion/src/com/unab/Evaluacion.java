package com.unab;

public class Evaluacion {

	private String pregunta;
	private String respuesta;
	private String respuestaCorrecta;
	
	Evaluacion(String pregunta, String respuestaCorrecta){
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	
	public String getPregunta() {
		return pregunta;
	}
	public void setRespuesta( String respuesta) {
		this.respuesta = respuesta;
	}
	
	public String getRespuesta() {
		return this.respuesta;
	}
	
	public boolean validar() {
		return this.respuesta.equals(this.respuestaCorrecta);
	}
}
