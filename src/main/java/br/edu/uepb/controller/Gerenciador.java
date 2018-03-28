package br.edu.uepb.controller;

import java.util.ArrayList;
import java.util.Date;

import br.edu.uepb.model.*;

/**
 * @author Jerffeson Sousa
 *
 * */

public class Gerenciador {
	private ArrayList<Anais> anais;
	private ArrayList<Jornal> jornais;
	private ArrayList<Livro> livros;
	private ArrayList<MidiaEletronica> midiasEletronicas;
	private ArrayList<Revista> revistas;
	private ArrayList<Tcc> tcc;
	private ArrayList<Curso> cursos;
	
	public Gerenciador() {
		this.anais = new ArrayList<Anais>();
		this.jornais = new ArrayList<Jornal>();
		this.livros = new ArrayList<Livro>();
		this.midiasEletronicas = new ArrayList<MidiaEletronica>();
		this.revistas = new ArrayList<Revista>();
		this.tcc = new ArrayList<Tcc>();
		this.cursos = new ArrayList<Curso>();
	}
	
	
	public boolean inserirAnais(String tipo, String titulo, String autores, String nomeCongresso, Date anoDePublicacao, String local) {
		Anais _anais = new Anais(tipo, titulo, autores, nomeCongresso, anoDePublicacao, local);
		return anais.add(_anais);
	}
	
	public boolean removeAnais(String titulo) {
		for(Anais a : anais) {
			if(a.getTitulo().equals(titulo)) {
				return anais.remove(a);
			}
		}
		
		return false;
	}
	
	public boolean atualizaAnais(Anais _anais) {
		for(Anais a : anais) {
			if(a.getTitulo().equals(_anais.getTitulo())) {
				anais.remove(a);
				return anais.add(_anais);
			}
		}
		return false;
	}
	
	public boolean inserirJornal(String titulo, Date data, int edicao) {
		Jornal _jornal = new Jornal(titulo, data, edicao);
		return jornais.add(_jornal);
	}
	
	public boolean removeJornal(String titulo) {
		for(Jornal j : jornais) {
			if(j.getTitulo().equals(titulo)) {
				return jornais.remove(j);
			}
		}
		return false;
	}
	
	public boolean atualizaJornal(Jornal _jornal) {
		for(Jornal j : jornais) {
			if(j.getTitulo().equals(_jornal.getTitulo())) {
				jornais.remove(j);
				return jornais.add(_jornal);
			}
		}
		return false;
	}
	
	public boolean inserirLivro(int iSBN, String titulo, String autores, String editora, Date anoDePpublicacao, int edicao,
			int nPaginas, String areaConhecimento, String subarea) {
		Livro _livro = new Livro(iSBN,  titulo,  autores,  editora,  anoDePpublicacao, edicao,
				 nPaginas,  areaConhecimento,  subarea);
		return livros.add(_livro);
	}
	
	public boolean removeLivro(String titulo) {
		for(Livro l : livros) {
			if(l.getTitulo().equals(titulo)) {
				return livros.remove(l);
			}
		}
		return false;
	}
	
	public boolean atualizaLivro(Livro _livro) {
		for(Livro l : livros) {
			if(l.getTitulo().equals(_livro.getTitulo())) {
				livros.remove(l);
				return livros.add(_livro);
			}
		}
		return false;
	}
	
	public boolean inserirMidiaEletronica(String titulo, String tipo, Date dataDaGravacao) {
		MidiaEletronica _midia = new MidiaEletronica(titulo, tipo, dataDaGravacao);
		return midiasEletronicas.add(_midia);
	}
	
	public boolean removeMidiaEletronica(String titulo) {
		for(MidiaEletronica m : midiasEletronicas) {
			if(m.getTitulo().equals(titulo)) {
				return midiasEletronicas.remove(m);
			}
		}
		return false;
	}
	
	public boolean atualizaMidiaEletronica(MidiaEletronica _midia) {
		for(MidiaEletronica m : midiasEletronicas) {
			if(m.getTitulo().equals(_midia.getTitulo())) {
				midiasEletronicas.remove(m);
				return midiasEletronicas.add(_midia);
			}
		}
		return false;
	}
	
	public boolean inserirRevista(String titulo, String editora, Date anoDePublicacao, int edicao, int nPaginas) {
		Revista _revista = new Revista(titulo, editora, anoDePublicacao, edicao, nPaginas);
		return revistas.add(_revista);
	}
	
	public boolean removeRevista(String titulo) {
		for(Revista r : revistas) {
			if(r.getTitulo().equals(titulo)) {
				return revistas.remove(r);
			}
		}
		return false;
	}
	
	public boolean atualizaRevista(Revista _revista) {
		for(Revista r : revistas) {
			if(r.getTitulo().equals(_revista.getTitulo())){
				revistas.remove(r);
				return revistas.add(_revista);
			}
		}
		return false;
	}
	
	public boolean inserirTcc(String titulo, String autores, String orientadores, String tipo, Date andeDeDefesa, String local) {
		Tcc _tcc = new Tcc(titulo, autores, orientadores, tipo, andeDeDefesa, local);
		return tcc.add(_tcc);
	}
	
	public boolean removeTcc(String titulo) {
		for(Tcc t : tcc) {
			if(t.getTitulo().equals(titulo)) {
				return tcc.remove(t);
			}
		}
		return false;
	}
	
	public boolean atualizaTcc(Tcc _tcc) {
		for(Tcc t : tcc) {
			if(t.getTitulo().equals(_tcc.getTitulo())) {
				tcc.remove(t);
				return tcc.add(_tcc);
			}
		}
		return false;
	}
	
	public boolean inserirCurso(String nome, String area, String tipo) {
		Curso c = new Curso(nome, area, tipo);
		return cursos.add(c);
	}
	
	public boolean removeCurso(String nome) {
		for(Curso c : cursos) {
			if(c.getNome().equals(nome)) {
				return cursos.remove(c);
			}
		}
		return false;
	}
	
	public boolean atualizaCurso(Curso _curso) {
		for(Curso c : cursos) {
			if(c.getNome().equals(_curso.getNome())) {
				cursos.remove(c);
				return cursos.add(_curso);
			}
		}
		return false;
	}
}
