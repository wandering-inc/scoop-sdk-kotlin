@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class CreateApiTokenArgs(
    val userId: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateApiTokenArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateApiTokenArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateApiTokenArgs by lazy { ai.wandering.scoop.v1.models.CreateApiTokenArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateApiTokenArgs = ai.wandering.scoop.v1.models.CreateApiTokenArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenArgs, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "userId",
                        value = ai.wandering.scoop.v1.models.CreateApiTokenArgs::userId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.CreateApiTokenArgs::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateApiTokenArgs",
                messageClass = ai.wandering.scoop.v1.models.CreateApiTokenArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CreateApiTokenResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Details(details: ai.wandering.scoop.v1.models.ApiTokenDetails) : Type<ai.wandering.scoop.v1.models.ApiTokenDetails>(details)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val details: ai.wandering.scoop.v1.models.ApiTokenDetails?
        get() = (type as? Type.Details)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateApiTokenResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateApiTokenResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateApiTokenResponse by lazy { ai.wandering.scoop.v1.models.CreateApiTokenResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateApiTokenResponse = ai.wandering.scoop.v1.models.CreateApiTokenResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateApiTokenResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "details",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ApiTokenDetails.Companion),
                        oneofMember = true,
                        jsonName = "details",
                        value = ai.wandering.scoop.v1.models.CreateApiTokenResponse::details
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
                        value = ai.wandering.scoop.v1.models.CreateApiTokenResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateApiTokenResponse",
                messageClass = ai.wandering.scoop.v1.models.CreateApiTokenResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateApiTokenArgs")
public fun CreateApiTokenArgs?.orDefault(): ai.wandering.scoop.v1.models.CreateApiTokenArgs = this ?: CreateApiTokenArgs.defaultInstance

private fun CreateApiTokenArgs.protoMergeImpl(plus: pbandk.Message?): CreateApiTokenArgs = (plus as? CreateApiTokenArgs)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateApiTokenArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateApiTokenArgs {
    var userId = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> userId = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return CreateApiTokenArgs(userId, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateApiTokenResponse")
public fun CreateApiTokenResponse?.orDefault(): ai.wandering.scoop.v1.models.CreateApiTokenResponse = this ?: CreateApiTokenResponse.defaultInstance

private fun CreateApiTokenResponse.protoMergeImpl(plus: pbandk.Message?): CreateApiTokenResponse = (plus as? CreateApiTokenResponse)?.let {
    it.copy(
        type = when {
            type is CreateApiTokenResponse.Type.Details && plus.type is CreateApiTokenResponse.Type.Details ->
                CreateApiTokenResponse.Type.Details(type.value + plus.type.value)
            type is CreateApiTokenResponse.Type.Error && plus.type is CreateApiTokenResponse.Type.Error ->
                CreateApiTokenResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateApiTokenResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateApiTokenResponse {
    var type: CreateApiTokenResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = CreateApiTokenResponse.Type.Details(_fieldValue as ai.wandering.scoop.v1.models.ApiTokenDetails)
            2 -> type = CreateApiTokenResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return CreateApiTokenResponse(type, unknownFields)
}
