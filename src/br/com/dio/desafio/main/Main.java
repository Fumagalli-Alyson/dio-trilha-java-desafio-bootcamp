package br.com.dio.desafio.main;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = Curso.builder().titulo("Curso Java").descricao("Curso voltado para aprendizagem da linguagem Java").cargaHoraria(8).build();

        Curso curso2 = Curso.builder().titulo("Curso JavaScript").cargaHoraria(4).descricao("Curso voltado para aprendizagem da linguagem JavaScript").build();

        Mentoria mentoria = Mentoria.builder().data(LocalDate.now()).descricao("Descrição da Mentoria Java").titulo("Mentoria Java").build();

        Bootcamp bootcamp = Bootcamp.builder().descricao("Descrição Bootcamp Java Developer").nome("Bootcamp Java Developer").build();
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = Dev.builder().nome("Camila").build();
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        
        for (int i = 0; i < 2; i++)
        	devCamila.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("\n-------\n");

        Dev devJoao = Dev.builder().nome("João").build();
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        
        for (int i = 0; i < 3; i++)
			devJoao.progredir();
        
		System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
