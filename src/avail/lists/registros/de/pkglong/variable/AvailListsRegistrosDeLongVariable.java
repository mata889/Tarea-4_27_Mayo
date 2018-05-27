package avail.lists.registros.de.pkglong.variable;

/*
Estimados estudiantes,

Utilicen este link para subir el ejercicio iniciado en clase. Como recordatorio:

Deberán traducir de pseudo código al lenguaje utilizado en su proyecto el ejercicio de popular avail list desarrollado durante la clase.
Manejar todos los issues discutidos en clase para generar y cargar la lista en memoria (cargar metadata, popular la lista, ordenarla de acuerdo a la estrategia de ubicación de registros elegida),
Saludos y feliz fin de semana.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AvailListsRegistrosDeLongVariable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**Para metodos de trabajo, se ha creado ya una lista predeterminada con metadata y registros ");
        ArrayList<String> registro = new ArrayList();
        ArrayList<Espacios> available = new ArrayList();
        String meta = " ";
        boolean cargado = false;
        int menu = 0;
        do {

            System.out.println("AvailListRegistrsoDeLongVariable\n1.CargarListaDeRegistrosConMetaData\n2.Listar\n3.ArreglarEliminados\n0.SALIR");
            menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    try {
                        File file = new File("./Registros.txt");
                        if (file.exists()) {
                            Scanner scanner = new Scanner(file);
                            int linea = 0;
                            while (scanner.hasNext()) {
                                String line = scanner.nextLine();
                                if (line.contains("µ")) {
                                    String temp;
                                    temp = line.substring(1, line.length());
                                    meta = Meta(temp);
                                } else if (line.contains("*")) {
                                    int donde = linea;
                                    double espacios = line.getBytes().length;
                                    Espacios e = new Espacios(donde, espacios);
                                    available.add(e);
                                } else {
                                    registro.add(line);
                                }
                                linea++;
                            }
                            if (scanner.hasNext()) {
                                cargado = true;
                                System.out.println("SE HAN CARGADO EXITOSAMENTE");
                            }else{
                                System.out.println("El archivoo esta vacio");}

                        } else {
                            System.out.println("EL ARCHIVO NO EXISTE");
                        }

                    } catch (Exception e) {
                    }
                }
                break;
                case 2: {
                    System.out.println(meta);
                    if (cargado == true) {
                        for (int i = 0; i < registro.size(); i++) {
                            StringTokenizer token = new StringTokenizer(registro.get(i), "|");
                            while (token.hasMoreTokens()) {
                                System.out.print(token.nextToken());
                            }
                            System.out.println("");
                        }
                    } else {
                        System.out.println("PORFAVOR CARGUE LOS ARCHIVOS");
                    }

                }
                break;
                case 3: {
                }
                break;
            }
        } while (menu != 0);

    }

    static String Meta(String meta) {
        String mew = " ";
        StringTokenizer token = new StringTokenizer(meta, "!");
        while (token.hasMoreTokens()) {
            mew = token.nextToken() + "$0 ";
        }
        return mew;
    }

    /**
     * public static String fixedLengthString(String string) { return
     * String.format("%1$-" + (19) + "s", string); }*
     */
}
