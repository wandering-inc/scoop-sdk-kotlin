@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class ApiToken(
    val id: String = "",
    val name: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ApiToken = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ApiToken> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ApiToken> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ApiToken by lazy { ai.wandering.scoop.v1.models.ApiToken() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ApiToken = ai.wandering.scoop.v1.models.ApiToken.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ApiToken> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ApiToken, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.ApiToken::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.ApiToken::name
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ApiToken",
                messageClass = ai.wandering.scoop.v1.models.ApiToken::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ApiTokenDetails(
    val token: ai.wandering.scoop.v1.models.ApiToken? = null,
    val value: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ApiTokenDetails = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ApiTokenDetails> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ApiTokenDetails> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ApiTokenDetails by lazy { ai.wandering.scoop.v1.models.ApiTokenDetails() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ApiTokenDetails = ai.wandering.scoop.v1.models.ApiTokenDetails.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ApiTokenDetails> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ApiTokenDetails, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "token",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ApiToken.Companion),
                        jsonName = "token",
                        value = ai.wandering.scoop.v1.models.ApiTokenDetails::token
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = ai.wandering.scoop.v1.models.ApiTokenDetails::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ApiTokenDetails",
                messageClass = ai.wandering.scoop.v1.models.ApiTokenDetails::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForApiToken")
public fun ApiToken?.orDefault(): ai.wandering.scoop.v1.models.ApiToken = this ?: ApiToken.defaultInstance

private fun ApiToken.protoMergeImpl(plus: pbandk.Message?): ApiToken = (plus as? ApiToken)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ApiToken.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ApiToken {
    var id = ""
    var name = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> name = _fieldValue as String
        }
    }

    return ApiToken(id, name, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForApiTokenDetails")
public fun ApiTokenDetails?.orDefault(): ai.wandering.scoop.v1.models.ApiTokenDetails = this ?: ApiTokenDetails.defaultInstance

private fun ApiTokenDetails.protoMergeImpl(plus: pbandk.Message?): ApiTokenDetails = (plus as? ApiTokenDetails)?.let {
    it.copy(
        token = token?.plus(plus.token) ?: plus.token,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ApiTokenDetails.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ApiTokenDetails {
    var token: ai.wandering.scoop.v1.models.ApiToken? = null
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> token = _fieldValue as ai.wandering.scoop.v1.models.ApiToken
            2 -> value = _fieldValue as String
        }
    }

    return ApiTokenDetails(token, value, unknownFields)
}
