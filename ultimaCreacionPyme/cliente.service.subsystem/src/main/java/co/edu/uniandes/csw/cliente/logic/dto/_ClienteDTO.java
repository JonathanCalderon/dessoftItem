
package co.edu.uniandes.csw.cliente.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _ClienteDTO {

	private Long id;
	private String name;
	private String docId;
	private String tipo;
	private String password;

	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public String getDocId() {
		return docId;
	}
 
	public void setDocId(String docid) {
		this.docId = docid;
	}
	public String getTipo() {
		return tipo;
	}
 
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
	
}