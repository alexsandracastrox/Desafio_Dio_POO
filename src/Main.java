import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

  /*  Conteudo conteudo = new Curso();

    List<String> palavras;*/

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição mentoria Java");
    mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DeveLoper");
        bootcamp.setDescricao("Descrição Bootcamp Java DeveLoper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP:" + devCamila.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Jaão");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("");
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}

