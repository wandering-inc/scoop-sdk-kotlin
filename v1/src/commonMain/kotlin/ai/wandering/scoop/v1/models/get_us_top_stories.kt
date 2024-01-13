@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class GetUSTopStoriesArgs(
    val count: Int = 0,
    val direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0),
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetUSTopStoriesArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetUSTopStoriesArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetUSTopStoriesArgs by lazy { ai.wandering.scoop.v1.models.GetUSTopStoriesArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetUSTopStoriesArgs = ai.wandering.scoop.v1.models.GetUSTopStoriesArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesArgs, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesArgs::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direction",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = ai.wandering.scoop.v1.models.CursorDirection.Companion),
                        jsonName = "direction",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesArgs::direction
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesArgs::cursor
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetUSTopStoriesArgs",
                messageClass = ai.wandering.scoop.v1.models.GetUSTopStoriesArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetUSTopStoriesData(
    val scoop: ai.wandering.scoop.v1.models.Scoop? = null,
    val metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetUSTopStoriesData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetUSTopStoriesData> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetUSTopStoriesData by lazy { ai.wandering.scoop.v1.models.GetUSTopStoriesData() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetUSTopStoriesData = ai.wandering.scoop.v1.models.GetUSTopStoriesData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesData> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesData, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "scoop",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Scoop.Companion),
                        jsonName = "scoop",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesData::scoop
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.CursorMetadata.Companion),
                        jsonName = "metadata",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesData::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetUSTopStoriesData",
                messageClass = ai.wandering.scoop.v1.models.GetUSTopStoriesData::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetUSTopStoriesError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetUSTopStoriesError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetUSTopStoriesError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetUSTopStoriesError by lazy { ai.wandering.scoop.v1.models.GetUSTopStoriesError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetUSTopStoriesError = ai.wandering.scoop.v1.models.GetUSTopStoriesError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetUSTopStoriesError",
                messageClass = ai.wandering.scoop.v1.models.GetUSTopStoriesError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetUSTopStoriesResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Data(data: ai.wandering.scoop.v1.models.GetUSTopStoriesData) : Type<ai.wandering.scoop.v1.models.GetUSTopStoriesData>(data)
        public class Error(error: ai.wandering.scoop.v1.models.GetUSTopStoriesError) : Type<ai.wandering.scoop.v1.models.GetUSTopStoriesError>(error)
    }

    val data: ai.wandering.scoop.v1.models.GetUSTopStoriesData?
        get() = (type as? Type.Data)?.value
    val error: ai.wandering.scoop.v1.models.GetUSTopStoriesError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetUSTopStoriesResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetUSTopStoriesResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetUSTopStoriesResponse by lazy { ai.wandering.scoop.v1.models.GetUSTopStoriesResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetUSTopStoriesResponse = ai.wandering.scoop.v1.models.GetUSTopStoriesResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetUSTopStoriesResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetUSTopStoriesData.Companion),
                        oneofMember = true,
                        jsonName = "data",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesResponse::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetUSTopStoriesError.Companion),
                        oneofMember = true,
                        jsonName = "error",
                        value = ai.wandering.scoop.v1.models.GetUSTopStoriesResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetUSTopStoriesResponse",
                messageClass = ai.wandering.scoop.v1.models.GetUSTopStoriesResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetUSTopStoriesArgs")
public fun GetUSTopStoriesArgs?.orDefault(): ai.wandering.scoop.v1.models.GetUSTopStoriesArgs = this ?: GetUSTopStoriesArgs.defaultInstance

private fun GetUSTopStoriesArgs.protoMergeImpl(plus: pbandk.Message?): GetUSTopStoriesArgs = (plus as? GetUSTopStoriesArgs)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetUSTopStoriesArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetUSTopStoriesArgs {
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

    return GetUSTopStoriesArgs(count, direction, cursor, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetUSTopStoriesData")
public fun GetUSTopStoriesData?.orDefault(): ai.wandering.scoop.v1.models.GetUSTopStoriesData = this ?: GetUSTopStoriesData.defaultInstance

private fun GetUSTopStoriesData.protoMergeImpl(plus: pbandk.Message?): GetUSTopStoriesData = (plus as? GetUSTopStoriesData)?.let {
    it.copy(
        scoop = scoop?.plus(plus.scoop) ?: plus.scoop,
        metadata = metadata?.plus(plus.metadata) ?: plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetUSTopStoriesData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetUSTopStoriesData {
    var scoop: ai.wandering.scoop.v1.models.Scoop? = null
    var metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> scoop = _fieldValue as ai.wandering.scoop.v1.models.Scoop
            2 -> metadata = _fieldValue as ai.wandering.scoop.v1.models.CursorMetadata
        }
    }

    return GetUSTopStoriesData(scoop, metadata, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetUSTopStoriesError")
public fun GetUSTopStoriesError?.orDefault(): ai.wandering.scoop.v1.models.GetUSTopStoriesError = this ?: GetUSTopStoriesError.defaultInstance

private fun GetUSTopStoriesError.protoMergeImpl(plus: pbandk.Message?): GetUSTopStoriesError = (plus as? GetUSTopStoriesError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetUSTopStoriesError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetUSTopStoriesError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return GetUSTopStoriesError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetUSTopStoriesResponse")
public fun GetUSTopStoriesResponse?.orDefault(): ai.wandering.scoop.v1.models.GetUSTopStoriesResponse = this ?: GetUSTopStoriesResponse.defaultInstance

private fun GetUSTopStoriesResponse.protoMergeImpl(plus: pbandk.Message?): GetUSTopStoriesResponse = (plus as? GetUSTopStoriesResponse)?.let {
    it.copy(
        type = when {
            type is GetUSTopStoriesResponse.Type.Data && plus.type is GetUSTopStoriesResponse.Type.Data ->
                GetUSTopStoriesResponse.Type.Data(type.value + plus.type.value)
            type is GetUSTopStoriesResponse.Type.Error && plus.type is GetUSTopStoriesResponse.Type.Error ->
                GetUSTopStoriesResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetUSTopStoriesResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetUSTopStoriesResponse {
    var type: GetUSTopStoriesResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = GetUSTopStoriesResponse.Type.Data(_fieldValue as ai.wandering.scoop.v1.models.GetUSTopStoriesData)
            2 -> type = GetUSTopStoriesResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.GetUSTopStoriesError)
        }
    }

    return GetUSTopStoriesResponse(type, unknownFields)
}
