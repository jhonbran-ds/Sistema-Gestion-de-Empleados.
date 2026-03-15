
package javaapplication4;



    import java.util.ArrayList;

public class Departamento {

    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) throws Exception {

        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo");
        }

        empleados.add(empleado);
        empleado.setDepartamento(this);

    }

    public void mostrarEmpleados() {

        for (Empleado e : empleados) {
            System.out.println(e.getNombre());
        }

    }

    public String getNombre() {
        return nombre;
    }

}
}
