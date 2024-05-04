import br.com.quequeeuvouassistir.modelos.calculadora.CalculadoraDeTempo;
import modelos.Filme;
import modelos.Serie;

public class Principal {
        public static void main(String[] args) {
            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLançamento(2000);
            meuFilme.setDuraçãoEmMinutos(100);
            System.out.println("Duração do filme em minutos: " + meuFilme.getDuraçãoEmMinutos());

            meuFilme.exibeFichaTécnica();
            meuFilme.avalia(8);
            meuFilme.avalia(10);
            meuFilme.avalia(9);
            System.out.println("Total de avalições" + meuFilme.getTotalAvaliação());

            Serie lost = new Serie();
            lost.setNome("Lost");
            lost.setAnoDeLançamento(2022 );
            lost.setTemporadas(2);
            lost.setEpisodiosPorTemporada(12);
            lost.setMinutosPorEpisodio(40);

            Filme outroFilme = new Filme();
            outroFilme.setNome("Avatar");
            outroFilme.setAnoDeLançamento(2000);
           outroFilme.setDuraçãoEmMinutos(200);
            System.out.println("Duração total da serie em minutos': " + lost.getDuraçãoEmMinutos());

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(meuFilme);
            calculadora.inclui(outroFilme);
            calculadora.inclui(lost);
            System.out.println("Tempo para assistir esses dois filmes :" + calculadora.getTempoTotal());


        }

    }

