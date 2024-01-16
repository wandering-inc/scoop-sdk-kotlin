@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class LoginArgs(
    val tokenId: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LoginArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LoginArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LoginArgs by lazy { ai.wandering.scoop.v1.models.LoginArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LoginArgs = ai.wandering.scoop.v1.models.LoginArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LoginArgs, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "tokenId",
                        value = ai.wandering.scoop.v1.models.LoginArgs::tokenId
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LoginArgs",
                messageClass = ai.wandering.scoop.v1.models.LoginArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class LoginSuccessResponse(
    val user: ai.wandering.scoop.v1.models.User? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LoginSuccessResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginSuccessResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LoginSuccessResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LoginSuccessResponse by lazy { ai.wandering.scoop.v1.models.LoginSuccessResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LoginSuccessResponse = ai.wandering.scoop.v1.models.LoginSuccessResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginSuccessResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LoginSuccessResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion),
                        jsonName = "user",
                        value = ai.wandering.scoop.v1.models.LoginSuccessResponse::user
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LoginSuccessResponse",
                messageClass = ai.wandering.scoop.v1.models.LoginSuccessResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class LoginResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.LoginSuccessResponse) : Type<ai.wandering.scoop.v1.models.LoginSuccessResponse>(success)
        public class Error(error: ai.wandering.scoop.v1.models.ScoopError) : Type<ai.wandering.scoop.v1.models.ScoopError>(error)
    }

    val success: ai.wandering.scoop.v1.models.LoginSuccessResponse?
        get() = (type as? Type.Success)?.value
    val error: ai.wandering.scoop.v1.models.ScoopError?
        get() = (type as? Type.Error)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LoginResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LoginResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LoginResponse by lazy { ai.wandering.scoop.v1.models.LoginResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LoginResponse = ai.wandering.scoop.v1.models.LoginResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LoginResponse, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "success",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.LoginSuccessResponse.Companion),
                        oneofMember = true,
                        jsonName = "success",
                        value = ai.wandering.scoop.v1.models.LoginResponse::success
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
                        value = ai.wandering.scoop.v1.models.LoginResponse::error
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LoginResponse",
                messageClass = ai.wandering.scoop.v1.models.LoginResponse::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForLoginArgs")
public fun LoginArgs?.orDefault(): ai.wandering.scoop.v1.models.LoginArgs = this ?: LoginArgs.defaultInstance

private fun LoginArgs.protoMergeImpl(plus: pbandk.Message?): LoginArgs = (plus as? LoginArgs)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LoginArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LoginArgs {
    var tokenId = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tokenId = _fieldValue as String
        }
    }

    return LoginArgs(tokenId, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLoginSuccessResponse")
public fun LoginSuccessResponse?.orDefault(): ai.wandering.scoop.v1.models.LoginSuccessResponse = this ?: LoginSuccessResponse.defaultInstance

private fun LoginSuccessResponse.protoMergeImpl(plus: pbandk.Message?): LoginSuccessResponse = (plus as? LoginSuccessResponse)?.let {
    it.copy(
        user = user?.plus(plus.user) ?: plus.user,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LoginSuccessResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LoginSuccessResponse {
    var user: ai.wandering.scoop.v1.models.User? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> user = _fieldValue as ai.wandering.scoop.v1.models.User
        }
    }

    return LoginSuccessResponse(user, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForLoginResponse")
public fun LoginResponse?.orDefault(): ai.wandering.scoop.v1.models.LoginResponse = this ?: LoginResponse.defaultInstance

private fun LoginResponse.protoMergeImpl(plus: pbandk.Message?): LoginResponse = (plus as? LoginResponse)?.let {
    it.copy(
        type = when {
            type is LoginResponse.Type.Success && plus.type is LoginResponse.Type.Success ->
                LoginResponse.Type.Success(type.value + plus.type.value)
            type is LoginResponse.Type.Error && plus.type is LoginResponse.Type.Error ->
                LoginResponse.Type.Error(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LoginResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LoginResponse {
    var type: LoginResponse.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = LoginResponse.Type.Success(_fieldValue as ai.wandering.scoop.v1.models.LoginSuccessResponse)
            2 -> type = LoginResponse.Type.Error(_fieldValue as ai.wandering.scoop.v1.models.ScoopError)
        }
    }

    return LoginResponse(type, unknownFields)
}
