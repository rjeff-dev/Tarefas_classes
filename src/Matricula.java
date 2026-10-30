
public class Matricula {

    // ATRIBUTOS: características da matrícula
    private int numero;
    private String curso;
    private boolean ativa;

    // CONSTRUTOR: recebe os dados iniciais
    public Matricula(int numero, String curso) {
        this.numero = numero;
        this.curso = curso;
        this.ativa = true;
    }

    // GETTERS: consultam os atributos
    public int getNumero() {
        return numero;
    }

    public String getCurso() {
        return curso;
    }

    public boolean isAtiva() {
        return ativa;
    }

    // SETTERS: alteram os atributos
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // MÉTODO: cancelar matrícula
    public void cancelarMatricula() {
        this.ativa = false;
        System.out.println("Matrícula cancelada!");
    }

    // MÉTODO: reativar matrícula
    public void reativarMatricula() {
        this.ativa = true;
        System.out.println("Matrícula reativada!");
    }

    // MÉTODO: apresentar os dados da matrícula
    public void apresentarMatricula() {
        System.out.println("===== DADOS DA MATRÍCULA =====");
        System.out.println("Número: " + getNumero());
        System.out.println("Curso: " + getCurso());
        System.out.println("Situação: " + (isAtiva() ? "Ativa" : "Cancelada"));
    }
}
