
interface Currency{
    fun getSymbol():String
}
class Real : Currency{
    override fun getSymbol() = "BRL"
}

class Euro : Currency{
    override fun getSymbol() = "EUR"
}

interface Country
class Brazil : Country {
    val currency: Currency? = null
}
class TheNetherLands : Country {
    val currency: Currency? = null
}

class CurrencyFactory {
    companion object {
        fun createCurrency(country: Country) : Currency{
            return when(country){
                is Brazil -> Real()
                is TheNetherLands -> Euro()
                else -> throw Exception("Could not generate currency for $country")
            }
        }
    }
}

fun main(){
    //Main saiba do detalhe de implementcao da Currency
    val country = Brazil()
    val brazillianCurrency = CurrencyFactory.createCurrency(country)
    println(brazillianCurrency.getSymbol())

}