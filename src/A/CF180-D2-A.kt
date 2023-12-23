fun main(){
    val n = readln().toInt()
    val input = readln()
    var s = 0
    var e = 0
    for(index in 1..<n){
        if (input[index-1]!='.') {
            s = index
            break
        }
    }

    for(index in n downTo 1){
        if(input[index-1]=='R') {
            e = index+1
            break
        }else if(input[index-1] == 'L' && input[index-2]=='.'){
            e = index-1
        }
    }
    println("$s $e")
}