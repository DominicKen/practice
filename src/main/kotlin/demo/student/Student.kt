package demo.student

fun main() {

 val stu = Student("ken",80,80)

stu.count()



}class Student(var name:String,var math:Int,var english:Int) {

fun count(){

    println(name + "\t" + math+"\t"+english+"\t"+(math+english)/2)
}





}