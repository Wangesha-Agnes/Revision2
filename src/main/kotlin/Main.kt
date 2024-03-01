fun main(){
concateString()
    multiplyNumber(5, 3)
    countWord("Wangesha")
division(10, 2)
}
fun concateString() {
    val str1="Hello"
    val str2="World"

    println("$str1 $str2")
}
fun multiplyNumber(a: Int, b:Int): Int {
    val a= 5
    val b= 3
    var multiply= (a * b)
    println(multiply)
    return(multiply)
}
fun countWord(Word:String) {
   var word ="Wangesha"
   var wordlength=word.length
   println(wordlength)
}
fun division(x:Int, y:Int):Int{
    val x = 10
    val y = 2
    var division = (x/y)
    println(division)
    return(division)
}