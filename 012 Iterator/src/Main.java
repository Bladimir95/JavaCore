import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Luis");
        names.add("Pedro");

        Iterator<String> iterator = names.iterator();
        //De esta forma podemos eliminar elementos sin que el programa arroje un
        //ConcurrentModificationException
        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Luis")) {
                iterator.remove();
            }
        }
        //Elimina el elemento y enseguida actualiza su modCount
        //La otra es con una copia del array
        //La tercera y más moderna names.removeIf(name -> name.equals("Luis"));
    }
}