
public class Main  {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(1, "Selmini", 2000000, 30);
        empregado[1] = new EmpregadoHorista(2, "Patrícia", 210, 175.00);
        empregado[2] = new EmpregadoHorista(3, "Age", 10, 35);

        for(Empregado e : empregado) {
            System.out.println(e.toString());
            System.out.println(e.calcularSalario());
        }
    }
}
