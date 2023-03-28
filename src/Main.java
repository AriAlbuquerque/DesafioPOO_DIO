import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso programação em JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Curso de JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Mentoria em linguagem java");
        mentoria.setData(LocalDate.now());

//      Conteudo conteudo = new Curso();
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devAriane = new Dev();
        devAriane.setNome("Ariane");
        devAriane.inscreverBootCamo(bootCamp);

        System.out.println("Conteúdos inscritos: " + devAriane.getNome() + devAriane.getConteudosInscritos());

        devAriane.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos: " + devAriane.getNome() + devAriane.getConteudosInscritos());

        System.out.println("Conteúdos concluidos: " + devAriane.getNome() + devAriane.getConteudosConcluidos());

        System.out.println("XP: " + devAriane.calcularTotalXP());
        devAriane.progredir();
        System.out.println("Conteúdos inscritos: " + devAriane.getNome() + devAriane.getConteudosInscritos());

        System.out.println("Conteúdos concluidos: " + devAriane.getNome() + devAriane.getConteudosConcluidos());

        System.out.println("XP: " + devAriane.calcularTotalXP());

        System.out.println("------------------");

        Dev devNicolas = new Dev();

        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootCamo(bootCamp);

        System.out.println("Conteúdos inscritos: "+ devNicolas.getNome() + devNicolas.getConteudosInscritos());

        devNicolas.progredir();

        System.out.println("-");

        System.out.println("Conteúdos inscritos: "+ devNicolas.getNome() + devNicolas.getConteudosInscritos());

        System.out.println("Conteúdos concluidos: "+ devNicolas.getNome() + devNicolas.getConteudosConcluidos());
        devNicolas.progredir();
        devNicolas.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos: "+ devNicolas.getNome() + devNicolas.getConteudosInscritos());

        System.out.println("Conteúdos concluidos: "+ devNicolas.getNome() + devNicolas.getConteudosConcluidos());

    }
}
