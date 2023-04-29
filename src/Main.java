import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTadeu = new Dev();
        devTadeu.setNome("Tadeu");
        devTadeu.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Tadeu" + devTadeu.getConteudosInscritos());

        devTadeu.progredir();
        System.out.println("Conteudos Inscritos Tadeu" + devTadeu.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tadeu" + devTadeu.getConteudosConcluidos());
        System.out.println("XP: " + devTadeu.calcularTotalXp());

        Dev devZe = new Dev();
        devZe.setNome("José");
        devZe.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Zé" + devZe.getConteudosInscritos());
        devZe.progredir();
        devZe.progredir();
        devZe.progredir();
        System.out.println("Conteudos Inscritos Zé" + devZe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Zé" + devZe.getConteudosConcluidos());
        System.out.println("XP: " + devZe.calcularTotalXp());





    }
}