import Paciente;

public class Cita {

    private Paciente paciente;
    private Doctor doctor;
    private Date Fecha;
    private String Motivo;
    private INT IDCita;

    public Cita(Paciente paciente, Doctor doctor, Date Fecha, String Motivo INT IDCita){

        this.doctor = doctor;
        this.paciente = paciente;
        this.Fecha = Fecha;
        this.Motivo = Motivo;
        this.IDCita = IDCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getFecha() {
        return Fecha;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public INT getIDCita() {
        return IDCita;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public void setIDCita(INT IDCita) {
        this.IDCita = IDCita;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void mostrarCita() {
        String mensaje = "ID Cita: " + IDCita + "\nPaciente: " + Paciente.nombre + Paciente.apellido
                + "\nSexo: " + Paciente.Sexo + "\nFecha de cita: " + Fecha + "\nMotivo: " + Motivo;
        JOptionPane.showMessageDialog(null, mensaje, "Mostrar Doctor", JOptionPane.INFORMATION_MESSAGE);
    }
}
