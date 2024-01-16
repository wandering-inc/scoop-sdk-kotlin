@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class ScoopError(
    val type: Type<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Type<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Client(client: ai.wandering.scoop.v1.models.ClientError) : Type<ai.wandering.scoop.v1.models.ClientError>(client)
        public class Server(server: ai.wandering.scoop.v1.models.ServerError) : Type<ai.wandering.scoop.v1.models.ServerError>(server)
        public class Unknown(unknown: ai.wandering.scoop.v1.models.UnknownError) : Type<ai.wandering.scoop.v1.models.UnknownError>(unknown)
    }

    val client: ai.wandering.scoop.v1.models.ClientError?
        get() = (type as? Type.Client)?.value
    val server: ai.wandering.scoop.v1.models.ServerError?
        get() = (type as? Type.Server)?.value
    val unknown: ai.wandering.scoop.v1.models.UnknownError?
        get() = (type as? Type.Unknown)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ScoopError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ScoopError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ScoopError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ScoopError by lazy { ai.wandering.scoop.v1.models.ScoopError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ScoopError = ai.wandering.scoop.v1.models.ScoopError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ScoopError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ScoopError, *>>(3)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "client",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ClientError.Companion),
                        oneofMember = true,
                        jsonName = "client",
                        value = ai.wandering.scoop.v1.models.ScoopError::client
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "server",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ServerError.Companion),
                        oneofMember = true,
                        jsonName = "server",
                        value = ai.wandering.scoop.v1.models.ScoopError::server
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unknown",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UnknownError.Companion),
                        oneofMember = true,
                        jsonName = "unknown",
                        value = ai.wandering.scoop.v1.models.ScoopError::unknown
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ScoopError",
                messageClass = ai.wandering.scoop.v1.models.ScoopError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ClientError(
    val error: Error<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Error<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class InvalidArgument(invalidArgument: ai.wandering.scoop.v1.models.InvalidArgumentError) : Error<ai.wandering.scoop.v1.models.InvalidArgumentError>(invalidArgument)
        public class MissingField(missingField: ai.wandering.scoop.v1.models.MissingFieldError) : Error<ai.wandering.scoop.v1.models.MissingFieldError>(missingField)
        public class RequestTooLarge(requestTooLarge: ai.wandering.scoop.v1.models.RequestTooLargeError) : Error<ai.wandering.scoop.v1.models.RequestTooLargeError>(requestTooLarge)
        public class Authentication(authentication: ai.wandering.scoop.v1.models.AuthenticationError) : Error<ai.wandering.scoop.v1.models.AuthenticationError>(authentication)
        public class Authorization(authorization: ai.wandering.scoop.v1.models.AuthorizationError) : Error<ai.wandering.scoop.v1.models.AuthorizationError>(authorization)
        public class QuotaExceeded(quotaExceeded: ai.wandering.scoop.v1.models.QuotaExceededError) : Error<ai.wandering.scoop.v1.models.QuotaExceededError>(quotaExceeded)
        public class RateLimitExceeded(rateLimitExceeded: ai.wandering.scoop.v1.models.RateLimitExceededError) : Error<ai.wandering.scoop.v1.models.RateLimitExceededError>(rateLimitExceeded)
    }

    val invalidArgument: ai.wandering.scoop.v1.models.InvalidArgumentError?
        get() = (error as? Error.InvalidArgument)?.value
    val missingField: ai.wandering.scoop.v1.models.MissingFieldError?
        get() = (error as? Error.MissingField)?.value
    val requestTooLarge: ai.wandering.scoop.v1.models.RequestTooLargeError?
        get() = (error as? Error.RequestTooLarge)?.value
    val authentication: ai.wandering.scoop.v1.models.AuthenticationError?
        get() = (error as? Error.Authentication)?.value
    val authorization: ai.wandering.scoop.v1.models.AuthorizationError?
        get() = (error as? Error.Authorization)?.value
    val quotaExceeded: ai.wandering.scoop.v1.models.QuotaExceededError?
        get() = (error as? Error.QuotaExceeded)?.value
    val rateLimitExceeded: ai.wandering.scoop.v1.models.RateLimitExceededError?
        get() = (error as? Error.RateLimitExceeded)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ClientError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ClientError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ClientError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ClientError by lazy { ai.wandering.scoop.v1.models.ClientError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ClientError = ai.wandering.scoop.v1.models.ClientError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ClientError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ClientError, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "invalid_argument",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.InvalidArgumentError.Companion),
                        oneofMember = true,
                        jsonName = "invalidArgument",
                        value = ai.wandering.scoop.v1.models.ClientError::invalidArgument
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "missing_field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.MissingFieldError.Companion),
                        oneofMember = true,
                        jsonName = "missingField",
                        value = ai.wandering.scoop.v1.models.ClientError::missingField
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "request_too_large",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.RequestTooLargeError.Companion),
                        oneofMember = true,
                        jsonName = "requestTooLarge",
                        value = ai.wandering.scoop.v1.models.ClientError::requestTooLarge
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "authentication",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.AuthenticationError.Companion),
                        oneofMember = true,
                        jsonName = "authentication",
                        value = ai.wandering.scoop.v1.models.ClientError::authentication
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "authorization",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.AuthorizationError.Companion),
                        oneofMember = true,
                        jsonName = "authorization",
                        value = ai.wandering.scoop.v1.models.ClientError::authorization
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "quota_exceeded",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.QuotaExceededError.Companion),
                        oneofMember = true,
                        jsonName = "quotaExceeded",
                        value = ai.wandering.scoop.v1.models.ClientError::quotaExceeded
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "rate_limit_exceeded",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.RateLimitExceededError.Companion),
                        oneofMember = true,
                        jsonName = "rateLimitExceeded",
                        value = ai.wandering.scoop.v1.models.ClientError::rateLimitExceeded
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ClientError",
                messageClass = ai.wandering.scoop.v1.models.ClientError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class InvalidArgumentError(
    val message: String = "",
    val field: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.InvalidArgumentError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.InvalidArgumentError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.InvalidArgumentError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.InvalidArgumentError by lazy { ai.wandering.scoop.v1.models.InvalidArgumentError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.InvalidArgumentError = ai.wandering.scoop.v1.models.InvalidArgumentError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.InvalidArgumentError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.InvalidArgumentError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.InvalidArgumentError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "field",
                        value = ai.wandering.scoop.v1.models.InvalidArgumentError::field
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.InvalidArgumentError",
                messageClass = ai.wandering.scoop.v1.models.InvalidArgumentError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class MissingFieldError(
    val message: String = "",
    val field: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.MissingFieldError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.MissingFieldError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.MissingFieldError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.MissingFieldError by lazy { ai.wandering.scoop.v1.models.MissingFieldError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.MissingFieldError = ai.wandering.scoop.v1.models.MissingFieldError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.MissingFieldError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.MissingFieldError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.MissingFieldError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "field",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "field",
                        value = ai.wandering.scoop.v1.models.MissingFieldError::field
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.MissingFieldError",
                messageClass = ai.wandering.scoop.v1.models.MissingFieldError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class RequestTooLargeError(
    val message: String = "",
    val maxAllowedSize: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.RequestTooLargeError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RequestTooLargeError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.RequestTooLargeError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.RequestTooLargeError by lazy { ai.wandering.scoop.v1.models.RequestTooLargeError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.RequestTooLargeError = ai.wandering.scoop.v1.models.RequestTooLargeError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RequestTooLargeError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.RequestTooLargeError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.RequestTooLargeError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "max_allowed_size",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "maxAllowedSize",
                        value = ai.wandering.scoop.v1.models.RequestTooLargeError::maxAllowedSize
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.RequestTooLargeError",
                messageClass = ai.wandering.scoop.v1.models.RequestTooLargeError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class AuthenticationError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.AuthenticationError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthenticationError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.AuthenticationError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.AuthenticationError by lazy { ai.wandering.scoop.v1.models.AuthenticationError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.AuthenticationError = ai.wandering.scoop.v1.models.AuthenticationError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthenticationError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.AuthenticationError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.AuthenticationError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.AuthenticationError",
                messageClass = ai.wandering.scoop.v1.models.AuthenticationError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class AuthorizationError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.AuthorizationError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthorizationError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.AuthorizationError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.AuthorizationError by lazy { ai.wandering.scoop.v1.models.AuthorizationError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.AuthorizationError = ai.wandering.scoop.v1.models.AuthorizationError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.AuthorizationError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.AuthorizationError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.AuthorizationError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.AuthorizationError",
                messageClass = ai.wandering.scoop.v1.models.AuthorizationError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class QuotaExceededError(
    val message: String = "",
    val quotaType: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.QuotaExceededError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.QuotaExceededError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.QuotaExceededError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.QuotaExceededError by lazy { ai.wandering.scoop.v1.models.QuotaExceededError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.QuotaExceededError = ai.wandering.scoop.v1.models.QuotaExceededError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.QuotaExceededError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.QuotaExceededError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.QuotaExceededError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "quota_type",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "quotaType",
                        value = ai.wandering.scoop.v1.models.QuotaExceededError::quotaType
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.QuotaExceededError",
                messageClass = ai.wandering.scoop.v1.models.QuotaExceededError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class RateLimitExceededError(
    val message: String = "",
    val retryAfterSeconds: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.RateLimitExceededError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RateLimitExceededError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.RateLimitExceededError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.RateLimitExceededError by lazy { ai.wandering.scoop.v1.models.RateLimitExceededError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.RateLimitExceededError = ai.wandering.scoop.v1.models.RateLimitExceededError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.RateLimitExceededError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.RateLimitExceededError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.RateLimitExceededError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "retry_after_seconds",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "retryAfterSeconds",
                        value = ai.wandering.scoop.v1.models.RateLimitExceededError::retryAfterSeconds
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.RateLimitExceededError",
                messageClass = ai.wandering.scoop.v1.models.RateLimitExceededError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ServerError(
    val error: Error<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Error<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Internal(internal: ai.wandering.scoop.v1.models.InternalServerError) : Error<ai.wandering.scoop.v1.models.InternalServerError>(internal)
        public class Database(database: ai.wandering.scoop.v1.models.DatabaseError) : Error<ai.wandering.scoop.v1.models.DatabaseError>(database)
        public class ServiceUnavailable(serviceUnavailable: ai.wandering.scoop.v1.models.ServiceUnavailableError) : Error<ai.wandering.scoop.v1.models.ServiceUnavailableError>(serviceUnavailable)
        public class Timeout(timeout: ai.wandering.scoop.v1.models.TimeoutError) : Error<ai.wandering.scoop.v1.models.TimeoutError>(timeout)
        public class DependencyFailure(dependencyFailure: ai.wandering.scoop.v1.models.DependencyFailureError) : Error<ai.wandering.scoop.v1.models.DependencyFailureError>(dependencyFailure)
        public class DataCorruption(dataCorruption: ai.wandering.scoop.v1.models.DataCorruptionError) : Error<ai.wandering.scoop.v1.models.DataCorruptionError>(dataCorruption)
        public class NotFound(notFound: ai.wandering.scoop.v1.models.NotFoundError) : Error<ai.wandering.scoop.v1.models.NotFoundError>(notFound)
    }

    val internal: ai.wandering.scoop.v1.models.InternalServerError?
        get() = (error as? Error.Internal)?.value
    val database: ai.wandering.scoop.v1.models.DatabaseError?
        get() = (error as? Error.Database)?.value
    val serviceUnavailable: ai.wandering.scoop.v1.models.ServiceUnavailableError?
        get() = (error as? Error.ServiceUnavailable)?.value
    val timeout: ai.wandering.scoop.v1.models.TimeoutError?
        get() = (error as? Error.Timeout)?.value
    val dependencyFailure: ai.wandering.scoop.v1.models.DependencyFailureError?
        get() = (error as? Error.DependencyFailure)?.value
    val dataCorruption: ai.wandering.scoop.v1.models.DataCorruptionError?
        get() = (error as? Error.DataCorruption)?.value
    val notFound: ai.wandering.scoop.v1.models.NotFoundError?
        get() = (error as? Error.NotFound)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ServerError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ServerError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ServerError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ServerError by lazy { ai.wandering.scoop.v1.models.ServerError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ServerError = ai.wandering.scoop.v1.models.ServerError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ServerError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ServerError, *>>(7)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "internal",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.InternalServerError.Companion),
                        oneofMember = true,
                        jsonName = "internal",
                        value = ai.wandering.scoop.v1.models.ServerError::internal
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "database",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.DatabaseError.Companion),
                        oneofMember = true,
                        jsonName = "database",
                        value = ai.wandering.scoop.v1.models.ServerError::database
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "service_unavailable",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.ServiceUnavailableError.Companion),
                        oneofMember = true,
                        jsonName = "serviceUnavailable",
                        value = ai.wandering.scoop.v1.models.ServerError::serviceUnavailable
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timeout",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.TimeoutError.Companion),
                        oneofMember = true,
                        jsonName = "timeout",
                        value = ai.wandering.scoop.v1.models.ServerError::timeout
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dependency_failure",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.DependencyFailureError.Companion),
                        oneofMember = true,
                        jsonName = "dependencyFailure",
                        value = ai.wandering.scoop.v1.models.ServerError::dependencyFailure
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "data_corruption",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.DataCorruptionError.Companion),
                        oneofMember = true,
                        jsonName = "dataCorruption",
                        value = ai.wandering.scoop.v1.models.ServerError::dataCorruption
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "not_found",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.NotFoundError.Companion),
                        oneofMember = true,
                        jsonName = "notFound",
                        value = ai.wandering.scoop.v1.models.ServerError::notFound
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ServerError",
                messageClass = ai.wandering.scoop.v1.models.ServerError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class NotFoundError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.NotFoundError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.NotFoundError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.NotFoundError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.NotFoundError by lazy { ai.wandering.scoop.v1.models.NotFoundError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.NotFoundError = ai.wandering.scoop.v1.models.NotFoundError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.NotFoundError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.NotFoundError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.NotFoundError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.NotFoundError",
                messageClass = ai.wandering.scoop.v1.models.NotFoundError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class InternalServerError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.InternalServerError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.InternalServerError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.InternalServerError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.InternalServerError by lazy { ai.wandering.scoop.v1.models.InternalServerError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.InternalServerError = ai.wandering.scoop.v1.models.InternalServerError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.InternalServerError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.InternalServerError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.InternalServerError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.InternalServerError",
                messageClass = ai.wandering.scoop.v1.models.InternalServerError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DatabaseError(
    val message: String = "",
    val operation: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.DatabaseError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DatabaseError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.DatabaseError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.DatabaseError by lazy { ai.wandering.scoop.v1.models.DatabaseError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.DatabaseError = ai.wandering.scoop.v1.models.DatabaseError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DatabaseError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.DatabaseError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.DatabaseError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "operation",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "operation",
                        value = ai.wandering.scoop.v1.models.DatabaseError::operation
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.DatabaseError",
                messageClass = ai.wandering.scoop.v1.models.DatabaseError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class ServiceUnavailableError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.ServiceUnavailableError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ServiceUnavailableError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.ServiceUnavailableError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.ServiceUnavailableError by lazy { ai.wandering.scoop.v1.models.ServiceUnavailableError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.ServiceUnavailableError = ai.wandering.scoop.v1.models.ServiceUnavailableError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.ServiceUnavailableError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.ServiceUnavailableError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.ServiceUnavailableError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.ServiceUnavailableError",
                messageClass = ai.wandering.scoop.v1.models.ServiceUnavailableError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class TimeoutError(
    val message: String = "",
    val timeoutSeconds: Int = 0,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.TimeoutError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TimeoutError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.TimeoutError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.TimeoutError by lazy { ai.wandering.scoop.v1.models.TimeoutError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.TimeoutError = ai.wandering.scoop.v1.models.TimeoutError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.TimeoutError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.TimeoutError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.TimeoutError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "timeout_seconds",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Int32(),
                        jsonName = "timeoutSeconds",
                        value = ai.wandering.scoop.v1.models.TimeoutError::timeoutSeconds
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.TimeoutError",
                messageClass = ai.wandering.scoop.v1.models.TimeoutError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DependencyFailureError(
    val message: String = "",
    val dependencyName: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.DependencyFailureError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DependencyFailureError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.DependencyFailureError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.DependencyFailureError by lazy { ai.wandering.scoop.v1.models.DependencyFailureError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.DependencyFailureError = ai.wandering.scoop.v1.models.DependencyFailureError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DependencyFailureError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.DependencyFailureError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.DependencyFailureError::message
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "dependency_name",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "dependencyName",
                        value = ai.wandering.scoop.v1.models.DependencyFailureError::dependencyName
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.DependencyFailureError",
                messageClass = ai.wandering.scoop.v1.models.DependencyFailureError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class DataCorruptionError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.DataCorruptionError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DataCorruptionError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.DataCorruptionError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.DataCorruptionError by lazy { ai.wandering.scoop.v1.models.DataCorruptionError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.DataCorruptionError = ai.wandering.scoop.v1.models.DataCorruptionError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.DataCorruptionError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.DataCorruptionError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.DataCorruptionError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.DataCorruptionError",
                messageClass = ai.wandering.scoop.v1.models.DataCorruptionError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UnknownError(
    val error: Error<*>? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    public sealed class Error<V>(value: V) : pbandk.Message.OneOf<V>(value) {
        public class Unexpected(unexpected: ai.wandering.scoop.v1.models.UnexpectedError) : Error<ai.wandering.scoop.v1.models.UnexpectedError>(unexpected)
        public class Undocumented(undocumented: ai.wandering.scoop.v1.models.UndocumentedError) : Error<ai.wandering.scoop.v1.models.UndocumentedError>(undocumented)
    }

    val unexpected: ai.wandering.scoop.v1.models.UnexpectedError?
        get() = (error as? Error.Unexpected)?.value
    val undocumented: ai.wandering.scoop.v1.models.UndocumentedError?
        get() = (error as? Error.Undocumented)?.value

    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UnknownError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UnknownError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UnknownError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UnknownError by lazy { ai.wandering.scoop.v1.models.UnknownError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UnknownError = ai.wandering.scoop.v1.models.UnknownError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UnknownError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UnknownError, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "unexpected",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UnexpectedError.Companion),
                        oneofMember = true,
                        jsonName = "unexpected",
                        value = ai.wandering.scoop.v1.models.UnknownError::unexpected
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "undocumented",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UndocumentedError.Companion),
                        oneofMember = true,
                        jsonName = "undocumented",
                        value = ai.wandering.scoop.v1.models.UnknownError::undocumented
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UnknownError",
                messageClass = ai.wandering.scoop.v1.models.UnknownError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UnexpectedError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UnexpectedError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UnexpectedError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UnexpectedError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UnexpectedError by lazy { ai.wandering.scoop.v1.models.UnexpectedError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UnexpectedError = ai.wandering.scoop.v1.models.UnexpectedError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UnexpectedError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UnexpectedError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.UnexpectedError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UnexpectedError",
                messageClass = ai.wandering.scoop.v1.models.UnexpectedError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UndocumentedError(
    val message: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UndocumentedError = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UndocumentedError> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UndocumentedError> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UndocumentedError by lazy { ai.wandering.scoop.v1.models.UndocumentedError() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UndocumentedError = ai.wandering.scoop.v1.models.UndocumentedError.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UndocumentedError> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UndocumentedError, *>>(1)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "message",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "message",
                        value = ai.wandering.scoop.v1.models.UndocumentedError::message
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UndocumentedError",
                messageClass = ai.wandering.scoop.v1.models.UndocumentedError::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForScoopError")
public fun ScoopError?.orDefault(): ai.wandering.scoop.v1.models.ScoopError = this ?: ScoopError.defaultInstance

private fun ScoopError.protoMergeImpl(plus: pbandk.Message?): ScoopError = (plus as? ScoopError)?.let {
    it.copy(
        type = when {
            type is ScoopError.Type.Client && plus.type is ScoopError.Type.Client ->
                ScoopError.Type.Client(type.value + plus.type.value)
            type is ScoopError.Type.Server && plus.type is ScoopError.Type.Server ->
                ScoopError.Type.Server(type.value + plus.type.value)
            type is ScoopError.Type.Unknown && plus.type is ScoopError.Type.Unknown ->
                ScoopError.Type.Unknown(type.value + plus.type.value)
            else ->
                plus.type ?: type
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ScoopError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ScoopError {
    var type: ScoopError.Type<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> type = ScoopError.Type.Client(_fieldValue as ai.wandering.scoop.v1.models.ClientError)
            2 -> type = ScoopError.Type.Server(_fieldValue as ai.wandering.scoop.v1.models.ServerError)
            3 -> type = ScoopError.Type.Unknown(_fieldValue as ai.wandering.scoop.v1.models.UnknownError)
        }
    }

    return ScoopError(type, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForClientError")
public fun ClientError?.orDefault(): ai.wandering.scoop.v1.models.ClientError = this ?: ClientError.defaultInstance

private fun ClientError.protoMergeImpl(plus: pbandk.Message?): ClientError = (plus as? ClientError)?.let {
    it.copy(
        error = when {
            error is ClientError.Error.InvalidArgument && plus.error is ClientError.Error.InvalidArgument ->
                ClientError.Error.InvalidArgument(error.value + plus.error.value)
            error is ClientError.Error.MissingField && plus.error is ClientError.Error.MissingField ->
                ClientError.Error.MissingField(error.value + plus.error.value)
            error is ClientError.Error.RequestTooLarge && plus.error is ClientError.Error.RequestTooLarge ->
                ClientError.Error.RequestTooLarge(error.value + plus.error.value)
            error is ClientError.Error.Authentication && plus.error is ClientError.Error.Authentication ->
                ClientError.Error.Authentication(error.value + plus.error.value)
            error is ClientError.Error.Authorization && plus.error is ClientError.Error.Authorization ->
                ClientError.Error.Authorization(error.value + plus.error.value)
            error is ClientError.Error.QuotaExceeded && plus.error is ClientError.Error.QuotaExceeded ->
                ClientError.Error.QuotaExceeded(error.value + plus.error.value)
            error is ClientError.Error.RateLimitExceeded && plus.error is ClientError.Error.RateLimitExceeded ->
                ClientError.Error.RateLimitExceeded(error.value + plus.error.value)
            else ->
                plus.error ?: error
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ClientError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ClientError {
    var error: ClientError.Error<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = ClientError.Error.InvalidArgument(_fieldValue as ai.wandering.scoop.v1.models.InvalidArgumentError)
            2 -> error = ClientError.Error.MissingField(_fieldValue as ai.wandering.scoop.v1.models.MissingFieldError)
            3 -> error = ClientError.Error.RequestTooLarge(_fieldValue as ai.wandering.scoop.v1.models.RequestTooLargeError)
            4 -> error = ClientError.Error.Authentication(_fieldValue as ai.wandering.scoop.v1.models.AuthenticationError)
            5 -> error = ClientError.Error.Authorization(_fieldValue as ai.wandering.scoop.v1.models.AuthorizationError)
            6 -> error = ClientError.Error.QuotaExceeded(_fieldValue as ai.wandering.scoop.v1.models.QuotaExceededError)
            7 -> error = ClientError.Error.RateLimitExceeded(_fieldValue as ai.wandering.scoop.v1.models.RateLimitExceededError)
        }
    }

    return ClientError(error, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForInvalidArgumentError")
public fun InvalidArgumentError?.orDefault(): ai.wandering.scoop.v1.models.InvalidArgumentError = this ?: InvalidArgumentError.defaultInstance

private fun InvalidArgumentError.protoMergeImpl(plus: pbandk.Message?): InvalidArgumentError = (plus as? InvalidArgumentError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun InvalidArgumentError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): InvalidArgumentError {
    var message = ""
    var field = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> field = _fieldValue as String
        }
    }

    return InvalidArgumentError(message, field, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForMissingFieldError")
public fun MissingFieldError?.orDefault(): ai.wandering.scoop.v1.models.MissingFieldError = this ?: MissingFieldError.defaultInstance

private fun MissingFieldError.protoMergeImpl(plus: pbandk.Message?): MissingFieldError = (plus as? MissingFieldError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun MissingFieldError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MissingFieldError {
    var message = ""
    var field = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> field = _fieldValue as String
        }
    }

    return MissingFieldError(message, field, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRequestTooLargeError")
public fun RequestTooLargeError?.orDefault(): ai.wandering.scoop.v1.models.RequestTooLargeError = this ?: RequestTooLargeError.defaultInstance

private fun RequestTooLargeError.protoMergeImpl(plus: pbandk.Message?): RequestTooLargeError = (plus as? RequestTooLargeError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RequestTooLargeError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RequestTooLargeError {
    var message = ""
    var maxAllowedSize = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> maxAllowedSize = _fieldValue as Int
        }
    }

    return RequestTooLargeError(message, maxAllowedSize, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthenticationError")
public fun AuthenticationError?.orDefault(): ai.wandering.scoop.v1.models.AuthenticationError = this ?: AuthenticationError.defaultInstance

private fun AuthenticationError.protoMergeImpl(plus: pbandk.Message?): AuthenticationError = (plus as? AuthenticationError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthenticationError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthenticationError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return AuthenticationError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForAuthorizationError")
public fun AuthorizationError?.orDefault(): ai.wandering.scoop.v1.models.AuthorizationError = this ?: AuthorizationError.defaultInstance

private fun AuthorizationError.protoMergeImpl(plus: pbandk.Message?): AuthorizationError = (plus as? AuthorizationError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun AuthorizationError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): AuthorizationError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return AuthorizationError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForQuotaExceededError")
public fun QuotaExceededError?.orDefault(): ai.wandering.scoop.v1.models.QuotaExceededError = this ?: QuotaExceededError.defaultInstance

private fun QuotaExceededError.protoMergeImpl(plus: pbandk.Message?): QuotaExceededError = (plus as? QuotaExceededError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun QuotaExceededError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): QuotaExceededError {
    var message = ""
    var quotaType = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> quotaType = _fieldValue as String
        }
    }

    return QuotaExceededError(message, quotaType, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForRateLimitExceededError")
public fun RateLimitExceededError?.orDefault(): ai.wandering.scoop.v1.models.RateLimitExceededError = this ?: RateLimitExceededError.defaultInstance

private fun RateLimitExceededError.protoMergeImpl(plus: pbandk.Message?): RateLimitExceededError = (plus as? RateLimitExceededError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun RateLimitExceededError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): RateLimitExceededError {
    var message = ""
    var retryAfterSeconds = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> retryAfterSeconds = _fieldValue as Int
        }
    }

    return RateLimitExceededError(message, retryAfterSeconds, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServerError")
public fun ServerError?.orDefault(): ai.wandering.scoop.v1.models.ServerError = this ?: ServerError.defaultInstance

private fun ServerError.protoMergeImpl(plus: pbandk.Message?): ServerError = (plus as? ServerError)?.let {
    it.copy(
        error = when {
            error is ServerError.Error.Internal && plus.error is ServerError.Error.Internal ->
                ServerError.Error.Internal(error.value + plus.error.value)
            error is ServerError.Error.Database && plus.error is ServerError.Error.Database ->
                ServerError.Error.Database(error.value + plus.error.value)
            error is ServerError.Error.ServiceUnavailable && plus.error is ServerError.Error.ServiceUnavailable ->
                ServerError.Error.ServiceUnavailable(error.value + plus.error.value)
            error is ServerError.Error.Timeout && plus.error is ServerError.Error.Timeout ->
                ServerError.Error.Timeout(error.value + plus.error.value)
            error is ServerError.Error.DependencyFailure && plus.error is ServerError.Error.DependencyFailure ->
                ServerError.Error.DependencyFailure(error.value + plus.error.value)
            error is ServerError.Error.DataCorruption && plus.error is ServerError.Error.DataCorruption ->
                ServerError.Error.DataCorruption(error.value + plus.error.value)
            error is ServerError.Error.NotFound && plus.error is ServerError.Error.NotFound ->
                ServerError.Error.NotFound(error.value + plus.error.value)
            else ->
                plus.error ?: error
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServerError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServerError {
    var error: ServerError.Error<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = ServerError.Error.Internal(_fieldValue as ai.wandering.scoop.v1.models.InternalServerError)
            2 -> error = ServerError.Error.Database(_fieldValue as ai.wandering.scoop.v1.models.DatabaseError)
            3 -> error = ServerError.Error.ServiceUnavailable(_fieldValue as ai.wandering.scoop.v1.models.ServiceUnavailableError)
            4 -> error = ServerError.Error.Timeout(_fieldValue as ai.wandering.scoop.v1.models.TimeoutError)
            5 -> error = ServerError.Error.DependencyFailure(_fieldValue as ai.wandering.scoop.v1.models.DependencyFailureError)
            6 -> error = ServerError.Error.DataCorruption(_fieldValue as ai.wandering.scoop.v1.models.DataCorruptionError)
            7 -> error = ServerError.Error.NotFound(_fieldValue as ai.wandering.scoop.v1.models.NotFoundError)
        }
    }

    return ServerError(error, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForNotFoundError")
public fun NotFoundError?.orDefault(): ai.wandering.scoop.v1.models.NotFoundError = this ?: NotFoundError.defaultInstance

private fun NotFoundError.protoMergeImpl(plus: pbandk.Message?): NotFoundError = (plus as? NotFoundError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun NotFoundError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): NotFoundError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return NotFoundError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForInternalServerError")
public fun InternalServerError?.orDefault(): ai.wandering.scoop.v1.models.InternalServerError = this ?: InternalServerError.defaultInstance

private fun InternalServerError.protoMergeImpl(plus: pbandk.Message?): InternalServerError = (plus as? InternalServerError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun InternalServerError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): InternalServerError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return InternalServerError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDatabaseError")
public fun DatabaseError?.orDefault(): ai.wandering.scoop.v1.models.DatabaseError = this ?: DatabaseError.defaultInstance

private fun DatabaseError.protoMergeImpl(plus: pbandk.Message?): DatabaseError = (plus as? DatabaseError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DatabaseError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DatabaseError {
    var message = ""
    var operation = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> operation = _fieldValue as String
        }
    }

    return DatabaseError(message, operation, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForServiceUnavailableError")
public fun ServiceUnavailableError?.orDefault(): ai.wandering.scoop.v1.models.ServiceUnavailableError = this ?: ServiceUnavailableError.defaultInstance

private fun ServiceUnavailableError.protoMergeImpl(plus: pbandk.Message?): ServiceUnavailableError = (plus as? ServiceUnavailableError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun ServiceUnavailableError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): ServiceUnavailableError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return ServiceUnavailableError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForTimeoutError")
public fun TimeoutError?.orDefault(): ai.wandering.scoop.v1.models.TimeoutError = this ?: TimeoutError.defaultInstance

private fun TimeoutError.protoMergeImpl(plus: pbandk.Message?): TimeoutError = (plus as? TimeoutError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun TimeoutError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): TimeoutError {
    var message = ""
    var timeoutSeconds = 0

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> timeoutSeconds = _fieldValue as Int
        }
    }

    return TimeoutError(message, timeoutSeconds, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDependencyFailureError")
public fun DependencyFailureError?.orDefault(): ai.wandering.scoop.v1.models.DependencyFailureError = this ?: DependencyFailureError.defaultInstance

private fun DependencyFailureError.protoMergeImpl(plus: pbandk.Message?): DependencyFailureError = (plus as? DependencyFailureError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DependencyFailureError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DependencyFailureError {
    var message = ""
    var dependencyName = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
            2 -> dependencyName = _fieldValue as String
        }
    }

    return DependencyFailureError(message, dependencyName, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForDataCorruptionError")
public fun DataCorruptionError?.orDefault(): ai.wandering.scoop.v1.models.DataCorruptionError = this ?: DataCorruptionError.defaultInstance

private fun DataCorruptionError.protoMergeImpl(plus: pbandk.Message?): DataCorruptionError = (plus as? DataCorruptionError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun DataCorruptionError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): DataCorruptionError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return DataCorruptionError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUnknownError")
public fun UnknownError?.orDefault(): ai.wandering.scoop.v1.models.UnknownError = this ?: UnknownError.defaultInstance

private fun UnknownError.protoMergeImpl(plus: pbandk.Message?): UnknownError = (plus as? UnknownError)?.let {
    it.copy(
        error = when {
            error is UnknownError.Error.Unexpected && plus.error is UnknownError.Error.Unexpected ->
                UnknownError.Error.Unexpected(error.value + plus.error.value)
            error is UnknownError.Error.Undocumented && plus.error is UnknownError.Error.Undocumented ->
                UnknownError.Error.Undocumented(error.value + plus.error.value)
            else ->
                plus.error ?: error
        },
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UnknownError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UnknownError {
    var error: UnknownError.Error<*>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> error = UnknownError.Error.Unexpected(_fieldValue as ai.wandering.scoop.v1.models.UnexpectedError)
            2 -> error = UnknownError.Error.Undocumented(_fieldValue as ai.wandering.scoop.v1.models.UndocumentedError)
        }
    }

    return UnknownError(error, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUnexpectedError")
public fun UnexpectedError?.orDefault(): ai.wandering.scoop.v1.models.UnexpectedError = this ?: UnexpectedError.defaultInstance

private fun UnexpectedError.protoMergeImpl(plus: pbandk.Message?): UnexpectedError = (plus as? UnexpectedError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UnexpectedError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UnexpectedError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return UnexpectedError(message, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUndocumentedError")
public fun UndocumentedError?.orDefault(): ai.wandering.scoop.v1.models.UndocumentedError = this ?: UndocumentedError.defaultInstance

private fun UndocumentedError.protoMergeImpl(plus: pbandk.Message?): UndocumentedError = (plus as? UndocumentedError)?.let {
    it.copy(
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UndocumentedError.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UndocumentedError {
    var message = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> message = _fieldValue as String
        }
    }

    return UndocumentedError(message, unknownFields)
}
