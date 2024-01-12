package ai.wandering.scoop.v1.http

import ai.wandering.scoop.v1.models.Publication

interface GetPublications {
    operator fun invoke(): List<Publication>
}