package org.mifospay.core.data.repository.local

import org.mifospay.core.datastore.PreferencesHelper
import com.mifospay.core.model.domain.client.Client
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalRepository @Inject constructor(val preferencesHelper: PreferencesHelper) {

    val clientDetails: Client
        get() {
            val details = Client()
            details.name = preferencesHelper.fullName
            details.clientId = preferencesHelper.clientId
            details.externalId = preferencesHelper.clientVpa
            return details
        }

    fun saveClientData(client: Client) {
        preferencesHelper.saveFullName(client.name)
        preferencesHelper.clientId = client.clientId
        preferencesHelper.clientVpa = client.externalId
    }
}
