
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LaboratorioEps{
    
    private Queue<Paciente> pacientes;
    private Paciente enCurso;
    private int tiempoRestante;
    private int numPacientes;
    
    public LaboratorioEps() {
        pacientes = new LinkedList<>();
        enCurso = null;
        tiempoRestante = 0;
        numPacientes = 0;
    }