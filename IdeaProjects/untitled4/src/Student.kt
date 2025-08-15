class Student {
    var age = 0

        set(value) {
            field = value
            if (field<5){println("Age is not valid ! ")}
            else
                println("Age saved successfully")


}}