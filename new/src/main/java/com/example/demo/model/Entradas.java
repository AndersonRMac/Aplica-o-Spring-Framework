package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "tb_entradas")
public class Entradas {

    @Id
    @GeneratedValue( strategy = GenerationType. IDENTITY )
    private Long id;
    private String nome;
    private Integer valor;

    @ManyToOne  // porque um usuario_id pode receber varios valores
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Entradas() {

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

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
