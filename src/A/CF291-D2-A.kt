fun main(){
    val input = readln()
    var answer = ""
    var isFirstDigit = true;
    for(character in input){
        if(isFirstDigit){
            if(character.digitToInt() in 5..<9) answer+= 9-character.digitToInt()
            else answer+=character
            isFirstDigit=false
            continue
        }
        answer+= if(character.digitToInt()>4) 9-character.digitToInt() else character
    }

    println(answer)
}

