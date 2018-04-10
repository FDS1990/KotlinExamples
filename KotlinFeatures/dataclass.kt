

data class anagrafica(var nome:String,var cognome:String,var eta:Int,var codice_fiscale:String)


fun main(args: Array<String>) 
{

    val giovanni=anagrafica("giovanni","celentano",60,"GC123456789")
    
    println("nome: "+giovanni.nome+" cognome: "+giovanni.cognome+" eta: "+giovanni.eta+ " codice_fiscale: "+giovanni.codice_fiscale)
    
    giovanni.eta=20
    println(giovanni.eta)
    
    
}
