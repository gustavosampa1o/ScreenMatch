package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

// Ao invés  de repetir, da para fazer de outra forma.
//    public void inclui(Filme f){
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal+= s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo){
        this.tempoTotal = titulo.getDuracaoEmMinutos();
    }
}
