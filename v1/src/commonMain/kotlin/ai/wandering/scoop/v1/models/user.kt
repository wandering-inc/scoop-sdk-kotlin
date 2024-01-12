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
