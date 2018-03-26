package br.edu.uepb.controller;

import java.util.ArrayList;
import java.util.Date;

import br.edu.uepb.model.*;

public class Gerenciador {
	private ArrayList<Anais> anais;
	private ArrayList<Jornal> jornais;
	private ArrayList<Livro> livros;
	private ArrayList<MidiaEletronica> midiasEletronicas;
	private ArrayList<Revista> revistas;
	private ArrayList<Tcc> tcc;
	
	public Gerenciador() {
		this.anais = new ArrayList<Anais>();
		this.jornais = new ArrayList<Jornal>();
		this.livros = new ArrayList<Livro>();
		this.midiasEletronicas = new ArrayList<MidiaEletronica>();
		this.revistas = new ArrayList<Revista>();
		this.tcc = new ArrayList<Tcc>();
	}
	
	public void inserirAnais(String tipo, String titulo, String autores, String nomeCongresso, Date anoDePublicacao, String local) {
		Anais _anais = new Anais(tipo, titulo, autores, nomeCongresso, anoDePublicacao, local);
		anais.add(_anais);
	}
	
	public void removeAnais(Anais _anais) {
		anais.remove(_anais);
	}
	
	public void atualizaAnais(Anais _anais) {
		for(Anais a : anais) {
			if(a.getTitulo().equals(_anais.getTitulo())) {
				anais.remove(a);
				break;
			}
		}
		anais.add(_anais);
	}
	
	public void inserirJornal(String titulo, Date data, String edicao) {
		Jornal _jornal = new Jornal(titulo, data, edicao);
		jornais.add(_jornal);
	}
	
	public void removeJornal(Jornal _jornal) {
		jornais.remove(_jornal);
	}
	
	public void atualizaJornal(Jornal _jornal) {
		for(Jornal j : jornais) {
			if(j.getTitulo().equals(_jornal.getTitulo())) {
				jornais.remove(j);
				break;
			}
		}
		jornais.add(_jornal);
	}
	
	public void inserirLivro(int iSBN, String titulo, String autores, String editora, Date anoDePpublicacao, int edicao,
			int nPaginas, String areaConhecimento, String subarea) {
		Livro _livro = new Livro(iSBN,  titulo,  autores,  editora,  anoDePpublicacao, edicao,
				 nPaginas,  areaConhecimento,  subarea);
		livros.add(_livro);
	}
	
	public void removeLivro(Livro _livro) {
		livros.remove(_livro);
	}
	
	public void atualizaLivro(Livro _livro) {
		for(Livro l : livros) {
			if(l.getTitulo().equals(_livro.getTitulo())) {
				livros.remove(l);
				break;
			}
		}
		livros.add(_livro);
	}
	
	public void inserirMidiaEletronica(String titulo, String tipo, Date dataDaGravacao) {
		MidiaEletronica _midia = new MidiaEletronica(titulo, tipo, dataDaGravacao);
		midiasEletronicas.add(_midia);
	}
	
	public void removeMidiaEletronica(MidiaEletronica _midia) {
		midiasEletronicas.remove(_midia);
	}
	
	public void atualizaMidiaEletronica(MidiaEletronica _midia) {
		for(MidiaEletronica m : midiasEletronicas) {
			if(m.getTitulo().equals(_midia.getTitulo())) {
				midiasEletronicas.remove(m);
				break;
			}
		}
		midiasEletronicas.add(_midia);
	}
	
	public void inserirRevista(String titulo, String editora, Date anoDePublicacao, int edicao, int nPaginas) {
		Revista _revista = new Revista(titulo, editora, anoDePublicacao, edicao, nPaginas);
		revistas.add(_revista);
	}
	
	public void removeRevista(Revista _revista) {
		revistas.remove(_revista);
	}
	
	public void atualizaRevista(Revista _revista) {
		for(Revista r : revistas) {
			if(r.getTitulo().equals(_revista.getTitulo())){
				revistas.remove(r);
				break;
			}
		}
		revistas.add(_revista);
	}
	
	public void inserirTcc(String titulo, String autores, String orientadores, String tipo, Date andeDeDefesa, String local) {
		Tcc _tcc = new Tcc(titulo, autores, orientadores, tipo, andeDeDefesa, local);
		tcc.add(_tcc);
	}
	
	public void removeTcc(Tcc _tcc) {
		tcc.remove(_tcc);
	}
	
	public void atualizaTcc(Tcc _tcc) {
		for(Tcc t : tcc) {
			if(t.getTitulo().equals(_tcc.getTitulo())) {
				tcc.remove(t);
				break;
			}
		}
		tcc.add(_tcc);
	}
}
