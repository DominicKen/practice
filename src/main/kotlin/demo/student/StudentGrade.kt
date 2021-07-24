package demo.student

fun main() {

 val totle = Count("ken",80,80)

    totle.print()
}


class Count(var name : String,var math : Int,var english : Int){

    fun print(){

        println(name+"\t"+math + "\t"+english+"\t"+(math+english)/2)





    }




}





