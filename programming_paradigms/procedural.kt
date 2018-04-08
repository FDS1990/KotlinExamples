

fun somma(a:Int,b:Int):Int
{
    
    val risultato=a+b
    return risultato
    
}

fun differenza(a:Int,b:Int):Int
{
    
    val risultato=a-b
    return risultato
    
}

fun main(args: Array<String>) 
{
    val risultato_somma=somma(2,2)
    val risultato_differenza=differenza(2,2)
    
    println(risultato_somma)
    println(risultato_differenza)
    
}