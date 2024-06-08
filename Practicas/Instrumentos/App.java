public class App {
    public static void main(String[] args) throws Exception {
     Guitarra guitarra = new Guitarra();
     Piano piano = new Piano();
     Violin violin = new Violin();

     guitarra.TocarInstrumento();
     piano.TocarInstrumento();
     violin.TocarInstrumento();

    }
}
