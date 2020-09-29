fun main(args: Array<String>){

    val stala: Int = 10

    print("Podaj dowolną liczbę: ")
    var liczba: Int = readLine()!!.toInt()

    if(liczba>stala)
    {
        println("Podana liczba jest większa niż $stala.")
    }
    else if(liczba%2 == 0)
    {
        println("Podana liczba jest mniejsza niż $stala i jest parzysta.")
    }
    else
    {
        println("Podana liczba jest mniejsza niż $stala i nie jest parzysta.")
    }
    
}