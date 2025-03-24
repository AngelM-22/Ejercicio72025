package org.gerdoc.inicio;

import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;
import org.gerdoc.vista.Ventana;

/**
 *
 */
public class Inicio
{

    /**
     * Default constructor
     */
    public Inicio()
    {
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        Historiales historiales = null;
        historiales = Historial.getInstance( );
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = org.gerdoc.vista.Consola.getInstance();
                    break;
                case 2:
                    ejecutable = org.maldonado.vista.Consola.getInstance( );
                    break;
                case 3:
                    ejecutable = org.reyes.vista.Consola.getInstance( );
                    break;
                case 4:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 5:
                    ejecutable = org.maldonado.vista.Ventana.getInstance( );
                    break;
                case 6:
                    ejecutable = org.reyes.vista.Ventana.getInstance( );
                    break;
                case 7:
                    historiales.imprimir();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }
    }

}