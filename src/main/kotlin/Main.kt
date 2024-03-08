fun main(){
concateString()
    multiplyNumber(5, 3)
    countWord("Wangesha")
division(10, 2)
    area(20)
    circumference(40)
    subjectMark(80,90,60,50,70)
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
fun area(radius:Int) {
    var b = radius * radius
    var result = 3.142 * b
    println(result)
}
fun circumference(radius:Int){
    var diameter = radius + radius
    var circumference = 3.142*diameter
    println (circumference)
}
fun subjectMark(kotlin:Int,design:Int,pm:Int,frontend:Int,das:Int){
    var sum = kotlin+design+pm+frontend+das
    var result = sum / 5
    println (result)
}