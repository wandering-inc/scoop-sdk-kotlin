@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class User(
    val id: String = "",
    val email: String? = null,
    val firebaseToken: String? = null,
    val name: String? = null,
    val photoUrl: String? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.User = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.User> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.User> {
        public val defaultInstance: ai.wandering.scoop.v1.models.User by lazy { ai.wandering.scoop.v1.models.User() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.User = ai.wandering.scoop.v1.models.User.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.User> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.User, *>>(5)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "id",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "id",
                        value = ai.wandering.scoop.v1.models.User::id
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "email",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "email",
                        value = ai.wandering.scoop.v1.models.User::email
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "firebase_token",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "firebaseToken",
                        value = ai.wandering.scoop.v1.models.User::firebaseToken
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "name",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "name",
                        value = ai.wandering.scoop.v1.models.User::name
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "photo_url",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(hasPresence = true),
                        jsonName = "photoUrl",
                        value = ai.wandering.scoop.v1.models.User::photoUrl
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.User",
                messageClass = ai.wandering.scoop.v1.models.User::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForUser")
public fun User?.orDefault(): ai.wandering.scoop.v1.models.User = this ?: User.defaultInstance

private fun User.protoMergeImpl(plus: pbandk.Message?): User = (plus as? User)?.let {
    it.copy(
        email = plus.email ?: email,
        firebaseToken = plus.firebaseToken ?: firebaseToken,
        name = plus.name ?: name,
        photoUrl = plus.photoUrl ?: photoUrl,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun User.Companion.decodeWithImpl(u: pbandk.MessageDecoder): User {
    var id = ""
    var email: String? = null
    var firebaseToken: String? = null
    var name: String? = null
    var photoUrl: String? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> id = _fieldValue as String
            2 -> email = _fieldValue as String
            3 -> firebaseToken = _fieldValue as String
            4 -> name = _fieldValue as String
            5 -> photoUrl = _fieldValue as String
        }
    }

    return User(id, email, firebaseToken, name,
        photoUrl, unknownFields)
}
