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
public data class LoginResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.LoginSuccessResponse) : Type<ai.wandering.scoop.v1.models.LoginSuccessResponse>(success)
        public class Failure(failure: ai.wandering.scoop.v1.models.LoginFailureResponse) : Type<ai.wandering.scoop.v1.models.LoginFailureResponse>(failure)
    }

    val success: ai.wandering.scoop.v1.models.LoginSuccessResponse?
        get() = (type as? Type.Success)?.value
    val failure: ai.wandering.scoop.v1.models.LoginFailureResponse?
        get() = (type as? Type.Failure)?.value

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
                        name = "failure",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.LoginFailureResponse.Companion),
                        oneofMember = true,
                        jsonName = "failure",
                        value = ai.wandering.scoop.v1.models.LoginResponse::failure
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
public data class LoginFailureResponse(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.LoginFailureResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginFailureResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.LoginFailureResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.LoginFailureResponse by lazy { ai.wandering.scoop.v1.models.LoginFailureResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.LoginFailureResponse = ai.wandering.scoop.v1.models.LoginFailureResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.LoginFailureResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.LoginFailureResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.LoginFailureResponse::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.LoginFailureResponse",
                messageClass = ai.wandering.scoop.v1.models.LoginFailureResponse::class,
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
public data class SignupResponse(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Success(success: ai.wandering.scoop.v1.models.SignupSuccessResponse) : Type<ai.wandering.scoop.v1.models.SignupSuccessResponse>(success)
        public class Failure(failure: ai.wandering.scoop.v1.models.SignupFailureResponse) : Type<ai.wandering.scoop.v1.models.SignupFailureResponse>(failure)
    }

    val success: ai.wandering.scoop.v1.models.SignupSuccessResponse?
        get() = (type as? Type.Success)?.value
    val failure: ai.wandering.scoop.v1.models.SignupFailureResponse?
        get() = (type as? Type.Failure)?.value

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
                        name = "failure",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.SignupFailureResponse.Companion),
                        oneofMember = true,
                        jsonName = "failure",
                        value = ai.wandering.scoop.v1.models.SignupResponse::failure
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
public data class SignupFailureResponse(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.SignupFailureResponse = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupFailureResponse> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.SignupFailureResponse> {
        public val defaultInstance: ai.wandering.scoop.v1.models.SignupFailureResponse by lazy { ai.wandering.scoop.v1.models.SignupFailureResponse() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.SignupFailureResponse = ai.wandering.scoop.v1.models.SignupFailureResponse.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.SignupFailureResponse> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.SignupFailureResponse, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.SignupFailureResponse::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.SignupFailureResponse",
                messageClass = ai.wandering.scoop.v1.models.SignupFailureResponse::class,
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
@pbandk.JsName("orDefaultForLoginResponse")
public fun LoginResponse?.orDefault(): ai.wandering.scoop.v1.models.LoginResponse = this ?: LoginResponse.defaultInstance

private fun LoginResponse.protoMergeImpl(plus: pbandk.Message?): LoginResponse = (plus as? LoginResponse)?.let {
    it.copy(
        type = when {
            type is LoginResponse.Type.Success && plus.type is LoginResponse.Type.Success ->
                LoginResponse.Type.Success(type.value + plus.type.value)
            type is LoginResponse.Type.Failure && plus.type is LoginResponse.Type.Failure ->
                LoginResponse.Type.Failure(type.value + plus.type.value)
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
            2 -> type = LoginResponse.Type.Failure(_fieldValue as ai.wandering.scoop.v1.models.LoginFailureResponse)
        }
    }

    return LoginResponse(type, unknownFields)
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
@pbandk.JsName("orDefaultForLoginFailureResponse")
public fun LoginFailureResponse?.orDefault(): ai.wandering.scoop.v1.models.LoginFailureResponse = this ?: LoginFailureResponse.defaultInstance

private fun LoginFailureResponse.protoMergeImpl(plus: pbandk.Message?): LoginFailureResponse = (plus as? LoginFailureResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun LoginFailureResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): LoginFailureResponse {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return LoginFailureResponse(message, unknownFields)
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

@pbandk.Export
@pbandk.JsName("orDefaultForSignupResponse")
public fun SignupResponse?.orDefault(): ai.wandering.scoop.v1.models.SignupResponse = this ?: SignupResponse.defaultInstance

private fun SignupResponse.protoMergeImpl(plus: pbandk.Message?): SignupResponse = (plus as? SignupResponse)?.let {
    it.copy(
        type = when {
            type is SignupResponse.Type.Success && plus.type is SignupResponse.Type.Success ->
                SignupResponse.Type.Success(type.value + plus.type.value)
            type is SignupResponse.Type.Failure && plus.type is SignupResponse.Type.Failure ->
                SignupResponse.Type.Failure(type.value + plus.type.value)
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
            2 -> type = SignupResponse.Type.Failure(_fieldValue as ai.wandering.scoop.v1.models.SignupFailureResponse)
        }
    }

    return SignupResponse(type, unknownFields)
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
@pbandk.JsName("orDefaultForSignupFailureResponse")
public fun SignupFailureResponse?.orDefault(): ai.wandering.scoop.v1.models.SignupFailureResponse = this ?: SignupFailureResponse.defaultInstance

private fun SignupFailureResponse.protoMergeImpl(plus: pbandk.Message?): SignupFailureResponse = (plus as? SignupFailureResponse)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun SignupFailureResponse.Companion.decodeWithImpl(u: pbandk.MessageDecoder): SignupFailureResponse {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return SignupFailureResponse(message, unknownFields)
}
