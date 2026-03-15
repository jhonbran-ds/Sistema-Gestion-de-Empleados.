
package javaapplication4;

public class Main {
    

    public static void main(String[] args) {

        try {

            Departamento sistemas = new Departamento("Sistemas");

            Empleado emp1 = new EmpleadoPermanente(1, "Carlos", 2000, 500);
            Empleado emp2 = new EmpleadoTemporal(2, "Ana", 1500, 6);

            sistemas.agregarEmpleado(emp1);
            sistemas.agregarEmpleado(emp2);

            ReporteDesempeño reporte = new ReporteDesempeño(emp1, 90, 95);

            reporte.generarReporte();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}
    
}
