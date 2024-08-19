import java.util.List;

public interface Gerenciamento {
    void adicionarAluno(Aluno aluno);
    void removerAluno(String matricula);
    List<Aluno> listarAlunos();
    double calcularMedia();
    Aluno encontrarAlunoPorMatricula(String matricula);
    void atualizarNotaAluno(String matricula, double novaNota);
}