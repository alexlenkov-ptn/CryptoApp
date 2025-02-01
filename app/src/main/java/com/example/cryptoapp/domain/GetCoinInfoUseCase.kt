package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData

class GetCoinInfoUseCase(
    private val repository: CoinRepository,
) {
    operator fun invoke(fromSymbol: String): LiveData<CoinInfoEntity> = repository.getCoinInfo(fromSymbol)
}