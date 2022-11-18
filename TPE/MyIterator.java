package TPE;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<elementoLista> {
    private nodo<T> cursor;

    public MyIterator(nodo<T> primerNodo) {
        this.cursor = primerNodo;
    }




    public boolean hasNext() {
        return this.cursor != null;
    }


    public elementoLista next() {
        elementoLista valor = cursor.getValor();
        cursor = cursor.getSiguiente();
        return valor;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

}