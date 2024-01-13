package ai.wandering.scoop.v1.http.impl

import ai.wandering.scoop.v1.http.GetUSTopStories
import ai.wandering.scoop.v1.models.GetUSTopStoriesArgs
import ai.wandering.scoop.v1.models.GetUSTopStoriesResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

internal class RealGetUSTopStories(private val client: HttpClient, private val bearerToken: String) : GetUSTopStories {
    override suspend fun invoke(args: GetUSTopStoriesArgs): GetUSTopStoriesResponse {
        return client.post(ENDPOINT) {
            contentType(ContentType.Application.Json)
            headers {
                "Authorization" to bearerToken
            }
            setBody(args)
        }.body<GetUSTopStoriesResponse>()
    }

    companion object {
        private const val ENDPOINT = "https://api.scoop.wandering.ai/v1/stories/top/us"
    }
}