package br.com.fsilveira.finance.entity;

// Generated 17/08/2012 23:01:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Instancia generated by hbm2java
 */
@Entity
@Table(name = "instancia", uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
public class Instancia extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "seq_instancia", sequenceName = "seq_instancia")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_instancia")
	private Long id;
	
	@Column(name = "fundo_caixa", nullable = false, precision = 18)
	private BigDecimal fundoCaixa;
	
	@Column(name = "nome", unique = true, nullable = false, length = 40)
	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Conta> contas = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<CedenteSacado> cedenteSacados = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Usuario> usuarios = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Feriado> feriados = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Categoria> categorias = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Lancamento> lancamentos = Collections.emptyList();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instancia")
	private List<Banco> bancos = Collections.emptyList();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getFundoCaixa() {
		return fundoCaixa;
	}
	public void setFundoCaixa(BigDecimal fundoCaixa) {
		this.fundoCaixa = fundoCaixa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public List<CedenteSacado> getCedenteSacados() {
		return cedenteSacados;
	}
	public void setCedenteSacados(List<CedenteSacado> cedenteSacados) {
		this.cedenteSacados = cedenteSacados;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Feriado> getFeriados() {
		return feriados;
	}
	public void setFeriados(List<Feriado> feriados) {
		this.feriados = feriados;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	public List<Banco> getBancos() {
		return bancos;
	}
	public void setBancos(List<Banco> bancos) {
		this.bancos = bancos;
	}

}
