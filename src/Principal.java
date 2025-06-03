//<editor-fold desc = "Exemplos no curso da ALura 1/2">
//import br.com.alura.screenmatch.exemplosmodelos.ContaBancaria;
//import br.com.alura.screenmatch.exemplosmodelos.ContaCorrente;
//import br.com.alura.screenmatch.exemplosmodelos.IdadePessoa;
//import br.com.alura.screenmatch.exemplosmodelos.Produto;
//import br.com.alura.screenmatch.exemplosmodelos.Aluno;
//import br.com.alura.screenmatch.exemplosmodelos.Livro;
//import br.com.alura.screenmatch.exemplosmodelos.ModeloCarro;
//import br.com.alura.screenmatch.exemplosmodelos.Carro;
//import br.com.alura.screenmatch.exemplosmodelos.Animal;
//import br.com.alura.screenmatch.exemplosmodelos.Gato;
//import br.com.alura.screenmatch.exemplosmodelos.Cachorro;
//import br.com.alura.screenmatch.calculosexemplos.ConversaoFinanceira;
//import br.com.alura.screenmatch.exemplosmodelos.ConversorMoeda;
//import br.com.alura.screenmatch.exemplosmodelos.CalculadoraSalaRetangular;
//import br.com.alura.screenmatch.exemplosmodelos.TabuadaMultiplicacao;

//</editor-fold>



import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import br.com.alura.screenmatch.calculosexemplos.ConversorTemperatura;
import br.com.alura.screenmatch.exemplosmodelos.ConversorTemperaturaPadrao;
import br.com.alura.screenmatch.exemplosmodelos.Livro;
import br.com.alura.screenmatch.exemplosmodelos.Produto;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;



public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie lupin = new Serie();
        lupin.setNome("Lupin");
        lupin.setAnoDeLancamento(2022);
        lupin.exibeFichaTecnica();
        lupin.setTemporadas(3);
        lupin.setEpisodiosPorTemporada(10);
        lupin.setMinutosPorEpisodio(50);
        System.out.println("Duração em minutos para maratonar Lupin: " + lupin.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lupin);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lupin);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

//<editor-fold desc = "Exemplos no curso da ALura 2/2">
//        System.out.println("-----------------------");
//        System.out.println("Conta bancária");
//        System.out.println("-----------------------");
//
//        ContaBancaria conta1 = new ContaBancaria();
//
//        conta1.setTitular("Gustavo Santana Sampaio");
//        conta1.setNumeroConta(99558412);
//
//        conta1.deposita(500.00);
//        System.out.println("O saldo após o depósito é de: " + conta1.getSaldo());
//        conta1.saca(300.00);
//        System.out.println("O meu saldo após o saque é de: " + conta1.getSaldo());
//
//        System.out.println("--------------------------------");
//
//        conta1.extrato();
//
//        System.out.println("--------------------------------------");
//        System.out.println("Nome e idade - Verifica se é maior de idade.");
//        IdadePessoa pessoa1 = new IdadePessoa();
//        pessoa1.setIdade(40);
//        pessoa1.setNome("SerjaoBerranteiro");
//
//        System.out.println("------------------------");
//        System.out.println("Nome: " + pessoa1.getNome());
//        System.out.println("Idade: " + pessoa1.getIdade());
//        pessoa1.verificarIdade(pessoa1.getIdade());
//
//        System.out.println("----------------------------");
//        System.out.println("Produto!!");
//
//        Produto produto1 = new Produto();
//        produto1.setPreco(1000);
//        produto1.setNome("Televisão de 40 Polegadas");
//
//        System.out.println("Produto: " + produto1.getNome());
//        System.out.println("Preço: " + produto1.getPreco());
//        produto1.aplicarDesconto(false);
//
//        System.out.println("-----------------------------------------");
//        System.out.println("Notas - Com média");
//        Aluno aluno1 = new Aluno();
//        aluno1.setNome("Gustavo");
//        aluno1.setNota(10);
//        aluno1.setNota(8);
//        aluno1.setNota(5);
//
//        System.out.println(aluno1.getNome());
//        System.out.println(aluno1.calcularMedia());
//
//        System.out.println("---------------------------------------------");
//        Livro livro1 = new Livro();
//        livro1.setAutor("Poeta Gustavo");
//        livro1.setGenero("Ação");
//        livro1.setTitulo("Se a vida é programação, quem são os programadores?");
//        livro1.setAnodeLancamento(2005);
//
//        livro1.exibeFichaLivro();
//        System.out.println("Exemplo modelo de carro");
//        ModeloCarro meuCarro = new ModeloCarro();
//
//        meuCarro.setModelo("Corsa");
//        meuCarro.setAno(2009);
//        meuCarro.setCambio("Manual");
//        meuCarro.setTipoCombustivel("Flex");
//        meuCarro.setPrecoPrimeiroAno(500);
//        meuCarro.setPrecoSegundoAno(1000);
//        meuCarro.setPrecoTerceiroAno(2000);
//
//        meuCarro.menorPreco();
//        System.out.println("---------------------------------");
//        meuCarro.maiorPreco();
//        System.out.println("---------------------------------");
//        meuCarro.exibeFichaTecnica();
//        System.out.println("---------------------------------");
//        System.out.println("Após pandemia e alteração de valores: ");
//        meuCarro.setPrecoPrimeiroAno(1000);
//        meuCarro.setPrecoSegundoAno(2000);
//        meuCarro.setPrecoTerceiroAno(3000);
//
//
//        meuCarro.menorPreco();
//        System.out.println("---------------------------------");
//        meuCarro.maiorPreco();
//        System.out.println("---------------------------------");
//        meuCarro.exibeFichaTecnica();
//        System.out.println("---------------------------------");
//        Cachorro cachorro1 = new Cachorro();
//        cachorro1.setNome("Bob");
//        cachorro1.setTipo("Poodle");
//        System.out.println("Nome do cachorro: " + cachorro1.getNome());
//        System.out.println("Raça do cachorro: " + cachorro1.getTipo());
//        cachorro1.emitirSom();
//
//        System.out.println("--------------------------------------------");
//        Gato gato1 = new Gato ();
//        gato1.setNome("Gatonildo");
//        gato1.setTipo("Raça do Gato");
//        System.out.println("Nome do gato: " + gato1.getNome());
//        System.out.println("Raça do Gato: " + gato1.getTipo());
//        gato1.emitirSom();
//
//
//        Animal animal1 = new Animal();
//        animal1.emitirSom();



//        ContaBancaria conta1 = new ContaBancaria();
//
//        conta1.setTitular("Gustavo Santana Sampaio");
//        conta1.setNumeroConta(99558412);
//
//        conta1.deposita(500.00);
//        System.out.println("O saldo após o depósito é de: " + conta1.getSaldo());
//        conta1.saca(300.00);
//        System.out.println("O meu saldo após o saque é de: " + conta1.getSaldo());
//
//        System.out.println("--------------------------------");
//
//        conta1.extrato();
//
//        System.out.println("**********************************************************");
//        ContaCorrente contac1 = new ContaCorrente();
//        contac1.setTitular("Gustavo Santana Sampaio");
//        contac1.setNumeroConta(99558412);
//
//        contac1.deposita(500.00);
//        System.out.println("O saldo após o depósito é de: " + contac1.getSaldo());
//        contac1.saca(300.00);
//        System.out.println("O meu saldo após o saque é de: " + contac1.getSaldo());
//
//        System.out.println("--------------------------------");
//
//        contac1.extrato();
//        contac1.cobrarTarifaMensal();
//        contac1.extrato();

//
//        ---------------------------------- Aplicando interface ----------------------------------------------
//        ConversorMoeda valor1 = new ConversorMoeda();
//        System.out.println(valor1.converteDolarParaReal(100));
//
//
//        CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
//        sala1.calcularArea(10,10);
//        sala1.calcularPerimetro(10,10);
//
//        TabuadaMultiplicacao num1 = new TabuadaMultiplicacao();
//        num1.mostrarTabuada(8);
//
//
//        ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();
//        temp1.celsiusParaFahrenheit(100);
//        temp1.fahrenheitParaCelsius(200);
//
//
//
//        Livro livro1 = new Livro();
//        System.out.println(livro1.calcularPrecoFinal(100));
//
//        Produto produto1 = new Produto();
//        System.out.println(produto1.calcularPrecoFinal(100));
//
//
//        Produto shampoo = new Produto();
//        shampoo.precoTotal(4, 100);
//
//        Produto desodorante = new Produto();
//        desodorante.precoTotal(5, 100);
//
//        Produto produto2 = new Produto();
//        produto2.precoTotal(30, 100);
//
// </editor-fold>

        }
    }



