package sistema_gestion;

import sistema_gestion.modelos.Empleado;

public class Application {
    public static void main(String[] args) {
    Empleado[] empleados = new Empleado[5];
    
    // Ejemplo 1
    empleados[0] = new Empleado();
    empleados[0].setNombre("Pablo");
    empleados[0].setEdad(20);
    empleados[0].setSalario(3000);
    empleados[0].setDepartamento("Marketing");

    // Ejemplo 2
    empleados[1] = new Empleado();
    empleados[1].setNombre("Fer");
    empleados[1].setEdad(25);
    empleados[1].setSalario(2000);
    empleados[1].setDepartamento("Comunicaciones");

    // Ejemplo 3
    empleados[2] = new Empleado();
    empleados[2].setNombre("Ana");
    empleados[2].setEdad(30);
    empleados[2].setSalario(4000);
    empleados[2].setDepartamento("Finanzas");

    // Ejemplo 4
    empleados[3] = new Empleado();
    empleados[3].setNombre("Luis");
    empleados[3].setEdad(35);
    empleados[3].setSalario(3500);
    empleados[3].setDepartamento("Ventas");

    // Ejemplo 5
    empleados[4] = new Empleado();
    empleados[4].setNombre("María");
    empleados[4].setEdad(28);
    empleados[4].setSalario(3200);
    empleados[4].setDepartamento("Recursos Humanos");
    
    Empleado.mostrarEmpleados(empleados);
    Empleado[] filtrado = Empleado.filtrarEmpleados(empleados, "Pablo");
    Empleado.mostrarEmpleados(filtrado);
    System.out.println("Esto es otra cosa:");
    Empleado[] ordenado = Empleado.ordenarEmpleados(empleados, "nombre");
    Empleado.mostrarEmpleados(ordenado);
    }
    }
