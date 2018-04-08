
class calcolatrice
{

    private var a:Int=0
    private var b:Int=0
    
    constructor(integer_number1:Int)
    {
        
        a=integer_number1
        
    }
    
    constructor(integer_number1:Int,integer_number2:Int)
    {
     
        a=integer_number1
        b=integer_number2
        
    }
    
    fun self_somma_numero1():Int
    {
        
        return a+a
    }
    
	fun somma():Int
	{
    
        var risultato=a+b
    	return risultato	
	
     }

	fun differenza():Int
	{
    		var risultato=a-b
    		return risultato
	}
    
}


fun main(args: Array<String>) 
{
    
    val risultato=calcolatrice(2,2)
    val singolo_numero=calcolatrice(2)
    
    println(risultato.somma())
    println(risultato.differenza())
    
    println(singolo_numero.self_somma_numero1())
    
}