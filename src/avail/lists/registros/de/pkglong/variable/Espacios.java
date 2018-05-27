
package avail.lists.registros.de.pkglong.variable;

import java.util.Collections;
import java.util.Comparator;

public class Espacios{
    int QLinea;
    int bytes;

    public Espacios() {
    }

    public Espacios(int QLinea, int bytes) {
        this.QLinea = QLinea;
        this.bytes = bytes;
    }

    public int getQLinea() {
        return QLinea;
    }

    public void setQLinea(int QLinea) {
        this.QLinea = QLinea;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return  QLinea + ", bytes=" + bytes + '}';
    }

    
}

