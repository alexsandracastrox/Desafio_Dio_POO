package br.com.dio.desafio.dominio;

public class Curso {

  private String titulo;
  private String descricao;
  int cargaHoraria;

  public Curso(){

  }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }



}

