package br.unisul.aula.mscliente.response;

import br.unisul.aula.mscliente.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CidadeClienteResponse {

    private String cidade;
    private String uf;
    private List<ClienteResponse> cliente;

    public CidadeClienteResponse() {
        cliente = new ArrayList<>();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<ClienteResponse> getCliente() {
        return cliente;
    }

    public void setCliente(List<ClienteResponse> cliente) {
        this.cliente = cliente;
    }

    public void addCliente(Long id, String nome) {
        ClienteResponse clienteResponse = new ClienteResponse(id, nome);
        this.cliente.add(clienteResponse);
    }
}

class ClienteResponse{
    private Long id;
    private String nome;

    public ClienteResponse(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
