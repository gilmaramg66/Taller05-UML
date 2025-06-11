package taller05;

public class Estudiante extends PersonalAcademico{
	private java.util.Collection cursos;

    public void solicitarinscripcionCurso(Curso curso){
        //throw new UnsupportedOperationException();
    }

    public void realizarActividadSumativa(Curso curso,ActividadSumativa actividadSumativa){
        //throw new UnsupportedOperationException();
    }

    public java.util.Collection getCursos() {
        return cursos;
    }

    public void setCursos(java.util.Collection cursos) {
        this.cursos = cursos;
    }

}
