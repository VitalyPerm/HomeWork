open class User(var id: Int, var platform: String,var isAdmin: Boolean,var name: String,var clientSimplePass: String){
    fun showId() = print("Id is $id, ")
    fun showPlatformType() = print("Platform is $platform, ")
    fun showName() = print("Name is $name, ")
    fun isPasswordCorrect () {
        if(clientSimplePass != "123") println("Error") else println("password is correct")

    }
    open class AndroidClient
        (id: Int, platform: String, isAdmin: Boolean, name: String, clientSimplePass: String, var adminPass: String):
        User(id = 2, platform = "iOS", false, "Client","1234")

    class Admin():AndroidClient(id = 3, platform = "Android", true, "Vasya","","12345")

    class Casual():AndroidClient(4,"iOS",false,"John","1111","")


}


fun main() {val User = User(id = 1, platform = "Android", isAdmin = false, name = "User", clientSimplePass = "123")
    print("User"); User.showId()
    print("User"); User.showPlatformType()
    print("User"); User.showName()
    println("")

    User.isPasswordCorrect()


}