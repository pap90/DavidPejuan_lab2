/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class LabII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int state = 0;
        ArrayList<aviones> aviones = new ArrayList();
        ArrayList<aviones> avionesest = new ArrayList();
        ArrayList<aviones> avioneses = new ArrayList();
        ArrayList<aviones> avioneslistos = new ArrayList();
        ArrayList<aviones> avionesenvuelo = new ArrayList();
        int resp = -1;
        while (resp != 0) {
            System.out.println("0- salir\n"
                    + "1- log in\n"
                    + "2- registro de aviones\n"
                    + "3- manejo de trafico\n");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Ingrese el usuario (admin): ");
                    String u = sc.next();
                    System.out.println("Ingrese la contraseña (admin): ");
                    String c = sc.next();
                    if (u.equals("admin") && c.equals("admin")) {
                        state = 1;
                    } else {
                        System.out.println("contraseña incorrecta.");
                    }
                    break;
                case 2:
                    if (state == 1) {
                        int resp2 = -1;
                        while (resp2 != 0) {
                            System.out.println("1- crear aviones.\n"
                                    + "2- leer aviones\n"
                                    + "3- actualizar aviones\n"
                                    + "4- borrar aviones\n"
                                    + "0- salir");
                            resp2 = sc.nextInt();
                            switch (resp2) {
                                case 1:
                                    try {
                                        System.out.println("Ingrese el numero de modelo: ");
                                        int nummod = sc.nextInt();
                                        System.out.println("Ingrese el codigo (alfanumerico) del avion: ");
                                        String codigo = sc.next();
                                        System.out.println("Ingrese el año de fabricacion: ");
                                        int añofab = sc.nextInt();
                                        System.out.println("Ingrese el año de ingreso al aereopuerto: ");
                                        int añoingreso = sc.nextInt();
                                        System.out.println("Ingrese la capacidad de pasageros: ");
                                        int capacidadpasageros = sc.nextInt();
                                        System.out.println("Ingrese el peso maximo cargado por el avion (Kg): ");
                                        int pesomax = sc.nextInt();
                                        System.out.println("Ingrese el numero de motores: ");
                                        int nummot = sc.nextInt();
                                        System.out.println("Ingrese el primer nombre del ingeniero acargo: ");
                                        String nombre = sc.next();
                                        avionesest.add(new aviones(nummod, codigo, añofab, añoingreso, capacidadpasageros, pesomax, nummot, nombre));
                                        aviones.add(new aviones(nummod, codigo, añofab, añoingreso, capacidadpasageros, pesomax, nummot, nombre));
                                    } catch (Exception e) {
                                        System.out.println("verifique que el dato este correcto");
                                    }

                                    break;
                                case 2:
                                    listar(aviones);
                                    break;
                                case 3:
                                    if (aviones.size() != 0) {
                                        listar(aviones);
                                        System.out.println("seleccione el numero de avion a modificar: ");
                                        int numero = sc.nextInt();
                                        System.out.println("1-modificar el numero de modelo\n"
                                                + "2- modificar el codigo\n"
                                                + "3- modificar el año de fabricacion\n"
                                                + "4- modificar el año de ingreso\n"
                                                + "5- modificar capacidad de pasageros\n"
                                                + "6- modificar peso maximo cargado por el avion.\n"
                                                + "7- modificar las horas de vuelo.\n"
                                                + "8- modificar el numero de motores.\n"
                                                + "9- modificar el  ingeniero a cargo.");
                                        int resp3 = sc.nextInt();
                                        switch (resp3) {
                                            case 1:
                                                System.out.println("Ingrese el nuevo modelo: ");
                                                int nuevmod = sc.nextInt();
                                                aviones.get(numero).setNummod(nuevmod);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese el nuevo codigo: ");
                                                String nuevcod = sc.next();
                                                aviones.get(numero).setCodigo(nuevcod);
                                                break;
                                            case 3:
                                                System.out.println("ingrese el nuevo año de creacion: ");
                                                int nuevcrea = sc.nextInt();
                                                aviones.get(numero).setFabricacion(nuevcrea);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese el nuevo año de ingreso ");
                                                int nuevingre = sc.nextInt();
                                                aviones.get(numero).setIngreso(nuevingre);
                                                break;
                                            case 5:
                                                System.out.println("ingrese la nueva capacidad de pasageros: ");
                                                int nuevcappas = sc.nextInt();
                                                aviones.get(numero).setCapacidadpasageros(nuevcappas);
                                                break;
                                            case 6:
                                                System.out.println("Ingrese el nuevo peso maximo: ");
                                                int nuevpesomax = sc.nextInt();
                                                aviones.get(numero).setPesomax(nuevpesomax);
                                                break;
                                            case 7:
                                                System.out.println("Ingrese las nuevas horas de vuelo: ");
                                                int nuevhorasvuelo = sc.nextInt();
                                                aviones.get(numero).setHorasvuelo(nuevhorasvuelo);
                                                break;
                                            case 8:
                                                System.out.println("Ingrese la nueva cantidad de motores: ");
                                                int nuevcontmot = sc.nextInt();
                                                aviones.get(numero).setNummotores(nuevcontmot);
                                                break;
                                            case 9:
                                                System.out.println("Ingrese el primer nombre del nuevo ingeniero a cargo: ");
                                                String nuevnom = sc.next();
                                                aviones.get(numero).setNombre(nuevnom);
                                                break;
                                            default:

                                        }

                                    }
                                    break;
                                default:

                            }
                        }
                    } else {
                        System.out.println("no esta log in.");
                    }
                    break;
                case 3:
                    int resp4 = -1;
                    while (resp4 != 0) {
                        System.out.println("0- salir\n"
                                + "1- cambiar estado de aviones estacionados.\n"
                                + "2- cambiar estado de aviones en espera \n"
                                + "3- cambiar estado de aviones listos\n"
                                + "4- cambiar estado de aviones en vuelo.");
                        resp4 = sc.nextInt();
                        switch (resp4) {
                            case 1:
                                if (avioneses.size() < 10) {

                                    System.out.println("Seleccione el avion: ");
                                    listar(avionesest);
                                    int respest = sc.nextInt();
                                    avioneses.add(avionesest.get(respest));
                                    avionesest.remove(respest);
                                }
                                else{
                                    System.out.println("ya hay diez aviones en espera.");
                                }
                                break;
                            case 2:
                                System.out.println("seleccione el avion: ");
                                listar(avioneses);
                                int respes=sc.nextInt();
                                System.out.println("");
                            default:

                        }
                    }
                    break;
                default:

            }

        }

    }

    public static void listar(ArrayList aviones) {
        for (int i = 0; i < aviones.size(); i++) {
            System.out.println("avion numero " + i + " : " + aviones.get(i));
        }
    }

}
