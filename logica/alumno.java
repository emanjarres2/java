package notas.logica;

public class alumno {
    // declaracion de variables
    private String nombre;
    private String apellido;
    private String direccion;
    private String genero;
    private String programa;
    private String materia;

    // uso de constructores
    public alumno() {

    }

    public alumno(String nom, String ape, String dir, String gene, String Pro, String mat) {
        this.nombre = nom;
        this.apellido = ape;
        this.direccion = dir;
        this.genero = gene;
        this.programa = Pro;
        this.materia = mat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
    public String toString() {
        return "\n nombre: \n" + //
                "" + nombre + "\n apellido: \n" + //
                        "" + apellido + "\n direccion: \n" + //
                                ""  + direccion + "\n genero: \n" + //
                                        "" + genero + "\n programa : \n" + //
                                                "" + programa + " \n materia: \n" + //
                                                        "" + materia;
    }
    
}
