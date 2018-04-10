
class Persona
{
    
    var nome:String
    var cognome:String
    
    constructor(c_nome:String,c_cognome:String)
    {
        
        this.nome=c_nome;
        this.cognome=c_cognome;
        
    }
    
}

fun main(args: Array<String>)
{
    Persona perGiovanni=Persona("giovanni","celentano")
    
    perGiovanni.nome="Porfirio" 
    println(perGiovanni.nome)
    
}
