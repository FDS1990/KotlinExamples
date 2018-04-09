
class calcolatrice(private var a:Int,private var b:Int)
{
    
	fun somma():Int
	{
    
    	val risultato=a+b
    	return risultato
    
	}

	fun differenza():Int
	{
    
    	val risultato=a-b
    	return risultato
    
	}
    
}


fun main(args: Array<String>) 
{
    
    val risultato=calcolatrice(2,2)
    
    println(risultato.somma())
    println(risultato.differenza())
    
}
