package br.com.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.persistence.EntityManager;

import org.primefaces.event.FileUploadEvent;

import br.com.dao.ProdutoDAO;
import br.com.dao.impl.ProdutoDAOImpl;
import br.com.entity.Produto;
import br.com.fiap.singleton.EMFactorySingleton;

public class ProdutoBean {

	private Produto produto;
	private List<Produto> lista;
	private ProdutoDAO dao;
	private void init(){
		produto = new Produto();

		EntityManager em = EMFactorySingleton.getInstance();
		dao = new ProdutoDAOImpl(em);

		lista = dao.list();
	}

	public void cadastrar(){
		FacesMessage msg;
		try{
			dao.cadastrar(produto);
			msg = new FacesMessage("Produto cadastrado");
			lista.add(produto);
		}catch(Exception e){
			e.printStackTrace();
			msg = new FacesMessage("Erro");
		}
	}
	
	public void subirFoto(FileUploadEvent event){
		File arquivo = new File("C://foto//", event.getFile().getFileName());
		try{
			FileOutputStream output = new FileOutputStream(arquivo);
			output.write(event.getFile().getContents());
			output.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
}