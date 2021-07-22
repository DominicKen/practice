package demo

fun main() {

   val b = BMI1()
    b.Height = 1.7f
    b.Weight = 57f
    println(b.bmi())
}


class BMI1{

    var Weight : Float = 0.0f
    var Height : Float = 0.0f

    fun bmi(): Float{

    val bmi = Weight/(Height*Height)

    return bmi




}



}
