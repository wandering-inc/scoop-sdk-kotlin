package ai.wandering.scoop.v1

import ai.wandering.scoop.v1.http.GetFeed
import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.http.GetPublications
import ai.wandering.scoop.v1.http.GetUSTopStories
import ai.wandering.scoop.v1.impl.RealScoopClient
import io.ktor.client.*

interface ScoopClient {
    val getGlobalTopStories: GetGlobalTopStories
    val getUSTopStories: GetUSTopStories
    val getPublications: GetPublications
    val getFeed: GetFeed

    companion object {
        operator fun invoke(httpClient: HttpClient, bearerToken: String): ScoopClient = RealScoopClient(httpClient, bearerToken)
    }
}


