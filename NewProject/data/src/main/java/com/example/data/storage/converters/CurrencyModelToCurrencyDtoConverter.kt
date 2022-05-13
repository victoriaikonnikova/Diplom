package com.example.data.storage.converters

import com.example.data.storage.models.CurrencyModel
import com.example.domain.models.CurrencyModelDto
import com.example.newproject.domain.base.Converter

class CurrencyModelToCurrencyDtoConverter : Converter<CurrencyModel, CurrencyModelDto> {

    override fun invoke(param: CurrencyModel): CurrencyModelDto {
        return CurrencyModelDto(
            param.ccy ?: "",
            param.baseCcy ?: "",
            param.buy ?: "",
            param.sale ?: "",
        )
    }
}