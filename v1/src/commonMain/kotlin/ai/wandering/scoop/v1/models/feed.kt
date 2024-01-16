@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Feed(
    val modules: List<ai.wandering.scoop.v1.models.FeedModule> = emptyList(),
    val metadata: ai.wandering.scoop.v1.models.FeedMetadata? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Feed = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Feed> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Feed> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Feed by lazy { ai.wandering.scoop.v1.models.Feed() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Feed = ai.wandering.scoop.v1.models.Feed.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Feed> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Feed, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "modules",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.FeedModule>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.FeedModule.Companion)),
                        jsonName = "modules",
                        value = ai.wandering.scoop.v1.models.Feed::modules
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.FeedMetadata.Companion),
                        jsonName = "metadata",
                        value = ai.wandering.scoop.v1.models.Feed::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Feed",
                messageClass = ai.wandering.scoop.v1.models.Feed::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetFeedArgs(
    val count: Int = 0,
    val direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0),
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetFeedArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetFeedArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetFeedArgs by lazy { ai.wandering.scoop.v1.models.GetFeedArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetFeedArgs = ai.wandering.scoop.v1.models.GetFeedArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetFeedArgs, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direction",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = ai.wandering.scoop.v1.models.CursorDirection.Companion),
                        jsonName = "direction",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::direction
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.GetFeedArgs::cursor
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetFeedArgs",
                messageClass = ai.wandering.scoop.v1.models.GetFeedArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetFeedResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.GetFeedSuccessResponse) : Type<ai.wandering.scoop.v1.models.GetFeedSuccessResponse>(success)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val success: ai.wandering.scoop.v1.models.GetFeedSuccessResponse?
        get() = (type as? Type.Success)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetFeedResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetFeedResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetFeedResponse by lazy { ai.wandering.scoop.v1.models.GetFeedResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetFeedResponse = ai.wandering.scoop.v1.models.GetFeedResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetFeedResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetFeedSuccessResponse.Companion),
                        oneofMember = true,
                        jsonName = "success",
                        value = ai.wandering.scoop.v1.models.GetFeedResponse::success
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
                        value = ai.wandering.scoop.v1.models.GetFeedResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetFeedResponse",
                messageClass = ai.wandering.scoop.v1.models.GetFeedResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetFeedSuccessResponse(
    val feed: ai.wandering.scoop.v1.models.Feed? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetFeedSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetFeedSuccessResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetFeedSuccessResponse by lazy { ai.wandering.scoop.v1.models.GetFeedSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetFeedSuccessResponse = ai.wandering.scoop.v1.models.GetFeedSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetFeedSuccessResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetFeedSuccessResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "feed",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Feed.Companion),
                        jsonName = "feed",
                        value = ai.wandering.scoop.v1.models.GetFeedSuccessResponse::feed
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetFeedSuccessResponse",
                messageClass = ai.wandering.scoop.v1.models.GetFeedSuccessResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForFeed")
public fun Feed?.orDefault(): ai.wandering.scoop.v1.models.Feed = this ?: Feed.defaultInstance

private fun Feed.protoMergeImpl(plus: pbandk.Message?): Feed = (plus as? Feed)?.let {
    it.copy(
        modules = modules + plus.modules,
        metadata = metadata?.plus(plus.metadata) ?: plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Feed.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Feed {
    var modules: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.FeedModule>? = null
    var metadata: ai.wandering.scoop.v1.models.FeedMetadata? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> modules = (modules ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.FeedModule> }
            2 -> metadata = _fieldValue as ai.wandering.scoop.v1.models.FeedMetadata
        }
    }

    return Feed(pbandk.ListWithSize.Builder.fixed(modules), metadata, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFeedArgs")
public fun GetFeedArgs?.orDefault(): ai.wandering.scoop.v1.models.GetFeedArgs = this ?: GetFeedArgs.defaultInstance

private fun GetFeedArgs.protoMergeImpl(plus: pbandk.Message?): GetFeedArgs = (plus as? GetFeedArgs)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFeedArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFeedArgs {
    var count = 0
    var direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0)
    var cursor: ai.wandering.scoop.v1.models.Cursor? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> count = _fieldValue as Int
            2 -> direction = _fieldValue as ai.wandering.scoop.v1.models.CursorDirection
            3 -> cursor = _fieldValue as ai.wandering.scoop.v1.models.Cursor
        }
    }

    return GetFeedArgs(count, direction, cursor, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFeedResponse")
public fun GetFeedResponse?.orDefault(): ai.wandering.scoop.v1.models.GetFeedResponse = this ?: GetFeedResponse.defaultInstance

private fun GetFeedResponse.protoMergeImpl(plus: pbandk.Message?): GetFeedResponse = (plus as? GetFeedResponse)?.let {
    it.copy(
        type = when {
            type is GetFeedResponse.Type.Success && plus.type is GetFeedResponse.Type.Success ->
                GetFeedResponse.Type.Success(type.value + plus.type.value)
            type is GetFeedResponse.Type.Error && plus.type is GetFeedResponse.Type.Error ->
                GetFeedResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFeedResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFeedResponse {
    var type: GetFeedResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = GetFeedResponse.Type.Success(_fieldValue as ai.wandering.scoop.v1.models.GetFeedSuccessResponse)
            2 -> type = GetFeedResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return GetFeedResponse(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetFeedSuccessResponse")
public fun GetFeedSuccessResponse?.orDefault(): ai.wandering.scoop.v1.models.GetFeedSuccessResponse = this ?: GetFeedSuccessResponse.defaultInstance

private fun GetFeedSuccessResponse.protoMergeImpl(plus: pbandk.Message?): GetFeedSuccessResponse = (plus as? GetFeedSuccessResponse)?.let {
    it.copy(
        feed = feed?.plus(plus.feed) ?: plus.feed,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetFeedSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetFeedSuccessResponse {
    var feed: ai.wandering.scoop.v1.models.Feed? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> feed = _fieldValue as ai.wandering.scoop.v1.models.Feed
        }
    }

    return GetFeedSuccessResponse(feed, unknownFields)
}
