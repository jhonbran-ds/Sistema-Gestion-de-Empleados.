
package javaapplication4;

public class EmpleadoTemporal extends Empleado {

    private int mesesContrato;

    public EmpleadoTemporal(int id, String nombre, double salario, int mesesContrato) {
        super(id, nombre, salario);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }

}

