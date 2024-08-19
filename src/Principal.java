public class Principal {
    public static void main(String[] args) {
        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Ana", "001", 8.5));
        turma.adicionarAluno(new Aluno("Bruno", "002", 7.0));
        turma.adicionarAluno(new Aluno("Carla", "003", 9.2));

        turma.adicionarAluno(new Aluno("David", "001", 7.5));

        turma.atualizarNotaAluno("002", 8.0);

        Aluno alunoEncontrado = turma.encontrarAlunoPorMatricula("003");
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado.getNome() + " - Nota: " + alunoEncontrado.getNota());
        }

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : turma.listarAlunos()) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula() + " - Nota: " + aluno.getNota());
        }

        double media = turma.calcularMedia();
        System.out.println("Média das Notas: " + media);
    }
}
