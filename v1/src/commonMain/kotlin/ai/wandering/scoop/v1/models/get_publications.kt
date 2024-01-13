@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class GetPublications(
    val count: Int = 0,
    val direction: ai.wandering.scoop.v1.models.CursorDirection = ai.wandering.scoop.v1.models.CursorDirection.fromValue(0),
    val cursor: ai.wandering.scoop.v1.models.Cursor? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetPublications = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublications> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetPublications> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetPublications by lazy { ai.wandering.scoop.v1.models.GetPublications() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetPublications = ai.wandering.scoop.v1.models.GetPublications.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublications> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetPublications, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "count",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "count",
                        value = ai.wandering.scoop.v1.models.GetPublications::count
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "direction",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Enum(enumCompanion = ai.wandering.scoop.v1.models.CursorDirection.Companion),
                        jsonName = "direction",
                        value = ai.wandering.scoop.v1.models.GetPublications::direction
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "cursor",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Cursor.Companion),
                        jsonName = "cursor",
                        value = ai.wandering.scoop.v1.models.GetPublications::cursor
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetPublications",
                messageClass = ai.wandering.scoop.v1.models.GetPublications::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetPublicationsData(
    val publications: List<ai.wandering.scoop.v1.models.Publication> = emptyList(),
    val metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetPublicationsData = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsData> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetPublicationsData> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetPublicationsData by lazy { ai.wandering.scoop.v1.models.GetPublicationsData() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetPublicationsData = ai.wandering.scoop.v1.models.GetPublicationsData.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsData> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetPublicationsData, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publications",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Publication>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Publication.Companion)),
                        jsonName = "publications",
                        value = ai.wandering.scoop.v1.models.GetPublicationsData::publications
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "metadata",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.CursorMetadata.Companion),
                        jsonName = "metadata",
                        value = ai.wandering.scoop.v1.models.GetPublicationsData::metadata
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetPublicationsData",
                messageClass = ai.wandering.scoop.v1.models.GetPublicationsData::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetPublicationsError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetPublicationsError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetPublicationsError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetPublicationsError by lazy { ai.wandering.scoop.v1.models.GetPublicationsError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetPublicationsError = ai.wandering.scoop.v1.models.GetPublicationsError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetPublicationsError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.GetPublicationsError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetPublicationsError",
                messageClass = ai.wandering.scoop.v1.models.GetPublicationsError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class GetPublicationsResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Data(data: ai.wandering.scoop.v1.models.GetPublicationsData) : Type<ai.wandering.scoop.v1.models.GetPublicationsData>(data)
        public class Error(error: ai.wandering.scoop.v1.models.GetPublicationsError) : Type<ai.wandering.scoop.v1.models.GetPublicationsError>(error)
    }

    val data: ai.wandering.scoop.v1.models.GetPublicationsData?
        get() = (type as? Type.Data)?.value
    val error: ai.wandering.scoop.v1.models.GetPublicationsError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.GetPublicationsResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.GetPublicationsResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.GetPublicationsResponse by lazy { ai.wandering.scoop.v1.models.GetPublicationsResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.GetPublicationsResponse = ai.wandering.scoop.v1.models.GetPublicationsResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.GetPublicationsResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.GetPublicationsResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetPublicationsData.Companion),
                        oneofMember = true,
                        jsonName = "data",
                        value = ai.wandering.scoop.v1.models.GetPublicationsResponse::data
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "error",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.GetPublicationsError.Companion),
                        oneofMember = true,
                        jsonName = "error",
                        value = ai.wandering.scoop.v1.models.GetPublicationsResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.GetPublicationsResponse",
                messageClass = ai.wandering.scoop.v1.models.GetPublicationsResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetPublications")
public fun GetPublications?.orDefault(): ai.wandering.scoop.v1.models.GetPublications = this ?: GetPublications.defaultInstance

private fun GetPublications.protoMergeImpl(plus: pbandk.Message?): GetPublications = (plus as? GetPublications)?.let {
    it.copy(
        cursor = cursor?.plus(plus.cursor) ?: plus.cursor,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetPublications.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetPublications {
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

    return GetPublications(count, direction, cursor, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetPublicationsData")
public fun GetPublicationsData?.orDefault(): ai.wandering.scoop.v1.models.GetPublicationsData = this ?: GetPublicationsData.defaultInstance

private fun GetPublicationsData.protoMergeImpl(plus: pbandk.Message?): GetPublicationsData = (plus as? GetPublicationsData)?.let {
    it.copy(
        publications = publications + plus.publications,
        metadata = metadata?.plus(plus.metadata) ?: plus.metadata,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetPublicationsData.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetPublicationsData {
    var publications: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Publication>? = null
    var metadata: ai.wandering.scoop.v1.models.CursorMetadata? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> publications = (publications ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Publication> }
            2 -> metadata = _fieldValue as ai.wandering.scoop.v1.models.CursorMetadata
        }
    }

    return GetPublicationsData(pbandk.ListWithSize.Builder.fixed(publications), metadata, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetPublicationsError")
public fun GetPublicationsError?.orDefault(): ai.wandering.scoop.v1.models.GetPublicationsError = this ?: GetPublicationsError.defaultInstance

private fun GetPublicationsError.protoMergeImpl(plus: pbandk.Message?): GetPublicationsError = (plus as? GetPublicationsError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetPublicationsError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetPublicationsError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return GetPublicationsError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForGetPublicationsResponse")
public fun GetPublicationsResponse?.orDefault(): ai.wandering.scoop.v1.models.GetPublicationsResponse = this ?: GetPublicationsResponse.defaultInstance

private fun GetPublicationsResponse.protoMergeImpl(plus: pbandk.Message?): GetPublicationsResponse = (plus as? GetPublicationsResponse)?.let {
    it.copy(
        type = when {
            type is GetPublicationsResponse.Type.Data && plus.type is GetPublicationsResponse.Type.Data ->
                GetPublicationsResponse.Type.Data(type.value + plus.type.value)
            type is GetPublicationsResponse.Type.Error && plus.type is GetPublicationsResponse.Type.Error ->
                GetPublicationsResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun GetPublicationsResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): GetPublicationsResponse {
    var type: GetPublicationsResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = GetPublicationsResponse.Type.Data(_fieldValue as ai.wandering.scoop.v1.models.GetPublicationsData)
            2 -> type = GetPublicationsResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.GetPublicationsError)
        }
    }

    return GetPublicationsResponse(type, unknownFields)
}
