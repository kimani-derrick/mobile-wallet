/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.data.repository

import org.mifospay.core.data.source.remote.AccountRemoteDataSource
import org.mifospay.core.model.domain.Account
import javax.inject.Inject

class AccountRepository @Inject constructor(
    private val accountRemoteDataSource: AccountRemoteDataSource,
) {

    suspend fun getAccount(clientId: Long): Account {
        return accountRemoteDataSource.fetchAccount(clientId)
    }
}
