package model;

import java.time.LocalDateTime;

public class Anotacao {
    private int id;
    private String titulo;
    private String texto;
    private LocalDateTime dataCriacao;

    public Anotacao(int id, String titulo, String texto, LocalDateTime dataCriacao) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.dataCriacao = dataCriacao;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
    public LocalDateTime getDataCriacao() { return dataCriacao; }

    @Override
    public String toString() { return titulo; }
}