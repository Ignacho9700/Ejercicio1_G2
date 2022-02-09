/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import ejercicio1_g2.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class LibroUsuario {

    public Libro altaLibro(){
        //instanciar objeto
        Libro l1 = new Libro();
        //guardar atributos
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese el isbn del libro");
        l1.setISBN(leer.next());
        
        System.out.println("ingrese el titulo del libro");
        l1.setTítulo(leer.next());
        System.out.println("ingrese el autor de libro");
        l1.setAutor(leer.next());
        System.out.println("ingrese el numero de paginas");
        l1.setNúmerodepáginas(leer.nextInt());
        return l1;
        

    }


}
