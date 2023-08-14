

package ejemploTablas;


public class Alumno {
    
    private int matricula;
    private String Apellido;
    private String Nombre;

    public Alumno(int matricula, String Apellido, String Nombre) {
        this.matricula = matricula;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

}
