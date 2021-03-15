//итак, дз по ООП. Описать на котлине:
//
//- класс “пользователь”
//- класс “андроидклиент” наследуется от пользователя
//- класс “админ” наследуется от андроид клиент
//- класс “обычный” наследуется от андроид клиент
//
//- поля id: long, platform: string, isAdmin: bool, name: string, adminPass: string, clientSimplePass : string
// - распределить по классам в зависимости от инкапсуляции и абстрагирования,
// постараться чтобы они не повторялись без нужды (соблюдаем принцип kiss)
//- должны существовать методы вывода id, типа платформы, имени +
// бонус создать метод isPasswordCorrect(value: String): Boolean, метод который принимает в себя любую строку,
// проверяет пароль на корректность и выдает булевское значение true/false
//- в main нужно завести админа и обычного пользователя




open class User(var id: Int, var platform: String,var isAdmin: Boolean,var name: String,var clientSimplePass: String){
    fun showId() = print("Id is $id, ")
    fun showPlatformType() = print("Platform is $platform, ")
    fun showName() = print("Name is $name, ")
    fun isPasswordCorrect(value: String): Boolean {
        return when {
            clientSimplePass != "123" -> false
            else -> true
        }
        }
//    fun isPasswordCorrect () {
//        if(clientSimplePass != "123") println("Error") else println("password is correct")

    }
    open class AndroidClient
        (id: Int, platform: String, isAdmin: Boolean, name: String, clientSimplePass: String, var adminPass: String):
        User(id = 2, platform = "iOS", false, "Client","1234")

    class Admin():AndroidClient(id = 3, platform = "Android", true, "Vasya","","12345")

    class Casual():AndroidClient(4,"iOS",false,"John","1111","")



fun main() {val User = User(id = 1, platform = "Android", isAdmin = false, name = "User", clientSimplePass = "123")
    print("User"); User.showId()
    print("User"); User.showPlatformType()
    print("User"); User.showName()
    println("")

    println(User.isPasswordCorrect("12345"))


}