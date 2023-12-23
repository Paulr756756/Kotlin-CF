fun main(){
    val (n, k)= readln().split(' ').map { it.toInt() }
    var count = 0
    outer@ for (i in 0..<n){
        val numberInString = readln()
        for(character in numberInString){
            if(character.digitToInt() > k) {
                continue@outer
            }
        }
        count++
    }
    println(count)
}