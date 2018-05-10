package br.edu.uepb.model;

import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**Classe para objetos do tipo Jornal
 * @author Jerffeson Sousa
 * */
@Entity
@Table(name="jornais")
@PrimaryKeyJoinColumn(name="ITEMID")
public class Jornal extends ItemAcervo{	

}
