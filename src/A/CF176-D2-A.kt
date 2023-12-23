fun main(){
    val rows = mutableListOf<String>()
    var k=4
    while(k-- >0){
        rows.add(readln())
    }

    for(rowIndex in rows.indices){
        if(rowIndex==0) continue
        for (colIndex in rows[rowIndex].indices){
            if(colIndex==0) continue
            var count = 1
            if(rows[rowIndex][colIndex] == '#'){
                if(rows[rowIndex][colIndex-1] == '#') count++
                if(rows[rowIndex-1][colIndex-1] == '#') count++
                if(rows[rowIndex-1][colIndex] == '#') count++
            }else {
                if(rows[rowIndex][colIndex-1] == '.') count++
                if(rows[rowIndex-1][colIndex-1] == '.') count++
                if(rows[rowIndex-1][colIndex] == '.') count++
            }
            if(count==1||count==3||count==4){
                println("YES")
                return
            }
        }
    }

    println("NO")
}