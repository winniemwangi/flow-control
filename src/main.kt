fun main()
{
    oddNumbers()
    var z=carNames(arrayOf("Chevrolet","Audi","Volvo","Lamborghini"))
    println(z)
    robot(4)
    robot(10)
    robot(21)
    multiples()
}

//Create a function that prints out all the odd numbers between 1 and 100

fun oddNumbers()
{
    for (number in 1..100)
    {
        if (number%2!=0)
        {
            println(number)
        }
    }
}

//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

fun carNames(names: Array<String>):Int
{
    var y=0
    names.forEach {
        names->
        if (names.length >5)
        {
            y++
        }
    }
    return y
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of Coca cola. Create a function that will make these decisions,
//printing out the name of the drink each person gets according to their age.

fun robot(age: Int)
{
    if (age<6)
    {
        println("A glass of milk")
    }
    else if (age<15 && age >6)
    {
        println("A bottle Fanta orange")
    }
    else
    {
        (println("A  bottle of Cocacola"))
    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number

fun multiples()
{
    for (num in 1..100)
    {
        if (num % 3 == 0 && num % 5 ==0)
            println("FizzBuzz")
        else if (num % 3 == 0)
            println("Fizz")
        else if (num % 5 == 0)
            println("Buzz")
        else println(num)
    }
}