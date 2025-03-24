package org.reyes.vista;

import org.gerdoc.historial.Historiales;

public interface Ejecutable extends org.maldonado.vista.Ejecutable{
    void run();
    void addHistoriales( Historiales historiales );
}
