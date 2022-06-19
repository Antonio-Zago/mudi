package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

public class NovoPedidoDto {
	private String nomeProduto;
	private String urlProduto;
	private String urlImagem;
	private String descricaoProduto;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(this.descricaoProduto);
		pedido.setNomeProduto(this.nomeProduto);
		pedido.setUrlImg(this.urlImagem);
		pedido.setUrlProduto(this.urlProduto);
		return pedido;
	}
	
	
}
