
package javaapplication4;

    public class EmpleadoPermanente extends Empleado {

    private double bono;

    public EmpleadoPermanente(int id, String nombre, double salario, double bono) {
        super(id, nombre, salario);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bono;
    }

}
    
}
