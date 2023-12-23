fun main(){
    val (n,k) = readln().split(' ').map { it.toInt() }
    var count = 0
    for (i in 1..n){
        val (l,r) = readln().split(' ').map { it.toInt() }
        count += r-l+1
    }
    if(count%k==0) println(0)
    else println((((count/k)+1)*k)-count)
}