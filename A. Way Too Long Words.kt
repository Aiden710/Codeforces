fun main(){
    val n = readln()!!.toInt()

    for(i in 1..n){
        val word = readLine()!!
        println("$word")
        if(word.length>10){
            println("${word[0]}${word.length - 2}${word.last()}")
        }
        else{
            println("$word")
        }
    }
}