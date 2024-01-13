package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.GetPublicationsArgs
import ai.wandering.scoop.v1.models.GetPublicationsResponse

interface GetPublications {
    suspend operator fun invoke(args: GetPublicationsArgs): GetPublicationsResponse
}