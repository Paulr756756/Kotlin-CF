import java.util.*

fun main(){
    val input = readln()
    val remainingWts = readln()

    var leftScale = ""
    var rightScale = ""
    var isLeft = true;
    for(character in input){
        if(character=='|'){
            isLeft= false
            continue
        }
        if(isLeft){
            leftScale+=character
        }else{
            rightScale+=character
        }
    }

    val stk = Stack<Char>()
    for(character in remainingWts) stk.push(character)

    while (!stk.empty()){
        if(leftScale.length>rightScale.length){
            rightScale+=stk.pop()
        }else if (leftScale.length<rightScale.length){
            leftScale+=stk.pop()
        }else{
            if(stk.count()%2!=0){
                println("Impossible")
                return
            }
            leftScale+=stk.pop()
        }
    }
    if(leftScale.length!=rightScale.length) println("Impossible")
    else println("$leftScale|$rightScale")
}