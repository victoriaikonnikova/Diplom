package com.example.domain.usecase

import com.example.newproject.domain.base.UseCase
import com.example.newproject.domain.models.UserName
import com.example.newproject.domain.models.UserNameParam
import com.example.newproject.domain.repository.UserRepository
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.any
import org.mockito.kotlin.mock

class SaveUserNameUseCaseTest {

    val userRepository = mock<UserRepository>()

    @AfterEach
    fun tearDown () {
        Mockito.reset(userRepository)
    }

    @Test

    fun `should not save data if name was already saved` () {

        val testUserName = UserName (firstName = "test first name", secondName = "test second name")

        Mockito.`when`(userRepository.getUserName()).thenReturn(testUserName)

        val useCase = SaveUserNameUseCase (userRepository)

        val testParam = UserNameParam(name = "test first name")
        val actualResult = useCase.execute(testParam)
        val expectedResult = true
        Assertions.assertEquals(expectedResult, actualResult)

        Mockito.verify(userRepository, Mockito.never()).saveUserParam(userParam = any())

    }

    @Test
    fun `should return true if saving was successful`() {

        val testUserName = UserName (firstName = "test first name", secondName = "test second name")
        val testParam = UserNameParam(name = "new first name")
        val expectedResult = true

        Mockito.`when`(userRepository.getUserName()).thenReturn(testUserName)
        Mockito.`when`(userRepository.saveUserParam(testParam)).thenReturn(expectedResult)

        val useCase = SaveUserNameUseCase(userRepository)

        val actualResult = useCase.execute(testParam)
        Assertions.assertEquals(expectedResult, actualResult)

        Mockito.verify(userRepository, Mockito.times(1)).saveUserParam(userParam = testParam)

    }
}