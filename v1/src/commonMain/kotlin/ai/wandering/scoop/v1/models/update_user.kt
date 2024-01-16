@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class UpdateUserArgs(
    val userId: String = "",
    val tokenIds: List<String> = emptyList(),
    val followingTagsIds: List<String> = emptyList(),
    val followingPeopleIds: List<String> = emptyList(),
    val followingCompaniesIds: List<String> = emptyList(),
    val followingIndustriesIds: List<String> = emptyList(),
    val followingSkillsIds: List<String> = emptyList(),
    val followingLocationsIds: List<String> = emptyList(),
    val followingAuthorsIds: List<String> = emptyList(),
    val followingPublicationsIds: List<String> = emptyList(),
    val followingUsersIds: List<String> = emptyList(),
    val followersUsersIds: List<String> = emptyList(),
    val favoritesStoriesIds: List<String> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UpdateUserArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UpdateUserArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UpdateUserArgs by lazy { ai.wandering.scoop.v1.models.UpdateUserArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UpdateUserArgs = ai.wandering.scoop.v1.models.UpdateUserArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UpdateUserArgs, *>>(13)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "userId",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::userId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_ids",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "tokenIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::tokenIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_tags_ids",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingTagsIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingTagsIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_people_ids",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingPeopleIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingPeopleIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_companies_ids",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingCompaniesIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingCompaniesIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_industries_ids",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingIndustriesIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingIndustriesIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_skills_ids",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingSkillsIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingSkillsIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_locations_ids",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingLocationsIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingLocationsIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_authors_ids",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingAuthorsIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingAuthorsIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_publications_ids",
                        number = 10,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingPublicationsIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingPublicationsIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "following_users_ids",
                        number = 11,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followingUsersIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followingUsersIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "followers_users_ids",
                        number = 12,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "followersUsersIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::followersUsersIds
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "favorites_stories_ids",
                        number = 13,
                        type = pbandk.FieldDescriptor.Type.Repeated<String>(valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "favoritesStoriesIds",
                        value = ai.wandering.scoop.v1.models.UpdateUserArgs::favoritesStoriesIds
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UpdateUserArgs",
                messageClass = ai.wandering.scoop.v1.models.UpdateUserArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UpdateUserResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.UpdateUserSuccessResponse) : Type<ai.wandering.scoop.v1.models.UpdateUserSuccessResponse>(success)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val success: ai.wandering.scoop.v1.models.UpdateUserSuccessResponse?
        get() = (type as? Type.Success)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UpdateUserResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UpdateUserResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UpdateUserResponse by lazy { ai.wandering.scoop.v1.models.UpdateUserResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UpdateUserResponse = ai.wandering.scoop.v1.models.UpdateUserResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UpdateUserResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UpdateUserSuccessResponse.Companion),
                        oneofMember = true,
                        jsonName = "success",
                        value = ai.wandering.scoop.v1.models.UpdateUserResponse::success
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ScoopError.Companion),
                        oneofMember = true,
                        jsonName = "error",
                        value = ai.wandering.scoop.v1.models.UpdateUserResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UpdateUserResponse",
                messageClass = ai.wandering.scoop.v1.models.UpdateUserResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UpdateUserSuccessResponse(
    val user: ai.wandering.scoop.v1.models.User? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UpdateUserSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UpdateUserSuccessResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UpdateUserSuccessResponse by lazy { ai.wandering.scoop.v1.models.UpdateUserSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UpdateUserSuccessResponse = ai.wandering.scoop.v1.models.UpdateUserSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UpdateUserSuccessResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UpdateUserSuccessResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion),
                        jsonName = "user",
                        value = ai.wandering.scoop.v1.models.UpdateUserSuccessResponse::user
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UpdateUserSuccessResponse",
                messageClass = ai.wandering.scoop.v1.models.UpdateUserSuccessResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateUserArgs")
public fun UpdateUserArgs?.orDefault(): ai.wandering.scoop.v1.models.UpdateUserArgs = this ?: UpdateUserArgs.defaultInstance

private fun UpdateUserArgs.protoMergeImpl(plus: pbandk.Message?): UpdateUserArgs = (plus as? UpdateUserArgs)?.let {
    it.copy(
        tokenIds = tokenIds + plus.tokenIds,
        followingTagsIds = followingTagsIds + plus.followingTagsIds,
        followingPeopleIds = followingPeopleIds + plus.followingPeopleIds,
        followingCompaniesIds = followingCompaniesIds + plus.followingCompaniesIds,
        followingIndustriesIds = followingIndustriesIds + plus.followingIndustriesIds,
        followingSkillsIds = followingSkillsIds + plus.followingSkillsIds,
        followingLocationsIds = followingLocationsIds + plus.followingLocationsIds,
        followingAuthorsIds = followingAuthorsIds + plus.followingAuthorsIds,
        followingPublicationsIds = followingPublicationsIds + plus.followingPublicationsIds,
        followingUsersIds = followingUsersIds + plus.followingUsersIds,
        followersUsersIds = followersUsersIds + plus.followersUsersIds,
        favoritesStoriesIds = favoritesStoriesIds + plus.favoritesStoriesIds,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateUserArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateUserArgs {
    var userId = ""
    var tokenIds: pbandk.ListWithSize.Builder<String>? = null
    var followingTagsIds: pbandk.ListWithSize.Builder<String>? = null
    var followingPeopleIds: pbandk.ListWithSize.Builder<String>? = null
    var followingCompaniesIds: pbandk.ListWithSize.Builder<String>? = null
    var followingIndustriesIds: pbandk.ListWithSize.Builder<String>? = null
    var followingSkillsIds: pbandk.ListWithSize.Builder<String>? = null
    var followingLocationsIds: pbandk.ListWithSize.Builder<String>? = null
    var followingAuthorsIds: pbandk.ListWithSize.Builder<String>? = null
    var followingPublicationsIds: pbandk.ListWithSize.Builder<String>? = null
    var followingUsersIds: pbandk.ListWithSize.Builder<String>? = null
    var followersUsersIds: pbandk.ListWithSize.Builder<String>? = null
    var favoritesStoriesIds: pbandk.ListWithSize.Builder<String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> userId = _fieldValue as String
            2 -> tokenIds = (tokenIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            3 -> followingTagsIds = (followingTagsIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            4 -> followingPeopleIds = (followingPeopleIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            5 -> followingCompaniesIds = (followingCompaniesIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            6 -> followingIndustriesIds = (followingIndustriesIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            7 -> followingSkillsIds = (followingSkillsIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            8 -> followingLocationsIds = (followingLocationsIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            9 -> followingAuthorsIds = (followingAuthorsIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            10 -> followingPublicationsIds = (followingPublicationsIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            11 -> followingUsersIds = (followingUsersIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            12 -> followersUsersIds = (followersUsersIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
            13 -> favoritesStoriesIds = (favoritesStoriesIds ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<String> }
        }
    }

    return UpdateUserArgs(userId, pbandk.ListWithSize.Builder.fixed(tokenIds), pbandk.ListWithSize.Builder.fixed(followingTagsIds), pbandk.ListWithSize.Builder.fixed(followingPeopleIds),
        pbandk.ListWithSize.Builder.fixed(followingCompaniesIds), pbandk.ListWithSize.Builder.fixed(followingIndustriesIds), pbandk.ListWithSize.Builder.fixed(followingSkillsIds), pbandk.ListWithSize.Builder.fixed(followingLocationsIds),
        pbandk.ListWithSize.Builder.fixed(followingAuthorsIds), pbandk.ListWithSize.Builder.fixed(followingPublicationsIds), pbandk.ListWithSize.Builder.fixed(followingUsersIds), pbandk.ListWithSize.Builder.fixed(followersUsersIds),
        pbandk.ListWithSize.Builder.fixed(favoritesStoriesIds), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateUserResponse")
public fun UpdateUserResponse?.orDefault(): ai.wandering.scoop.v1.models.UpdateUserResponse = this ?: UpdateUserResponse.defaultInstance

private fun UpdateUserResponse.protoMergeImpl(plus: pbandk.Message?): UpdateUserResponse = (plus as? UpdateUserResponse)?.let {
    it.copy(
        type = when {
            type is UpdateUserResponse.Type.Success && plus.type is UpdateUserResponse.Type.Success ->
                UpdateUserResponse.Type.Success(type.value + plus.type.value)
            type is UpdateUserResponse.Type.Error && plus.type is UpdateUserResponse.Type.Error ->
                UpdateUserResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateUserResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateUserResponse {
    var type: UpdateUserResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = UpdateUserResponse.Type.Success(_fieldValue as ai.wandering.scoop.v1.models.UpdateUserSuccessResponse)
            2 -> type = UpdateUserResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return UpdateUserResponse(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUpdateUserSuccessResponse")
public fun UpdateUserSuccessResponse?.orDefault(): ai.wandering.scoop.v1.models.UpdateUserSuccessResponse = this ?: UpdateUserSuccessResponse.defaultInstance

private fun UpdateUserSuccessResponse.protoMergeImpl(plus: pbandk.Message?): UpdateUserSuccessResponse = (plus as? UpdateUserSuccessResponse)?.let {
    it.copy(
        user = user?.plus(plus.user) ?: plus.user,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UpdateUserSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UpdateUserSuccessResponse {
    var user: ai.wandering.scoop.v1.models.User? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> user = _fieldValue as ai.wandering.scoop.v1.models.User
        }
    }

    return UpdateUserSuccessResponse(user, unknownFields)
}
