
package avail.lists.registros.de.pkglong.variable;

public class Espacios {
    int QLinea;
    double bytes;

    public Espacios() {
    }

    public Espacios(int QLinea, double bytes) {
        this.QLinea = QLinea;
        this.bytes = bytes;
    }

    public int getQLinea() {
        return QLinea;
    }

    public void setQLinea(int QLinea) {
        this.QLinea = QLinea;
    }

    public double getBytes() {
        return bytes;
    }

    public void setBytes(double bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return  QLinea + ", bytes=" + bytes + '}';
    }
    
    
}
