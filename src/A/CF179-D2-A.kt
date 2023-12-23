fun main(){
    val n = readln().toInt()
    val input = readln().split(' ').map { it.toInt() }.toMutableList()

    for (index in input.indices){

        if(index<n-2){
            if(input[index]==input[index+1]){
                val temp = input[index+1]
                input[index+1] = input[index+2]
                input[index+2] = temp

                if (input[index]==input[index+1]){
                    println("NO")
                    return
                }
            }

        }else if(index==n-2){
            if(input[index] ==input[index+1]){
                println("NO")
                return
            }
        }
    }

    println("YES")
}