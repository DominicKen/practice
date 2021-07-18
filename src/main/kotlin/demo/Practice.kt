package demo

fun main() {

    val b = BMI1(57f,1.7f)


    println(b.bmi())
}


class BMI1( var Weight : Float,var Height : Float){
fun bmi(): Float{

    val bmi = Weight/(Height*Height)

    return bmi




}



}
