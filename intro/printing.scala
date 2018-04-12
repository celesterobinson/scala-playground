// var hello : String = "Hello, world!"

// println(hello)

// var name : String = "Celeste"

// println("No, my name is " + name)

// hello = "Hello, " + name + "!"
// println("Oh, I'm sorry. " + hello)

// Math

val x : Int = 1 + 1
println(x)

// Blocks

println({
    val x = 1 + 1
    x + 1
})


// Functions
(x: Int) => x + 1 // <-- Anonymous Function

val addOne = (x: Int) => x + 1    // <--- Named Function
println(addOne(46))

// val add = (x: Int, y: Int) => x + y   // <--- Multiple parameters
// println(add(89, 14))

val getTheAnswer = () => 42            // <--- No parameters
println(getTheAnswer())


// Methods
def add(x: Int, y: Int): Int = x + y  // 
println(add(92, 8))

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier   // Multiple parameter lists
println(addThenMultiply(1, 2)(3))

def name: String = System.getProperty("user.name")     // No parameters
println("Hello, " + name + "!")

def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
}

