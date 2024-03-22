package com.ejeprac;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@

SessionScoped 

public class Bean {
	  private String texto;

	    public String getTexto() {
	        return texto;
	    }

	    public void setTexto(String texto) {
	        this.texto = texto;
	    }
}
