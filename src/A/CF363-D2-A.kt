import kotlin.math.min

fun main(){
    val n = readln().toInt()
    val directions = readln()
    val coords = readln().split(' ').map { it.toLong() }

    var minTime = Long.MAX_VALUE
    for(index in directions.indices){
        if(directions[index] == 'R' && index<directions.length-1){
            if(directions[index+1]=='L'){
                minTime = min(minTime, (coords[index+1] - coords[index])/2)
            }
        }
    }
    if(minTime==Long.MAX_VALUE) println(-1)
    else println(minTime)
}