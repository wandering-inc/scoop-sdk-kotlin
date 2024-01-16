@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class CreateUserArgs(
    val email: String = "",
    val name: String = "",
    val photoUrl: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateUserArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateUserArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateUserArgs by lazy { ai.wandering.scoop.v1.models.CreateUserArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateUserArgs = ai.wandering.scoop.v1.models.CreateUserArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateUserArgs, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "email",
                        value = ai.wandering.scoop.v1.models.CreateUserArgs::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.CreateUserArgs::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "photo_url",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "photoUrl",
                        value = ai.wandering.scoop.v1.models.CreateUserArgs::photoUrl
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateUserArgs",
                messageClass = ai.wandering.scoop.v1.models.CreateUserArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CreateUserResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.CreateUserSuccessResponse) : Type<ai.wandering.scoop.v1.models.CreateUserSuccessResponse>(success)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val success: ai.wandering.scoop.v1.models.CreateUserSuccessResponse?
        get() = (type as? Type.Success)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateUserResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateUserResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateUserResponse by lazy { ai.wandering.scoop.v1.models.CreateUserResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateUserResponse = ai.wandering.scoop.v1.models.CreateUserResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateUserResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.CreateUserSuccessResponse.Companion),
                        oneofMember = true,
                        jsonName = "success",
                        value = ai.wandering.scoop.v1.models.CreateUserResponse::success
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
                        value = ai.wandering.scoop.v1.models.CreateUserResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateUserResponse",
                messageClass = ai.wandering.scoop.v1.models.CreateUserResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CreateUserSuccessResponse(
    val user: ai.wandering.scoop.v1.models.User? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateUserSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateUserSuccessResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateUserSuccessResponse by lazy { ai.wandering.scoop.v1.models.CreateUserSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateUserSuccessResponse = ai.wandering.scoop.v1.models.CreateUserSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateUserSuccessResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateUserSuccessResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion),
                        jsonName = "user",
                        value = ai.wandering.scoop.v1.models.CreateUserSuccessResponse::user
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateUserSuccessResponse",
                messageClass = ai.wandering.scoop.v1.models.CreateUserSuccessResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateUserArgs")
public fun CreateUserArgs?.orDefault(): ai.wandering.scoop.v1.models.CreateUserArgs = this ?: CreateUserArgs.defaultInstance

private fun CreateUserArgs.protoMergeImpl(plus: pbandk.Message?): CreateUserArgs = (plus as? CreateUserArgs)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateUserArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateUserArgs {
    var email = ""
    var name = ""
    var photoUrl = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> email = _fieldValue as String
            2 -> name = _fieldValue as String
            3 -> photoUrl = _fieldValue as String
        }
    }

    return CreateUserArgs(email, name, photoUrl, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateUserResponse")
public fun CreateUserResponse?.orDefault(): ai.wandering.scoop.v1.models.CreateUserResponse = this ?: CreateUserResponse.defaultInstance

private fun CreateUserResponse.protoMergeImpl(plus: pbandk.Message?): CreateUserResponse = (plus as? CreateUserResponse)?.let {
    it.copy(
        type = when {
            type is CreateUserResponse.Type.Success && plus.type is CreateUserResponse.Type.Success ->
                CreateUserResponse.Type.Success(type.value + plus.type.value)
            type is CreateUserResponse.Type.Error && plus.type is CreateUserResponse.Type.Error ->
                CreateUserResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateUserResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateUserResponse {
    var type: CreateUserResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = CreateUserResponse.Type.Success(_fieldValue as ai.wandering.scoop.v1.models.CreateUserSuccessResponse)
            2 -> type = CreateUserResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return CreateUserResponse(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateUserSuccessResponse")
public fun CreateUserSuccessResponse?.orDefault(): ai.wandering.scoop.v1.models.CreateUserSuccessResponse = this ?: CreateUserSuccessResponse.defaultInstance

private fun CreateUserSuccessResponse.protoMergeImpl(plus: pbandk.Message?): CreateUserSuccessResponse = (plus as? CreateUserSuccessResponse)?.let {
    it.copy(
        user = user?.plus(plus.user) ?: plus.user,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateUserSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateUserSuccessResponse {
    var user: ai.wandering.scoop.v1.models.User? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> user = _fieldValue as ai.wandering.scoop.v1.models.User
        }
    }

    return CreateUserSuccessResponse(user, unknownFields)
}
