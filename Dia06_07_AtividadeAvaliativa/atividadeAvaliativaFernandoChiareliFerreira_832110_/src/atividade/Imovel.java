package atividade;
/**
 *
 * @author ferna
 */
public class Imovel {
    procurarCasa casa;
    
    private String nomeImovel;
    private String descricao;
    private String Categoria;
    private String tipoDoImovel;
    private float valorDaVenda;
    
    public Imovel() {
    }

    public Imovel(String nomeImovel, String descricao, String Categoria, String tipoDoImovel, float valorDaVenda) {
        this.nomeImovel = nomeImovel;
        this.descricao = descricao;
        this.Categoria = Categoria;
        this.tipoDoImovel = tipoDoImovel;
        this.valorDaVenda = valorDaVenda;
    }

    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
        this.nomeImovel = nomeImovel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getTipoDoImovel() {
        return tipoDoImovel;
    }

    public void setTipoDoImovel(String tipoDoImovel) {
        this.tipoDoImovel = tipoDoImovel;
    }

    public float getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(float valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
    
    @Override
    public String toString() {
        return "proprietario: " + nomeImovel + "\nsobre o imovel: " + descricao + "\nCategoria: " + Categoria + "\ntipo: " + tipoDoImovel + "\nvalor: " + valorDaVenda+"\n\n";
    }
    
}
