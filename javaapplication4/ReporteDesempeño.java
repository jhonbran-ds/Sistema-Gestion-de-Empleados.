
package javaapplication4;

public class ReporteDesempeño {
 

    private Empleado empleado;
    private int productividad;
    private int puntualidad;

    public ReporteDesempeño(Empleado empleado, int productividad, int puntualidad) {
        this.empleado = empleado;
        this.productividad = productividad;
        this.puntualidad = puntualidad;
    }

    public void generarReporte() throws Exception {

        if (empleado == null) {
            throw new Exception("No se puede generar reporte sin empleado");
        }

        System.out.println("---- REPORTE DE DESEMPEÑO ----");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Departamento: " + empleado.getDepartamento().getNombre());
        System.out.println("Productividad: " + productividad);
        System.out.println("Puntualidad: " + puntualidad);
        System.out.println("Salario Total: " + empleado.calcularSalario());
    }

}
    
}
