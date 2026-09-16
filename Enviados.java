import java.time.LocalDate;
public class Enviados{
    
    
    private String produto;
    private int quantidade;
    private float preco;
    private LocalDate previsao;
    private String loja;

    public Enviados(String produto, int quantidade, float preco, LocalDate previsao, String loja) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.previsao = previsao;
		this.loja = loja;
	}

	public String getLoja() {
        return loja;
    }

    public LocalDate getPrevisao() {
        return previsao;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto;
    }
   


}