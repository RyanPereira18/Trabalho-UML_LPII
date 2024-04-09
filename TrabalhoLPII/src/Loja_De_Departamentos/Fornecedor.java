package Loja_De_Departamentos;

import java.util.Objects;

public class Fornecedor implements Pessoa {
    private Integer codFornecedor;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    public Fornecedor() {

    }

    public Fornecedor(String nome, String cnpj, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    @Override
    public int hashCode() {
        return Objects.hash(codFornecedor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fornecedor fornecedor = (Fornecedor) obj;
        return Objects.equals(codFornecedor, fornecedor.codFornecedor);
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "codFornecedor=" + codFornecedor +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public String getCpf() {
        return null; 
    }

    @Override
    public void setCpf(String cpf) {
        
    }
}
