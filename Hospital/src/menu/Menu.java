package menu;

import hospital.Hospital;
import usuarios.Usuario;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;


import java.util.Scanner;
//Sergio Manrique
public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();


    public void login(){
        int intentosMaximos=5, intentosUsuario = 0;

        while(intentosUsuario < intentosMaximos){
            System.out.println("\n**Bienvenido**\n");
            System.out.println("Inicia sesion para continuar");
            System.out.println("Ingrese tu Id de usuario");
            String usuario = sc.next();

            System.out.println("Ingresa tu contrasenia");
            String contrasenia = sc.next();

            Usuario usuariosesion=hospital.validarInicioSesion(usuario, contrasenia);

            if(usuariosesion instanceof Usuario){
                if(usuariosesion.getRol() == Rol.PACIENTE){
                //mostrar menu paciente
                    Paciente pacienteEnSesion = (Paciente)usuariosesion;
                   // this.mostrarMenuPaciente(pacienteEnSesion);
                    MenuPaciente menuPaciente = new MenuPaciente();
                    int opcion =0;
                    while (opcion != 4) {
                         opcion = menuPaciente.mostrarMenu();
                        menuPaciente.ProcesarDatosMenu(opcion, hospital, pacienteEnSesion);
                    }
                    intentosUsuario=0;
                }else if (usuariosesion.getRol() == Rol.MEDICO){
                    Medico medicoEnSesion = (Medico)usuariosesion;
                    //this.mostrarMenuMedico(medicoEnSesion);
                    MenuMedico menuMedico = new MenuMedico();
                    int opcion =0;
                    while (opcion != 5) {
                        opcion = menuMedico.mostrarMenu();
                        //menuMedico.ProcesarDatosMenu(opcion, hospital, medicoEnSesion);
                        menuMedico.ProcesarDatosMenu(opcion,medicoEnSesion,hospital);
                    }
                    intentosUsuario=0;
                }else {
                    //this.mostrarMenuAndimistrador();
                    Administrador administradorEnSesion = (Administrador)usuariosesion;
                    MenuAdministrador menuAdministrador = new MenuAdministrador();
                    int opcion =0;
                    while (opcion != 12) {
                        opcion = menuAdministrador.mostrarMenu();
                        menuAdministrador.ProcesarDatosMenu(opcion,hospital,administradorEnSesion);
                    }
                    intentosUsuario=0;
                }
            }else{
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
            }
        }


        System.out.println("Intentos maximos permitidos alcanzados");
    }

    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("\nUsuario o contrasenia incorrectos, intenta de nuevo");
        return intentosUsuario +1;

    }

}
//Admin vea su informacion