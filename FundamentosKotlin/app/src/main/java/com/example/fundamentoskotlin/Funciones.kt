fun main()
{
    sayHello()

    //newTopic("Argumentos")
    val a = 2;
    val b = 3;
    println("$a + $b = ${sum(a,b)}")
    
    //newTopic("Infix")

    val c = -3

    //println(c.enableAbs(false))

    showProduct("prod")


}

fun sayHello()
{
    println("Hola mundo");
}

fun sum(a: Int, b:Int): Int
{
    return  a + b
}

//infix fun Int.enableAbs(enable: boolean) = if (enable) abs(this) else (this)


fun showProduct(name: String)
{
    println("$name")

}