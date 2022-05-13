


interface UserRepository {
    fun saveUserParam(userParam: UserNameParam): Boolean

    fun getUserName(): UserName
}