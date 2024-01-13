package ai.wandering.scoop.v1.http.impl

import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs
import ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

internal class RealGetGlobalTopStories(private val client: HttpClient, private val bearerToken: String) : GetGlobalTopStories {
    override suspend fun invoke(args: GetGlobalTopStoriesArgs): GetGlobalTopStoriesResponse {
        return client.post(ENDPOINT) {
            contentType(ContentType.Application.Json)
            headers {
                "Authorization" to bearerToken
            }
            setBody(args)
        }.body<GetGlobalTopStoriesResponse>()
    }

    companion object {
        private const val ENDPOINT = "https://api.scoop.wandering.ai/v1/stories/top/global"
    }
}