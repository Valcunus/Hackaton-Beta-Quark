package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqProduto", sequenceName="SEQ_PRODUTO", allocationSize=1)
public class Produto {

	private String nome;
	
	private String descricao;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProduto")
	private int sku;
	
	private String foto;
	
	private double preco;

	public Produto(String nome, String descricao, int sku, String foto, int preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.sku = sku;
		this.foto = foto;
		this.preco = preco;
	}

	public Produto() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public int getPreco() {
		return (int) preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
}