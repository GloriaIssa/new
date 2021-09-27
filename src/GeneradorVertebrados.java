public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados() {
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero");
        miVertebrados[1] = new Vertebrado("Elefante", "Herviboro");
        miVertebrados[2] = new Vertebrado("perro", "gato");

        return miVertebrados;
    }
}
