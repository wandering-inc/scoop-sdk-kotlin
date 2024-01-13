package ai.wandering.scoop.v1.http.impl

import ai.wandering.scoop.v1.http.GetPublications
import ai.wandering.scoop.v1.models.GetPublicationsArgs
import ai.wandering.scoop.v1.models.GetPublicationsResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

internal class RealGetPublications(private val client: HttpClient, private val bearerToken: String) : GetPublications {
    override suspend fun invoke(args: GetPublicationsArgs): GetPublicationsResponse {
        return client.post(ENDPOINT) {
            contentType(ContentType.Application.Json)
            headers {
                "Authorization" to bearerToken
            }
            setBody(args)
        }.body<GetPublicationsResponse>()
    }

    companion object {
        private const val ENDPOINT = "https://api.scoop.wandering.ai/v1/publications"
    }
}