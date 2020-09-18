fun main(args: Array<String>)
{
    var czySięRusza: String
    var czyPowinnoSięRuszać: String

    println("Czy coś się rusza?")
    czySięRusza = readLine()!!.toUpperCase()

    if (czySięRusza == "TAK")
    {
        println("A powinno się ruszać?")
        czyPowinnoSięRuszać = readLine()!!.toUpperCase()

        if (czyPowinnoSięRuszać == "NIE")
        {
            println("Użyj taśmy i będzie po problemie.")
        }
        else
        {
            println("Zatem nie ma problemu. :)")
        }
    }

    else
    {
        println("A powinno się ruszać?")
        czyPowinnoSięRuszać = readLine()!!.toUpperCase()

        if (czyPowinnoSięRuszać == "NIE")
        {
            println("Zatem nie ma problemu. :)")
        }

        else
        {
            println("Użyj WD-40 i będzie po problemie.")
        }
    }
}