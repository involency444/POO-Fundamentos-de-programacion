package retroalimentacionparcial1;


public class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperiencia;
    
    public Empleado () {
    }

    public Empleado(String nombre, String cargo, double salarioBase, int anosExperiencia) {
    this.nombre = nombre;
    this.cargo = cargo;
    this.salarioBase = salarioBase;
    this.anosExperiencia = anosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    
    public String verDetalle(){
        return "El empleado se llama: " + this.nombre +
        "\n El cargo del empleado es: " + this.cargo +
        "\n El salario del empleado es: " + this.salarioBase +
        "\n El salario tiene: " + this.anosExperiencia;
    }
    public String trabajar(int horas) {
        return "El empleado llamado: " + this.nombre + "trabaja" + horas + " a la semana";
    }
    public String tomarDescanso() {
        return "El empleado llamado: " + this.nombre + "descansa 1 hora al dia";
    }
    public String trabajarYDescansar(int horas){
        return this.trabajar(horas) + this.tomarDescanso();
    }
    public double calcularBono(float porcentaje) {
        return salarioBase*porcentaje/100;
    }
    public double calcularSalarioTotal(double bono, int diasTrabajados){
        double salarioPorDia = this.salarioBase/30;
        double salarioTrabajado = salarioPorDia * diasTrabajados;
        return salarioTrabajado + this.calcularBono(diasTrabajados);
                
        
    }
}
