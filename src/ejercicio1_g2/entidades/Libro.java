/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_g2.entidades;

/**
 *
 * @author ignac
 */
public class Libro {
    public String ISBN;
    public String Título;
    public String Autor;
    public int Númerodepáginas;
    
    //constructores

    public Libro() {
    }
    //constructor por parametros    

    public Libro(String ISBN, String Título, String Autor, int Númerodepáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Númerodepáginas = Númerodepáginas;
    }
    ///getter and setter

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNúmerodepáginas() {
        return Númerodepáginas;
    }

    public void setNúmerodepáginas(int Númerodepáginas) {
        this.Númerodepáginas = Númerodepáginas;
    }
    
}
