package com.example.newproject.domain.base

interface Converter<INPUT, OUTOUT> {

    fun invoke (param: INPUT): OUTOUT
}