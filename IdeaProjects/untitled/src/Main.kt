fun main() {
    val letter = '9';
    when(letter){
        in 'A' .. 'Z' ,in 'a' .. 'z' ->println("letter is found")
        in '0' .. '9' ->println("num is found")

        else ->println("special character is found")
    }

}