package br.edu.uepb.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.edu.uepb.enums.AnaisEnum;

/**Classe para objetos do tipo Anais
 * @author Jerffeson Sousa
 *
 */
@Entity
@Table(name="anais")
public class Anais {
	@Id
	@Column(name="ANAISID")
	@GeneratedValue
	private int anaisID;
	
	@Column(name="TIPO")
	@Enumerated(EnumType.STRING)
	private AnaisEnum tipo;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="AUTORES")
	private String autores;
	
	@Column(name="CONGRESSO")
	private String congresso;
	
	@DateTimeFormat
	@Column(name="ANODEPUBLICACAO")
	private LocalDateTime anoDePublicacao;
	
	@Column(name="LOCAL")
	private String local;
	
	public Anais () {}
	
	/**Contrutor Anais
	 * @param tipo enum para idicar o tipo (ARTIGO, PÔSTER ou RESUMO)
	 * @param titulo uma string para indicar o título
	 * @param autores uma string para indicar um ou mais autores
	 * @param nomeCongresso uma string para indicar o nome do congresso
	 * @param anaDePublicacao um objeto tipo Date que indica o ano da publicação dos Anais
	 * @param local uma string para identificar o local que foi realizado
	 * */
	public Anais(AnaisEnum tipo, String titulo, String autores, String nomeCongresso, LocalDateTime anoDePublicacao, String local) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.autores = autores;
		this.congresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
	}
	
	/**Contrutor Anais
	 * @param anaisID um int para indicar seu Id no banco
	 * @param tipo enum para idicar o tipo (ARTIGO, PÔSTER ou RESUMO)
	 * @param titulo uma string para indicar o título
	 * @param autores uma string para indicar um ou mais autores
	 * @param nomeCongresso uma string para indicar o nome do congresso
	 * @param anaDePublicacao um objeto tipo Date que indica o ano da publicação dos Anais
	 * @param local uma string para identificar o local que foi realizado
	 * */
	public Anais(int anaisID, AnaisEnum tipo, String titulo, String autores, String nomeCongresso, LocalDateTime anoDePublicacao, String local) {
		super();
		this.anaisID = anaisID;
		this.tipo = tipo;
		this.titulo = titulo;
		this.autores = autores;
		this.congresso = nomeCongresso;
		this.anoDePublicacao = anoDePublicacao;
		this.local = local;
	}
	
	
	
	public int getAnaisID() {
		return anaisID;
	}

	public LocalDateTime getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(LocalDateTime anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public void setAnaisID(int anaisID) {
		this.anaisID = anaisID;
	}

	public AnaisEnum getTipo() {
		return tipo;
	}

	public void setTipo(AnaisEnum tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getCongresso() {
		return congresso;
	}

	public void setCongresso(String congresso) {
		this.congresso = congresso;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
