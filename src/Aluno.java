
public class Aluno {

    // ATRIBUTOS: características do aluno
    private String nome;
    private int idade;
    private String endereco;

    // RELACIONAMENTO: matrícula associada ao aluno
    private Matricula matricula;

    // CONSTRUTOR: recebe os dados iniciais do aluno
    public Aluno(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // GETTERS: consultam os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    // SETTERS: alteram os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    // MÉTODO: apresenta os dados do aluno
    public void apresentarDados() {
        System.out.println("===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereço: " + getEndereco());

        // Verifica se o aluno possui matrícula
        if (matricula != null) {
            matricula.apresentarMatricula();
        } else {
            System.out.println("Aluno ainda não possui matrícula.");
        }
    }

    // MAIN: inicia o programa
    public static void main(String[] args) {

        // Criando um objeto aluno
        Aluno aluno1 = new Aluno(
                "Roberto Jefferson",
                31,
                "Fortaleza"
        );

        // Criando a matrícula
        Matricula matricula1 = new Matricula(
                1410711,
                "Análise e Desenvolvimento de Sistemas"
        );

        // Associando a matrícula ao aluno
        aluno1.setMatricula(matricula1);

        // Apresentando todos os dados
        aluno1.apresentarDados();
    }
}
