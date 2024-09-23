/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.network

import org.mifospay.core.model.domain.Account
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("clients/{clientId}/accounts")
    suspend fun getAccountDetails(@Path("clientId") clientId: Long): Account
}
