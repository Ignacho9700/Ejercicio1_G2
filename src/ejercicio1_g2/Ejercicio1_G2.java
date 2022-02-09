/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_g2;

import Usuario.LibroUsuario;
import ejercicio1_g2.entidades.Libro;

/**
 *
 * @author ignac
 */
public class Ejercicio1_G2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
       
        LibroUsuario lu=new LibroUsuario();
        Libro l1=lu.altaLibro();
        System.out.println("ISBN:"+l1.getISBN());
        System.out.println("TITULO:"+l1.getTítulo());
        System.out.println("AUTOR:"+l1.getAutor());
        System.out.println("NUMERO DE PAGINAS:"+l1.getNúmerodepáginas());
    }

}
