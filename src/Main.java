import java.util.Date;
import java.util.Scanner;

public static void main (String[] args){

        String IDPaciente;
        String Nombre;
        String Apellido;
        String Sexo;
        Date FechaNac;

        Scanner teclado = new Scanner(System.in);
        System.out.print("ID del Paciente ");
        IDPaciente=teclado.nextLine();

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Nombre del Paciente ");
        Nombre = teclado1.nextLine();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Apellido del Paciente: ");
        Apellido = teclado2.nextLine();

        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Sexo ");
        Sexo = teclado3.nextLine();

        Scanner teclado4 = new Scanner(System.in);
        System.out.print("Fecha de nacimiento del paciente ");
        FechaNac = teclado4.nextLine();

        }