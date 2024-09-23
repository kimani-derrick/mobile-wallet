/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.data.domain.usecase.account

import org.mifospay.core.data.base.UseCase
import org.mifospay.core.data.repository.AccountRepository
import org.mifospay.core.model.domain.Account
import javax.inject.Inject

class FetchAccount @Inject constructor(
    private val accountRepository: AccountRepository,
) : UseCase<FetchAccount.RequestValues, FetchAccount.ResponseValue>() {

    override suspend fun executeUseCase(requestValues: RequestValues): ResponseValue {
        val account = accountRepository.getAccount(requestValues.clientId)
        return ResponseValue(account)
    }

    data class RequestValues(val clientId: Long) : UseCase.RequestValues
    data class ResponseValue(val account: Account) : UseCase.ResponseValue
}
