package com.example.domain.usecase

import com.example.newproject.domain.models.UserName
import com.example.newproject.domain.models.UserNameParam
import com.example.newproject.domain.repository.UserRepository
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

//class TestRepository : UserRepository{
//    override fun saveUserParam(userParam: UserNameParam): Boolean {
//        TODO("Not yet implemented")
//    }
//
//    override fun getUserName(): UserName {
//        return UserName (firstName = "test first name", secondName = "test second name")
//    }
//}


class GetUserNameUseCaseTest {

    val userRepository = mock<UserRepository>()


    @Test
    fun `should return the same data as in the repository` () {

        val testUserName = UserName(firstName = "test first name", secondName = "test second name")

        Mockito.`when`(userRepository.getUserName()).thenReturn(testUserName)

        val useCase = GetUserNameUseCase(userRepository)
        val actualResult = useCase.execute()
        val expectedResult = UserName(
            firstName = "test first name", secondName = "test second name"
        )

        Assertions.assertEquals(expectedResult, actualResult)

    }
}