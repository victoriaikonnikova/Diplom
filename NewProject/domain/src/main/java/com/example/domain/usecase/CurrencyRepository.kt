package com.example.domain.usecase

import com.example.domain.models.CurrencyModelDto
import io.reactivex.rxjava3.core.Flowable

interface CurrencyRepository {

    fun getCurrency(): Flowable<List<CurrencyModelDto>>
}