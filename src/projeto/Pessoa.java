package projeto;

/**
 *
 * @author jonasdhein
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorConta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
    
    public void diminuiValorConta(double valor) {
        if (valor < this.valorConta && valor > 0) {
            this.valorConta -= valor;
        } else {
            System.out.println("Inválido!");
        }
    }
    
    public void aumentaValorConta(double valor){
        if (valor > 0) {
            this.valorConta += valor;
        } else {
            System.out.println("Inválido!");
        }
    }
    
    
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nSaldo: " + this.valorConta;
    }
    
}
