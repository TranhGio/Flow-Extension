package com.davie

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun emitInt(): Flow<Int> {
    return flow {
        for (i in 1..3) {
            delay(1000)
            emit(i)
        }
    }
}

