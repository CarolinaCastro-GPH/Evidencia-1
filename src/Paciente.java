import javax.swing.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pacientes {


    private INT IDPaciente;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private Date FechaNac;

    public Pacientes(INT IDPaciente, String Nombre, String Apellido, String Sexo, Date FechaNac){

        this.IDPaciente = IDPaciente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.FechaNac = FechaNac;
    }

    public INT getIDPaciente(){

        return IDPaciente;
    }

    public String getNombre(){

       return Nombre;
    }

    public String getApellido(){

        return Apellido;
    }

    public String getSexo(){

        return Sexo;
    }

    public Date getFechaNac(){

       return FechaNac;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setFechaNac(Date fechaNac) {
        FechaNac = fechaNac;
    }

    public void setIDPaciente(INT IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void mostrarPaciente() {
        String mensaje = "ID Paciente: " + IDPaciente + "\nNombre: " + Nombre
                + "\nApellidos: " + Apellido + "\nFecha de Nacimiento: " + FechaNac + "\nSexo: " + Sexo;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Paciente", JOptionPane.INFORMATION_MESSAGE);
    }
}


