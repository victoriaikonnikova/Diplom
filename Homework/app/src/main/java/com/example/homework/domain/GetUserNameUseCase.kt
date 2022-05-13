


class GetUserNameUseCase (private val userRepository: UserRepository): UseCase<Unit, UserName> {

    override fun execute(param: Unit?): UserName {
        return userRepository.getUserName()
    }
}