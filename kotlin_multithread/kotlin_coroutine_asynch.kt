
import kotlinx.coroutines.experimental.*

fun main(args: Array<String>)
{
    
    val var_asynch1=async()
    {
        
        var number_2=2
		number_2+=3
        
    }
    
    val var_asynch2=async()
    {
        
        var number=3
        number+=1
        
        
    }
 
    launch()
    {
        
    val risultato=var_asynch1.await()
    val risultato_2=var_asynch2.await()    
           
    println(risultato)
    println(risultato2)

    }
   
    
}




