external fun require(module:String):dynamic



fun main(args: Array<String>) 
{

    val express = require("express")
    val app = express()



    app.get("/", { req, res ->

        res.type("text/plain")

        res.send("Sono nella root directory del webserver")

    })



    app.listen(3000, 
    {

        println("Ascolto su porta 3000")

    })

}
