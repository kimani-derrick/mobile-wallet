/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.data.source.remote

import org.mifospay.core.model.domain.Account
import org.mifospay.core.network.ApiService
import javax.inject.Inject

class AccountRemoteDataSource @Inject constructor(
    private val apiService: ApiService,
) {

    suspend fun fetchAccount(clientId: Long): Account {
        return apiService.getAccountDetails(clientId)
    }
}
