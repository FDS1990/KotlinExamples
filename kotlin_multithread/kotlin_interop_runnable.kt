
import java.lang.Thread;

class esempio_thread(private var valore:Int):Runnable
{

    override fun run()
    {
      println("Sono un thread creato tramite l'interoperabilità tra kotlin e java")
    }

    public fun funzione_thread()
    {
      println("Codice eseguito tramite il metodo funzione_thread")
    }

}


fun main(args:Array<String>)
{

    var runnable_exe:Runnable
    runnable_exe=esempio_thread(2)
    
    var t=Thread(runnable_exe)
    t.start()
    

}
