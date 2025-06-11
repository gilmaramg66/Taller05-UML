package taller03;

public class Curso {
	private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ActividadSumativa actividadesSumativas;
    private java.util.Collection foros;
    private java.util.Collection estudiantesInscritos;
    private java.util.Collection estudiatesEnEsperaDeInscripcion;
    private Profesor responsable;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }
    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
    public ActividadSumativa getActividadesSumativas() {
        return actividadesSumativas;
    }
    public void setActividadesSumativas(ActividadSumativa actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    public java.util.Collection getForos() {
        return foros;
    }
    public void setForos(java.util.Collection foros) {
        this.foros = foros;
    }
    public java.util.Collection getEstudiantesInscritos() {
        return estudiantesInscritos;
    }
    public void setEstudiantesInscritos(java.util.Collection estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }
    public java.util.Collection getEstudiatesEnEsperaDeInscripcion() {
        return estudiatesEnEsperaDeInscripcion;
    }
    public void setEstudiatesEnEsperaDeInscripcion(java.util.Collection estudiatesEnEsperaDeInscripcion) {
        this.estudiatesEnEsperaDeInscripcion = estudiatesEnEsperaDeInscripcion;
    }
    public Profesor getResponsable() {
        return responsable;
    }
    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

}
