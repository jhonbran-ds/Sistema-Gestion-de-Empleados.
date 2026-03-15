
package javaapplication4;


    public abstract class Empleado {

    private int id;
    private String nombre;
    private double salario;
    private Departamento departamento;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Método abstracto (Polimorfismo)
    public abstract double calcularSalario();

}
    
}
