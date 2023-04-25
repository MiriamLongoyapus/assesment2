fun main() {
    val name= "Miriam"
    name.random()
    println(name.first())
    name.random()
    println(name.last())
    name.random()
    println(name.length)
    var password=Detail(237857247)
    multiple(1000)
    var account=CurrentAccount(23456578,"Mishka",5000)
    println(account.deposit(600.50))
    println(account.withdraw(800.50))
    account.accountdetails()

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun random(name:String):String{
    return name
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun Detail(password:Int):Boolean{
    for (n in password){
        if (password >password){
            println("true")
        }else if (n in password<=16){
            println("true")
        }else if (password=>password){
            println("false")
        }else(n in password=digits){
            println("true")
        }

    }
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiple(num:Int){
    for (num in 1..1000){
        if (num %6==0 && num %8==0){
            println("Bingo")
        }
    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Int){
    fun deposit(amount:Double){
        balance=amount + deposit(300.50)
        balance ++

    }
    fun withdraw(amount: Double):Int{
        balance=amount-Double
        balance --
        return balance

    }
    fun accountdetails(){
        println("$accountNumber with $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
//class SavingsAccount(accountNumber:Int,accountName:String,balance:Int):CurrentAccount(accountNumber,accountName,balance){
//    override fun withdraw(amount: Double) {
//
//    }
//
//}
class SavingsAccount(var accountNumber:Int,var accountName:String,var balance:Int){
    fun withdraw(){
        open fun withdraw(amount: Double):Int{
            balance=amount-Double
            balance ++
            return balance


        }
}