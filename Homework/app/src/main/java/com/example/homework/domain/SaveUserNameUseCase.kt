

import com.example.newproject.data.UserRepositoryImpl
import com.example.newproject.domain.base.UseCase
import com.example.newproject.domain.models.UserNameParam
import com.example.newproject.domain.repository.UserRepository

class SaveUserNameUseCase (private val userRepository: UserRepository) : UseCase<UserNameParam, Boolean> {

    override fun execute(param: UserNameParam?): Boolean {
        return userRepository.saveUserParam(param!!)
    }
}