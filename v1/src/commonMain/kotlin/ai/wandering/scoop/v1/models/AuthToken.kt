@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class AuthToken(
    val value: String = "",
    val expiration: Long = 0L,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.AuthToken = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthToken> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.AuthToken> {
        public val defaultInstance: ai.wandering.scoop.v1.models.AuthToken by lazy { ai.wandering.scoop.v1.models.AuthToken() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.AuthToken = ai.wandering.scoop.v1.models.AuthToken.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthToken> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.AuthToken, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "value",
                        value = ai.wandering.scoop.v1.models.AuthToken::value
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "expiration",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.UInt64(),
                        jsonName = "expiration",
                        value = ai.wandering.scoop.v1.models.AuthToken::expiration
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.AuthToken",
                messageClass = ai.wandering.scoop.v1.models.AuthToken::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthToken")
public fun AuthToken?.orDefault(): ai.wandering.scoop.v1.models.AuthToken = this ?: AuthToken.defaultInstance

private fun AuthToken.protoMergeImpl(plus: pbandk.Message?): AuthToken = (plus as? AuthToken)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthToken.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthToken {
    var value = ""
    var expiration = 0L

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> value = _fieldValue as String
            2 -> expiration = _fieldValue as Long
        }
    }

    return AuthToken(value, expiration, unknownFields)
}
