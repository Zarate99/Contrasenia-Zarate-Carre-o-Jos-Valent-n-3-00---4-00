/*

 * Esta clase contruye los objetos  de Agenda

 */
package nota;

/**
 *
 * @author José Valentín Zarate carreño
 */
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Agenda
{
    /**
     * variables principales 
       */
    private String titulo;
    private final DateFormat fecha;
    private final Date fechaAc;
    private File cuerpo;
    /**
     *  Metodo Constuctor
     * @param titulo El parametro titulo define el titulo que va a tener la nota
       */
    public Agenda(String titulo){
        this.titulo = titulo;
        cuerpo = new File(titulo+".txt");
        fechaAc = new Date();
        fecha = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    /**
      * Método que devuelve el titulo de la Agenda
      * @return El titulo que tiene la Agenda
       */
    public String getTitulo(){
        return titulo;
    }
    
    /**
      * Método que devuelve el archivo (File) relaciando al cuerpo de la Agenda
      * @return El archivo que contiene la Agenda como cuerpo
       */
    public File getCuerpo(){
        return cuerpo;
    }
    
    /**
      * Método que devuelve la fecha 
      * @return La fecha formateada con la que se creo la Agenda
       */
    public String getFecha(){
        return fecha.format(fechaAc);
    }
    
}