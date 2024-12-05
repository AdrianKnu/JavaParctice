package sistema_gestion.modelos;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado() {

    }

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static void mostrarEmpleados(Empleado[] empleados) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.printf("%-8d %-12s %-5d %-10.2f %-15s\n",
                        i + 1,
                        empleados[i].getNombre(),
                        empleados[i].getEdad(),
                        empleados[i].getSalario(),
                        empleados[i].getDepartamento());
            }

        }
    }
    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String atributo){
        Empleado[] copyEmpleadosFiltrados = new Empleado[empleados.length];
        int count = 0;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                System.out.println(empleado.getNombre() + atributo);
                if ((empleado.getNombre()).equalsIgnoreCase(atributo) || (empleado.getDepartamento()).equalsIgnoreCase(atributo)) {
                    System.out.println(empleado.getNombre() + atributo);
                    copyEmpleadosFiltrados[count] = empleado;
                    count++;
                }
            }
        } 
        return copyEmpleadosFiltrados;
    }

    public static Empleado[] filtrarEmpleados(Empleado[] empleados, int maximo, int minimo){
        Empleado[] copyEmpleadosFiltrados = new Empleado[empleados.length];
        int count = 0;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                if ((empleado.getEdad() >= minimo && empleado.getEdad()<= maximo) || (empleado.getSalario() >= minimo && empleado.getSalario()<= maximo)) {
                    copyEmpleadosFiltrados[count] = empleado;
                    count++;
                }
            }
        } 
        return copyEmpleadosFiltrados;
    }

    public static Empleado[] ordenarEmpleados(Empleado[] empleados, String atributo){
        int n = empleados.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (empleados[j]!=null && empleados[j+1]!=null) {
                    boolean intercambiar = false;
                    switch (atributo.toLowerCase()) {
                        case "nombre":
                            intercambiar = empleados[j].getNombre().compareToIgnoreCase(empleados[j+1].getNombre())>0;
                            break;
                        case "departamento":
                            intercambiar = empleados[j].getDepartamento().compareToIgnoreCase(empleados[j+1].getDepartamento())>0;
                            break;
                        case "edad":
                            intercambiar = empleados[j].getEdad()>empleados[j+1].getEdad();
                            break;
                        case "salario":
                            intercambiar = empleados[j].getSalario()>empleados[j+1].getSalario();
                        break;
                    
                        default:
                        System.out.println("El atributo no es valido");
                            return null;
                    }
                    if (intercambiar) {
                        Empleado  temp = empleados[j];
                        empleados[j] = empleados[j+1];
                        empleados[j+1] = temp;
                    }
                }
            }
        }
        return empleados;
    }
}
