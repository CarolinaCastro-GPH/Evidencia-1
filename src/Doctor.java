

import javax.swing.JOptionPane;

public final class Doctor {

    private String IDDoctor;
    private String Nombre;
    private String Apellidos;
    private String Especialidad;
    private INT CedulaProf;

    public Doctor(String IDDoctor, String Nombre, String Apellidos, String Especialidad, INt CedulaProf) {

        this.IDDoctor = IDDoctor;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Especialidad = Especialidad;
        this.CedulaProf = CedulaProf;
    }

    public String getIDDoctor() {

        return IDDoctor;
    }

    public void setIDDoctor(String IDDoctor) {

        this.IDDoctor = IDDoctor;
    }

    public String getNombre() {

        return Nombre;
    }

    public void setNombre(String Nombre) {

        this.Nombre = Nombre;
    }

    public String getApellidos() {

        return Apellidos;
    }

    public void setApellidos(String Apellidos) {

        this.Apellidos = Apellidos;
    }

    public String getEspecialidad() {

        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public INT getCedulaProf(INT CedulaProf) {

        return CedulaProf;
    }

    public void setCedulaProf(INT CedulaProf) {

        this.CedulaProf = CedulaProf;
    }

    
    public void mostrarDoctor() {
        String mensaje = "ID Doctor: " + IDDoctor + "\nNombre: " + Nombre
                + "\nApellidos: " + Apellidos + "\nEspecialidad: " + Especialidad + "\nCedula Profesional: " + CedulaProf;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Doctor", JOptionPane.INFORMATION_MESSAGE);
    }

}