package atv4.questao5;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String nomeNacional;
    private int ano;
    private List<String> autores;
    private int edicao;
    private String cidade;
    private String editora;
    private String nomeOriginal;
    private List<String> tradutores;
    private int paginas;
    private long isbn;

    public static class LivroBuilder{
        private final String nomeNacional;
        private int ano;
        private List<String> autores;
        private int edicao;
        private String cidade;
        private String editora;
        private String nomeOriginal;
        private List<String> tradutores;
        private int paginas;
        private long isbn;

        public LivroBuilder(String nomeNacional) {
            this.nomeNacional = nomeNacional;
            this.autores = new ArrayList<>();
            this.tradutores = new ArrayList<>();
        }

        public LivroBuilder publicadoEm(int ano){
            this.ano = ano;
            return this;
        }

        public LivroBuilder dosAutores(String autor){
            autores.add(autor);
            return this;
        }

        public LivroBuilder edicao(int edicao){
            this.edicao = edicao;
            return this;
        }

        public LivroBuilder cidade(String cidade){
            this.cidade = cidade;
            return this;
        }

        public LivroBuilder editora(String editora){
            this.editora = editora;
            return this;
        }

        public LivroBuilder nomeOriginal(String nomeOriginal){
            this.nomeOriginal = nomeOriginal;
            return this;
        }

        public LivroBuilder tradutores(String tradutor){
            tradutores.add(tradutor);
            return this;
        }

        public LivroBuilder paginas(int paginas){
            this.paginas = paginas;
            return this;
        }

        public LivroBuilder isbn(long isbn){
            this.isbn = isbn;
            return this;
        }

        public Livro build(){
            return new Livro(this);
        }
    }

    private Livro(LivroBuilder builder){
        nomeNacional = builder.nomeNacional;
        ano = builder.ano;
        autores = builder.autores;
        edicao = builder.edicao;
        cidade = builder.cidade;
        editora = builder.editora;
        nomeOriginal = builder.nomeOriginal;
        tradutores = builder.tradutores;
        paginas = builder.paginas;
        isbn = builder.isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }
}
