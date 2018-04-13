
import java.lang.Thread;

class esempio_thread:Thread()
{

    override fun run()
    {

        println("ciao sono un thread creato tramite l'interoperabilità tra kotlin e java")


    }



}


fun main(args:Array<String>)
{

    var esempio=esempio_thread()
    esempio.start()



}
