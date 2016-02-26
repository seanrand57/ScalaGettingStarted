// Expressions
// can be defined in Scala as follows
// this holds a res in memory such as res0 = 2
1 + 1


// Values
// Val is representative of a Value and cannot
// be changed once set.

val five = 6 - 1

// Variables
// if you need to change the variable value
// then use a var, however in scala val is best practice

var name = "Sean"
//just type in the variable name and see the value = sean
name

name = "Sean Rand"
// check the name variable now, it contains my surname
name


// Functions
// These are similar to methods as such in Java and CSharp.

def addOne(m: Int): Int = m + 1

// calling the function with a value of 5
// will add 1 to it and return an Int value,
// in this case its 6
addOne(5)

// you can set a val from a function this is common

val ten = addOne(9)
ten

// you can create a function with no arguments such as

def multipleTwoNumbers() = 4*4
// call the function and 16 is the answer it returns
multipleTwoNumbers()

// Anonymous Functions
// you can create these functions to pass around code and saveas vals

val setAString = (x: String) => x
setAString("Setting a Val from a Function")



// If your function is made up of many
// expressions such as a print and times,
// you can use {} to give yourself
// some breathing room.

def timesTen(i: Int): Int = {
  println("Sean Rand")
  i*10
}

// now call that method you should see Sean Rand
// and the answer of 100 since I pass an argument of 10

timesTen(10)

// The above is also true of Anonymous functions too

val anon = { i : Int =>
  println("Sean Rand")
  i*10
}


// calling the VAL which has the anonymous function associated to it
anon(50)

//Partial Applications and Functions
//You can partially apply a function with
// an underscore, which gives you another function.
// Scala uses the underscore to mean different
// things in different contexts,
// but you can usually think of it as an unnamed
// magical wildcard. In the context of { _ + 2 }
// it means an unnamed parameter.
// You can use it like so:

def subtracter(m: Int, n: Int) = m - n

// this creates a function from a function ie, partial
// in the below example I always want to substract from the Int 2
val subtractVersion2 = subtracter(2, _:Int)

// result = -38
subtractVersion2(40)

// result = 0
subtractVersion2(2)


//Curried Function

//Sometimes it makes sense to let people apply
// some arguments to your function now and others
// later.

//Here’s an example of a function that lets you
// build multipliers of two numbers together.
// At one call site, you’ll decide which is the
// multiplier and at a later call site, you’ll
// choose a multiplicand.



def multiply(m: Int)(n: Int): Int = m * n

// Simple answer of 25 calling with both Arguments
multiply(5)(5)

// Now we can fill in the first parameter
// and partially apply the second to a Val.
// A Little like anonymous functions
// Note: we're using _ to denote the wildcard

val newMultiply = multiply(2) _

// now calling the above newMultiply by 2 functions gives
// answer of 8 given 2 was set above and 4 is our parameter.
newMultiply(4)

// You can take ANY function of multiple arguments and curry it.
// Lets try with our earlier substractor example

val curriedSub = (subtracter _).curried
val subtractTwo = curriedSub(2)
// answer -4
subtractTwo(6)


// Variable Length Arguments

// This is a pretty cool scala addition which allows you to have repeated type arguments in
// a method signature

def capitalizeAll(args: String*) = {
  args.map { arg =>
    arg.capitalize
  }
}

// lets capitalize many lower case words
capitalizeAll("sean","rand", "many","words")







