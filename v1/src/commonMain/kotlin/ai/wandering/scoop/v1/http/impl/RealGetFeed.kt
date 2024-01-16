package ai.wandering.scoop.v1.http.impl

import ai.wandering.scoop.v1.http.GetFeed
import ai.wandering.scoop.v1.models.GetFeedArgs
import ai.wandering.scoop.v1.models.GetFeedResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

internal class RealGetFeed(private val client: HttpClient, private val bearerToken: String) : GetFeed {

    override suspend fun invoke(args: GetFeedArgs): GetFeedResponse {
        return client.post(ENDPOINT) {
            contentType(ContentType.Application.Json)
            headers {
                "Authorization" to bearerToken
            }
            setBody(args)
        }.body<GetFeedResponse>()
    }

    companion object {
        private const val ENDPOINT = "https://api.scoop.wandering.ai/v1/stories/top/global"
    }
}