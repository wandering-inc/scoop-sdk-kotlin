package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.GetFeedArgs
import ai.wandering.scoop.v1.models.GetFeedResponse


interface GetFeed {
    suspend operator fun invoke(args: GetFeedArgs): GetFeedResponse
}

