fun main (args: Array<String>){

    var LiczbaInt: Int = 10
    var LiczbaLong: Long = 15
    var LiczbaByte: Byte = 5
    var LiczbaShort: Short = 3
    var Czynnik1 = 3
    var Czynnik2 = 4
    var Dzielna = 10
    var Dzielnik = 2
    var DzielnaModulo = 10
    var DzielnikModulo = 3


    var WynikDodawania = LiczbaInt + LiczbaLong
    var WynikOdejmowania = LiczbaByte - LiczbaShort
    var WynikMnożenia = Czynnik1 * Czynnik2
    var WynikDzielenia = Dzielna / Dzielnik
    var WynikModulo = DzielnaModulo % DzielnikModulo
    var WynikOdejmowniaMath = Math.subtractExact(3,5)

    println("Wynikiem dodawania liczby $LiczbaInt i $LiczbaLong jest $WynikDodawania.")
    println("Wynikiem odejmowania liczby $LiczbaByte i $LiczbaShort jest $WynikOdejmowania.")
    println("Wynikiem mnożenia liczby $Czynnik1 i $Czynnik2 jest $WynikMnożenia.")
    println("Wynikiem dzielenia liczby $Dzielna i $Dzielnik jest $WynikDzielenia.")
    println("Resztą z dzielenia liczby $DzielnaModulo i $DzielnikModulo jest $WynikModulo.")
    println("Wynikiem odejmowania liczb $LiczbaShort i $LiczbaByte przy użyciu klasy Math jest $WynikOdejmowniaMath.")



}