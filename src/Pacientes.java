import java.util.ArrayList;
import java.util.Scanner;

public class Pacientes {





    public static void main (String[] args){

        String Nombre;
        String Apellido;
        String Sexo;
        String IdPaciente;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el Id del Paciente ");
        IdPaciente=teclado.nextLine();

        Scanner teclado1 = new Scanner(System.in);
        System.out.print("Introduzca el nombre del Paciente ");
        Nombre = teclado1.nextLine();

        Scanner teclado2 = new Scanner(System.in);
        System.out.print("Introduzca el apellido del Paciente: ");
        Apellido = teclado2.nextLine();

        Scanner teclado3 = new Scanner(System.in);
        System.out.print("Sexo del paciente ");
        Sexo = teclado3.nextLine();


    }
}


