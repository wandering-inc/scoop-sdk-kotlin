package ai.wandering.scoop.v1.impl

import ai.wandering.scoop.v1.ScoopClient
import ai.wandering.scoop.v1.http.GetGlobalTopStories
import ai.wandering.scoop.v1.http.GetPublications
import ai.wandering.scoop.v1.http.GetUSTopStories
import ai.wandering.scoop.v1.http.impl.RealGetGlobalTopStories
import ai.wandering.scoop.v1.http.impl.RealGetPublications
import ai.wandering.scoop.v1.http.impl.RealGetUSTopStories
import io.ktor.client.*

internal class RealScoopClient(httpClient: HttpClient, bearerToken: String) : ScoopClient {
    override val getGlobalTopStories: GetGlobalTopStories = RealGetGlobalTopStories(httpClient)
    override val getUSTopStories: GetUSTopStories = RealGetUSTopStories(httpClient)
    override val getPublications: GetPublications = RealGetPublications(httpClient)
}