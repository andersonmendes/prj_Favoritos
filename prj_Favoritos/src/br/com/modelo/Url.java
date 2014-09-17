package br.com.modelo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Url {
	
	@GeneratedValue
	private Integer codigo;
	private String titulo;
	@Id
	private String url;
	private String descricao;
	@ManyToMany
	private Collection<Tag> tags;
	
	public void setId(Integer id) {
		this.codigo = id;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
