 class AbstractDog : AbstractCat() {
     override fun eat(name: String) {
         if (name.equals("Cat") || name.equals("cat")){
             println("Bsbs wants Fish ! ")}
         else{
             println("Boby wants Meat ! ")}
     }
}