import java.math.BigInteger
import kotlin.math.pow

fun main(){
    val input = readln()
    val minutesPassed = convert(input)
    var count = 0
    var powerCount = BigInteger.ONE
//    println((input.length-1)/2 + 1)

    while (minutesPassed/powerCount> BigInteger.ONE){
        count++
        powerCount*=(BigInteger.TWO + BigInteger.TWO)
    }
    if(powerCount==minutesPassed) println(count)
    else println(++count)

}
private fun convert(x:String):BigInteger{
    var power = 0
    var answer = BigInteger.ZERO
    for (character in x.reversed()){
        if(character.digitToInt() == 1) answer+= 2.00.pow(power++).toBigDecimal().toBigInteger()
        else power++
    }
    return answer
}