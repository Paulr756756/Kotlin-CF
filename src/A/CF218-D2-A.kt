fun main(){
    var k = readln().split(' ')[1].toInt()
    val inputStringList = readln().split(" ").map { it.toInt() }
    val answer = mutableListOf<Int>()
    for( i in inputStringList.indices){
        if(k==0){
            answer.add(inputStringList[i])
            continue
        }
        if(i%2==0){
            answer.add(inputStringList[i])
        }else{
            if(inputStringList[i]>0&&inputStringList[i]>inputStringList[i-1]+1){
                answer.add(inputStringList[i]-1)
                k--
            }
            else answer.add(inputStringList[i])
        }
    }
    for (ans in answer) print("$ans ")
    println()
}