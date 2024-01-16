@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class SignupSuccessResponse(
    val user: ai.wandering.scoop.v1.models.User? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.SignupSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.SignupSuccessResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.SignupSuccessResponse by lazy { ai.wandering.scoop.v1.models.SignupSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.SignupSuccessResponse = ai.wandering.scoop.v1.models.SignupSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupSuccessResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.SignupSuccessResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion),
                        jsonName = "user",
                        value = ai.wandering.scoop.v1.models.SignupSuccessResponse::user
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.SignupSuccessResponse",
                messageClass = ai.wandering.scoop.v1.models.SignupSuccessResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class SignupResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.SignupSuccessResponse) : Type<ai.wandering.scoop.v1.models.SignupSuccessResponse>(success)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val success: ai.wandering.scoop.v1.models.SignupSuccessResponse?
        get() = (type as? Type.Success)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.SignupResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.SignupResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.SignupResponse by lazy { ai.wandering.scoop.v1.models.SignupResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.SignupResponse = ai.wandering.scoop.v1.models.SignupResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.SignupResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.SignupSuccessResponse.Companion),
                        oneofMember = true,
                        jsonName = "success",
                        value = ai.wandering.scoop.v1.models.SignupResponse::success
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
                        value = ai.wandering.scoop.v1.models.SignupResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.SignupResponse",
                messageClass = ai.wandering.scoop.v1.models.SignupResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class SignupArgs(
    val tokenId: String = "",
    val email: String? = null,
    val name: String? = null,
    val photoUrl: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.SignupArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.SignupArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.SignupArgs by lazy { ai.wandering.scoop.v1.models.SignupArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.SignupArgs = ai.wandering.scoop.v1.models.SignupArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.SignupArgs, *>>(4)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tokenId",
                        value = ai.wandering.scoop.v1.models.SignupArgs::tokenId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "email",
                        value = ai.wandering.scoop.v1.models.SignupArgs::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.SignupArgs::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "photo_url",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "photoUrl",
                        value = ai.wandering.scoop.v1.models.SignupArgs::photoUrl
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.SignupArgs",
                messageClass = ai.wandering.scoop.v1.models.SignupArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForSignupSuccessResponse")
public fun SignupSuccessResponse?.orDefault(): ai.wandering.scoop.v1.models.SignupSuccessResponse = this ?: SignupSuccessResponse.defaultInstance

private fun SignupSuccessResponse.protoMergeImpl(plus: pbandk.Message?): SignupSuccessResponse = (plus as? SignupSuccessResponse)?.let {
    it.copy(
        user = user?.plus(plus.user) ?: plus.user,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SignupSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SignupSuccessResponse {
    var user: ai.wandering.scoop.v1.models.User? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> user = _fieldValue as ai.wandering.scoop.v1.models.User
        }
    }

    return SignupSuccessResponse(user, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSignupResponse")
public fun SignupResponse?.orDefault(): ai.wandering.scoop.v1.models.SignupResponse = this ?: SignupResponse.defaultInstance

private fun SignupResponse.protoMergeImpl(plus: pbandk.Message?): SignupResponse = (plus as? SignupResponse)?.let {
    it.copy(
        type = when {
            type is SignupResponse.Type.Success && plus.type is SignupResponse.Type.Success ->
                SignupResponse.Type.Success(type.value + plus.type.value)
            type is SignupResponse.Type.Error && plus.type is SignupResponse.Type.Error ->
                SignupResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SignupResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SignupResponse {
    var type: SignupResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = SignupResponse.Type.Success(_fieldValue as ai.wandering.scoop.v1.models.SignupSuccessResponse)
            2 -> type = SignupResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return SignupResponse(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForSignupArgs")
public fun SignupArgs?.orDefault(): ai.wandering.scoop.v1.models.SignupArgs = this ?: SignupArgs.defaultInstance

private fun SignupArgs.protoMergeImpl(plus: pbandk.Message?): SignupArgs = (plus as? SignupArgs)?.let {
    it.copy(
        email = plus.email ?: email,
        name = plus.name ?: name,
        photoUrl = plus.photoUrl ?: photoUrl,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SignupArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SignupArgs {
    var tokenId = ""
    var email: String? = null
    var name: String? = null
    var photoUrl: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokenId = _fieldValue as String
            2 -> email = _fieldValue as String
            3 -> name = _fieldValue as String
            4 -> photoUrl = _fieldValue as String
        }
    }

    return SignupArgs(tokenId, email, name, photoUrl, unknownFields)
}
