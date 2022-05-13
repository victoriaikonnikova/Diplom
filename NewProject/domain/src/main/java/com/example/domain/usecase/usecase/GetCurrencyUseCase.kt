package com.example.domain.usecase.usecase

import com.example.domain.models.CurrencyModelDto
import com.example.domain.usecase.CurrencyRepository
import com.example.newproject.domain.base.UseCase
import io.reactivex.rxjava3.core.Flowable

class GetCurrencyUseCase(private val currencyRepository: CurrencyRepository) :
    UseCase<Unit, Flowable<List<CurrencyModelDto>>> {

    override fun execute (param: Unit?): Flowable<List<CurrencyModelDto>> {
        return currencyRepository.getCurrency()
    }
}