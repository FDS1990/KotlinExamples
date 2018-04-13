
import java.lang.Thread;

class esempio_thread(private var valore:Int):Thread()
{

    override fun run()
    {
      println("Sono un thread creato tramite l'interoperabilità tra kotlin e java")
    }

    public @Synchronized fun funzione_thread()
    {
      println("Codice eseguito tramite il metodo funzione_thread")
    }

}


fun main(args:Array<String>)
{

    var esempio=esempio_thread(2)
    esempio.start()
    esempio.funzione_thread()

}

