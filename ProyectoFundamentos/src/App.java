import java.util.Scanner;

public class App {
    static Scanner lectorTeclado = new Scanner(System.in); 
    static String prodBuscar; 
    static String nombreProd; 
    static int cantProd; 
    static double precioProd; 
    static int opcionMen; 
    static boolean mostrarmenuPrincipal = false;
    static String reset = "\u001B[0m";
    static String rojo = "\u001B[31m"; 
    static String amararillo = "\u001B[33m";

    public static void main(String[] args) throws Exception {

        while (!mostrarmenuPrincipal) {
            opciones();;
            
            switch (opcionMen) {
            case 1:
            menuDepartamento();
            break;

            case 2:
            agregarProducto();
            break;

            case 3:
            buscarProducto();
            break;

            case 4:
            salirMenu();
            break;

            default:
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
            break;

            }
            }
            }


            //SECCIÓN DE MÉTODOS CREADOS
            static void opciones(){
                System.out.println(rojo + "__________________________________________" + reset);
                System.out.println(rojo + "|" + amararillo + "----" + reset + "BIENVENIDO A LA FERRETERÍA ONLINE" + amararillo + "---" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "----------------------------------------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "-----------" + reset + "¿Que desea realizar?" + amararillo + "---------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "----------------------------------------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "----" + reset + "1.Ver Departamentos de Productos" + amararillo + "----" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "------------" + reset + "2.Agregar Productos" + amararillo + "---------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "-------------" + reset + "3.Buscar Productos" + amararillo + "---------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + amararillo + "------------" + reset + "4.Salir del Sistema" + amararillo + "---------" + rojo + "|" + reset);
                System.out.println(rojo + "|" + "________________________________________" + "|" + reset);
                opcionMen = Integer.parseInt(lectorTeclado.nextLine());
            }
            static void menuDepartamento(){ 
                boolean mostrarmenu1 = false;
                while (!mostrarmenu1) {
                    System.out.println("BIENVENIDO A CONTINUACIÓN LE MOSTRAMOS LOS DEPARTAMENTOS DISPONIBLES");
                    System.out.println("1.Departamento de Hogar:");
                    System.out.println("2.Departamento de Construcción");
                    System.out.println("3.Departamento de Jardinería");
                    System.out.println("4.Volver al menú principal");
                    int opcion = Integer.parseInt(lectorTeclado.nextLine());
                    if (opcion == 1) {
                    System.out.println("BIENVENIDO AL DEPARTAMENTO DE HOGAR");
                    }else if (opcion == 2){
                    System.out.println("BIENVENIDO AL DEPARTAMENTO DE CONSTRUCCIÓN");
                    }else if (opcion == 3) {
                    System.out.println("BIENVENIDO AL DEPARTAMENTO DE JARDINERÍA");
                    }else if (opcion == 4) {
                    System.out.println("DEVOLVIÉNDOSE AL MENÚ PRINCIPAL");
                    mostrarmenu1= true; 
                    }
                    }
            }

            public static void agregarProducto(){
                boolean mostrarMenu2 = false;
                while (!mostrarMenu2) {
                    System.out.println("FAVOR INSERTE EL NOMBRE DEL PRODUCTO A AGREGAR:");
                    nombreProd = lectorTeclado.nextLine();
                    System.out.println("FAVOR INGRESE LA CANTIDAD DE PRODUCTO");
                    cantProd = Integer.parseInt(lectorTeclado.nextLine());
                    System.out.println("FAVOR INSERTE EL PRECIO DEL PRODUCTO A AGREGAR:");
                    precioProd = Double.parseDouble(lectorTeclado.nextLine());
                    System.out.println("1.Agregar otro producto");
                    System.out.println("4.Volver al menú principal");
                    int opcion = Integer.parseInt(lectorTeclado.nextLine());
                    if (opcion == 4) {
                    mostrarMenu2 = true;
                    }
                    }
            }

            static void buscarProducto(){
                boolean mostrarMenu3 = false;
                while (!mostrarMenu3) {
                    System.out.println("FAVOR INSERTE EL NOMBRE DEL PRODUCTO A BUSCAR");
                    prodBuscar = lectorTeclado.nextLine();
                    System.out.println("1.Buscar otro producto");
                    System.out.println("4.Volver al menú principal");
                    int opcion = Integer.parseInt(lectorTeclado.nextLine());
                    if (opcion == 4) {
                    mostrarMenu3 = true;
                    }
                    }
            }

            public static void salirMenu(){
            mostrarmenuPrincipal = true;
            System.out.println("Gracias por Visitar Nuestra Página");
            }
            }
            
        