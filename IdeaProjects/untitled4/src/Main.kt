//  cat & dog fun ( without oop )
fun eat (name: String){
    if (name.equals("Cat")||name.equals("cat"))
        println("Bsbs wants Fish ! ")
    else
        println("Boby wants Meat ! ")
}
fun main() {

    // student age task
val s = Student()
    s.age=2
    s.age=6
    println()

// first solve " without oop "
    eat("Cat")
    eat("Dog")
    println()

    // second solve " inheritance "
val c = Cat()
    c.eat()
val d = Dog()
    d.eat()
    println()

    // third solve " abstract "
    val ac =AbstractDog()
    ac.eat("Cat")
    val ad = AbstractDog()
    ad.eat("Dog")
    println()

    // fourth solve " interface "
    val ic=AbstractDog()
    ic.eat("Cat")
    val id=AbstractDog()
    id.eat("Dog")
    println()
}

