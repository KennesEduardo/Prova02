package classes;

public class Cliente extends Pessoa {
    private String realizarPedido;

    public Cliente(String nome, String endereco, String cpf) {
        super(nome, endereco, cpf);
        
    }

    public String getRealizarPedido() {
        return realizarPedido;
    }

    public void setRealizarPedido(String realizarPedido) {
        this.realizarPedido = realizarPedido;
    }
    

    
}
