@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class Token(
    val id: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.Token = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Token> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.Token> {
        public val defaultInstance: ai.wandering.scoop.v1.models.Token by lazy { ai.wandering.scoop.v1.models.Token() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.Token = ai.wandering.scoop.v1.models.Token.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.Token> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.Token, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.Token::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.Token::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.Token",
                messageClass = ai.wandering.scoop.v1.models.Token::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class TokenDetails(
    val token: ai.wandering.scoop.v1.models.Token? = null,
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.TokenDetails = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TokenDetails> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.TokenDetails> {
        public val defaultInstance: ai.wandering.scoop.v1.models.TokenDetails by lazy { ai.wandering.scoop.v1.models.TokenDetails() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.TokenDetails = ai.wandering.scoop.v1.models.TokenDetails.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TokenDetails> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.TokenDetails, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Token.Companion),
                        jsonName = "token",
                        value = ai.wandering.scoop.v1.models.TokenDetails::token
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = ai.wandering.scoop.v1.models.TokenDetails::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.TokenDetails",
                messageClass = ai.wandering.scoop.v1.models.TokenDetails::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class CreateTokenArgs(
    val userId: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.CreateTokenArgs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateTokenArgs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.CreateTokenArgs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.CreateTokenArgs by lazy { ai.wandering.scoop.v1.models.CreateTokenArgs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.CreateTokenArgs = ai.wandering.scoop.v1.models.CreateTokenArgs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.CreateTokenArgs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.CreateTokenArgs, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user_id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "userId",
                        value = ai.wandering.scoop.v1.models.CreateTokenArgs::userId
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.CreateTokenArgs::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.CreateTokenArgs",
                messageClass = ai.wandering.scoop.v1.models.CreateTokenArgs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForToken")
public fun Token?.orDefault(): ai.wandering.scoop.v1.models.Token = this ?: Token.defaultInstance

private fun Token.protoMergeImpl(plus: pbandk.Message?): Token = (plus as? Token)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun Token.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Token {
    var id = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return Token(id, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTokenDetails")
public fun TokenDetails?.orDefault(): ai.wandering.scoop.v1.models.TokenDetails = this ?: TokenDetails.defaultInstance

private fun TokenDetails.protoMergeImpl(plus: pbandk.Message?): TokenDetails = (plus as? TokenDetails)?.let {
    it.copy(
        token = token?.plus(plus.token) ?: plus.token,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TokenDetails.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TokenDetails {
    var token: ai.wandering.scoop.v1.models.Token? = null
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> token = _fieldValue as ai.wandering.scoop.v1.models.Token
            2 -> value = _fieldValue as String
        }
    }

    return TokenDetails(token, value, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForCreateTokenArgs")
public fun CreateTokenArgs?.orDefault(): ai.wandering.scoop.v1.models.CreateTokenArgs = this ?: CreateTokenArgs.defaultInstance

private fun CreateTokenArgs.protoMergeImpl(plus: pbandk.Message?): CreateTokenArgs = (plus as? CreateTokenArgs)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun CreateTokenArgs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): CreateTokenArgs {
    var userId = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> userId = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return CreateTokenArgs(userId, name, unknownFields)
}
