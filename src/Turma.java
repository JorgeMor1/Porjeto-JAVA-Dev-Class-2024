import java.util.ArrayList;
import java.util.List;

public class Turma implements Gerenciamento {
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    @Override
    public void adicionarAluno(Aluno aluno) {
        if (encontrarAlunoPorMatricula(aluno.getMatricula()) == null) {
            alunos.add(aluno);
        } else {
            System.out.println("Aluno com matrícula " + aluno.getMatricula() + " já está na turma.");
        }
    }

    @Override
    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }

    @Override
    public List<Aluno> listarAlunos() {
        return alunos;
    }

    @Override
    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        return somaNotas / alunos.size();
    }

    @Override
    public Aluno encontrarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public void atualizarNotaAluno(String matricula, double novaNota) {
        Aluno aluno = encontrarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setNota(novaNota);
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }
}
