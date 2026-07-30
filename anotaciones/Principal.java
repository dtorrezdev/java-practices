
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        List<Libro> lista = new ArrayList<>();
        lista.add(new Libro("titulo1", "pedro"));
        lista.add(new Libro("titulo2", "david"));
        procesar(lista);

    }

    public static void procesar(List<Libro> lista) {

        try {
            for (Object o : lista) {
                Field[] campos = o.getClass().getDeclaredFields();

                for (Field campo : campos) {

                    Imprimible imprimir = campo.getAnnotation(Imprimible.class);
                    // System.out.println(imprimir);
                    if (imprimir != null) {
                        if (imprimir.mayusculas()) {
                            System.out.println(campo.get(o).toString().toUpperCase());
                        } else {
                            System.out.println(campo.get(o).toString());

                        }
                    }
                }
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
