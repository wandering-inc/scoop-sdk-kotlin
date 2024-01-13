@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class GetGlobalTopStoriesArgs(
    val count: Int = 0,
    val direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0),
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs by lazy { ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs = ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direction",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = ai.wandering.scoop.v1.models.CursorDirection.Companion),
                        jsonName = "direction",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs::direction
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs::cursor
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs",
                messageClass = ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetGlobalTopStoriesData(
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    val metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetGlobalTopStoriesData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetGlobalTopStoriesData> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetGlobalTopStoriesData by lazy { ai.wandering.scoop.v1.models.GetGlobalTopStoriesData() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetGlobalTopStoriesData = ai.wandering.scoop.v1.models.GetGlobalTopStoriesData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesData> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesData, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesData::scoop
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.CursorMetadata.Companion),
                        jsonName = "metadata",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesData::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetGlobalTopStoriesData",
                messageClass = ai.wandering.scoop.v1.models.GetGlobalTopStoriesData::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetGlobalTopStoriesError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetGlobalTopStoriesError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetGlobalTopStoriesError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetGlobalTopStoriesError by lazy { ai.wandering.scoop.v1.models.GetGlobalTopStoriesError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetGlobalTopStoriesError = ai.wandering.scoop.v1.models.GetGlobalTopStoriesError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetGlobalTopStoriesError",
                messageClass = ai.wandering.scoop.v1.models.GetGlobalTopStoriesError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetGlobalTopStoriesResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Data(data: ai.wandering.scoop.v1.models.GetGlobalTopStoriesData) : Type<ai.wandering.scoop.v1.models.GetGlobalTopStoriesData>(data)
        public class Error(error: ai.wandering.scoop.v1.models.GetGlobalTopStoriesError) : Type<ai.wandering.scoop.v1.models.GetGlobalTopStoriesError>(error)
    }

    val data: ai.wandering.scoop.v1.models.GetGlobalTopStoriesData?
        get() = (type as? Type.Data)?.value
    val error: ai.wandering.scoop.v1.models.GetGlobalTopStoriesError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse by lazy { ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse = ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetGlobalTopStoriesData.Companion),
                        oneofMember = true,
                        jsonName = "data",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetGlobalTopStoriesError.Companion),
                        oneofMember = true,
                        jsonName = "error",
                        value = ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse",
                messageClass = ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetGlobalTopStoriesArgs")
public fun GetGlobalTopStoriesArgs?.orDefault(): ai.wandering.scoop.v1.models.GetGlobalTopStoriesArgs = this ?: GetGlobalTopStoriesArgs.defaultInstance

private fun GetGlobalTopStoriesArgs.protoMergeImpl(plus: pbandk.Message?): GetGlobalTopStoriesArgs = (plus as? GetGlobalTopStoriesArgs)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetGlobalTopStoriesArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetGlobalTopStoriesArgs {
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

    return GetGlobalTopStoriesArgs(count, direction, cursor, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetGlobalTopStoriesData")
public fun GetGlobalTopStoriesData?.orDefault(): ai.wandering.scoop.v1.models.GetGlobalTopStoriesData = this ?: GetGlobalTopStoriesData.defaultInstance

private fun GetGlobalTopStoriesData.protoMergeImpl(plus: pbandk.Message?): GetGlobalTopStoriesData = (plus as? GetGlobalTopStoriesData)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        metadata = metadata?.plus(plus.metadata) ?: plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetGlobalTopStoriesData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetGlobalTopStoriesData {
    var scoop: ai.wandering.scoop.v1.models.Scoop? = null
    var metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> scoop = _fieldValue as ai.wandering.scoop.v1.models.Scoop
            2 -> metadata = _fieldValue as ai.wandering.scoop.v1.models.CursorMetadata
        }
    }

    return GetGlobalTopStoriesData(scoop, metadata, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetGlobalTopStoriesError")
public fun GetGlobalTopStoriesError?.orDefault(): ai.wandering.scoop.v1.models.GetGlobalTopStoriesError = this ?: GetGlobalTopStoriesError.defaultInstance

private fun GetGlobalTopStoriesError.protoMergeImpl(plus: pbandk.Message?): GetGlobalTopStoriesError = (plus as? GetGlobalTopStoriesError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetGlobalTopStoriesError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetGlobalTopStoriesError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return GetGlobalTopStoriesError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetGlobalTopStoriesResponse")
public fun GetGlobalTopStoriesResponse?.orDefault(): ai.wandering.scoop.v1.models.GetGlobalTopStoriesResponse = this ?: GetGlobalTopStoriesResponse.defaultInstance

private fun GetGlobalTopStoriesResponse.protoMergeImpl(plus: pbandk.Message?): GetGlobalTopStoriesResponse = (plus as? GetGlobalTopStoriesResponse)?.let {
    it.copy(
        type = when {
            type is GetGlobalTopStoriesResponse.Type.Data && plus.type is GetGlobalTopStoriesResponse.Type.Data ->
                GetGlobalTopStoriesResponse.Type.Data(type.value + plus.type.value)
            type is GetGlobalTopStoriesResponse.Type.Error && plus.type is GetGlobalTopStoriesResponse.Type.Error ->
                GetGlobalTopStoriesResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetGlobalTopStoriesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetGlobalTopStoriesResponse {
    var type: GetGlobalTopStoriesResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = GetGlobalTopStoriesResponse.Type.Data(_fieldValue as ai.wandering.scoop.v1.models.GetGlobalTopStoriesData)
            2 -> type = GetGlobalTopStoriesResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.GetGlobalTopStoriesError)
        }
    }

    return GetGlobalTopStoriesResponse(type, unknownFields)
}
