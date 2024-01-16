@file:OptIn(pbandk.PublicForGeneratedCode::class)

package ai.wandering.scoop.v1.models

@pbandk.Export
public data class PopulatedUser(
    val user: ai.wandering.scoop.v1.models.User? = null,
    val assocs: ai.wandering.scoop.v1.models.UserAssocs? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.PopulatedUser = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedUser> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.PopulatedUser> {
        public val defaultInstance: ai.wandering.scoop.v1.models.PopulatedUser by lazy { ai.wandering.scoop.v1.models.PopulatedUser() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.PopulatedUser = ai.wandering.scoop.v1.models.PopulatedUser.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.PopulatedUser> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.PopulatedUser, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "user",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion),
                        jsonName = "user",
                        value = ai.wandering.scoop.v1.models.PopulatedUser::user
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "assocs",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UserAssocs.Companion),
                        jsonName = "assocs",
                        value = ai.wandering.scoop.v1.models.PopulatedUser::assocs
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.PopulatedUser",
                messageClass = ai.wandering.scoop.v1.models.PopulatedUser::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UserAssocs(
    val followings: ai.wandering.scoop.v1.models.UserFollowings? = null,
    val favorites: List<ai.wandering.scoop.v1.models.Story> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UserAssocs = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UserAssocs> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UserAssocs> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UserAssocs by lazy { ai.wandering.scoop.v1.models.UserAssocs() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UserAssocs = ai.wandering.scoop.v1.models.UserAssocs.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UserAssocs> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UserAssocs, *>>(2)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "followings",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.UserFollowings.Companion),
                        jsonName = "followings",
                        value = ai.wandering.scoop.v1.models.UserAssocs::followings
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "favorites",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Story>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Story.Companion)),
                        jsonName = "favorites",
                        value = ai.wandering.scoop.v1.models.UserAssocs::favorites
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UserAssocs",
                messageClass = ai.wandering.scoop.v1.models.UserAssocs::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
public data class UserFollowings(
    val tags: List<ai.wandering.scoop.v1.models.Tag> = emptyList(),
    val people: List<ai.wandering.scoop.v1.models.Person> = emptyList(),
    val companies: List<ai.wandering.scoop.v1.models.Company> = emptyList(),
    val industries: List<ai.wandering.scoop.v1.models.Industry> = emptyList(),
    val skills: List<ai.wandering.scoop.v1.models.Skill> = emptyList(),
    val locations: List<ai.wandering.scoop.v1.models.Location> = emptyList(),
    val authors: List<ai.wandering.scoop.v1.models.Author> = emptyList(),
    val publications: List<ai.wandering.scoop.v1.models.Publication> = emptyList(),
    val users: List<ai.wandering.scoop.v1.models.User> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?): ai.wandering.scoop.v1.models.UserFollowings = protoMergeImpl(other)
    override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UserFollowings> get() = Companion.descriptor
    override val protoSize: Int by lazy { super.protoSize }
    public companion object : pbandk.Message.Companion<ai.wandering.scoop.v1.models.UserFollowings> {
        public val defaultInstance: ai.wandering.scoop.v1.models.UserFollowings by lazy { ai.wandering.scoop.v1.models.UserFollowings() }
        override fun decodeWith(u: pbandk.MessageDecoder): ai.wandering.scoop.v1.models.UserFollowings = ai.wandering.scoop.v1.models.UserFollowings.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<ai.wandering.scoop.v1.models.UserFollowings> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<ai.wandering.scoop.v1.models.UserFollowings, *>>(9)
            fieldsList.apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "tags",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Tag>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Tag.Companion)),
                        jsonName = "tags",
                        value = ai.wandering.scoop.v1.models.UserFollowings::tags
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "people",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Person>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Person.Companion)),
                        jsonName = "people",
                        value = ai.wandering.scoop.v1.models.UserFollowings::people
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "companies",
                        number = 3,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Company>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Company.Companion)),
                        jsonName = "companies",
                        value = ai.wandering.scoop.v1.models.UserFollowings::companies
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "industries",
                        number = 4,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Industry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Industry.Companion)),
                        jsonName = "industries",
                        value = ai.wandering.scoop.v1.models.UserFollowings::industries
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "skills",
                        number = 5,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Skill>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Skill.Companion)),
                        jsonName = "skills",
                        value = ai.wandering.scoop.v1.models.UserFollowings::skills
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "locations",
                        number = 6,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Location>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Location.Companion)),
                        jsonName = "locations",
                        value = ai.wandering.scoop.v1.models.UserFollowings::locations
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "authors",
                        number = 7,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Author>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Author.Companion)),
                        jsonName = "authors",
                        value = ai.wandering.scoop.v1.models.UserFollowings::authors
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "publications",
                        number = 8,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.Publication>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.Publication.Companion)),
                        jsonName = "publications",
                        value = ai.wandering.scoop.v1.models.UserFollowings::publications
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "users",
                        number = 9,
                        type = pbandk.FieldDescriptor.Type.Repeated<ai.wandering.scoop.v1.models.User>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = ai.wandering.scoop.v1.models.User.Companion)),
                        jsonName = "users",
                        value = ai.wandering.scoop.v1.models.UserFollowings::users
                    )
                )
            }
            pbandk.MessageDescriptor(
                fullName = "ai.wandering.scoop.v1.models.UserFollowings",
                messageClass = ai.wandering.scoop.v1.models.UserFollowings::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

@pbandk.Export
@pbandk.JsName("orDefaultForPopulatedUser")
public fun PopulatedUser?.orDefault(): ai.wandering.scoop.v1.models.PopulatedUser = this ?: PopulatedUser.defaultInstance

private fun PopulatedUser.protoMergeImpl(plus: pbandk.Message?): PopulatedUser = (plus as? PopulatedUser)?.let {
    it.copy(
        user = user?.plus(plus.user) ?: plus.user,
        assocs = assocs?.plus(plus.assocs) ?: plus.assocs,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun PopulatedUser.Companion.decodeWithImpl(u: pbandk.MessageDecoder): PopulatedUser {
    var user: ai.wandering.scoop.v1.models.User? = null
    var assocs: ai.wandering.scoop.v1.models.UserAssocs? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> user = _fieldValue as ai.wandering.scoop.v1.models.User
            2 -> assocs = _fieldValue as ai.wandering.scoop.v1.models.UserAssocs
        }
    }

    return PopulatedUser(user, assocs, unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUserAssocs")
public fun UserAssocs?.orDefault(): ai.wandering.scoop.v1.models.UserAssocs = this ?: UserAssocs.defaultInstance

private fun UserAssocs.protoMergeImpl(plus: pbandk.Message?): UserAssocs = (plus as? UserAssocs)?.let {
    it.copy(
        followings = followings?.plus(plus.followings) ?: plus.followings,
        favorites = favorites + plus.favorites,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UserAssocs.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UserAssocs {
    var followings: ai.wandering.scoop.v1.models.UserFollowings? = null
    var favorites: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Story>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> followings = _fieldValue as ai.wandering.scoop.v1.models.UserFollowings
            2 -> favorites = (favorites ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Story> }
        }
    }

    return UserAssocs(followings, pbandk.ListWithSize.Builder.fixed(favorites), unknownFields)
}

@pbandk.Export
@pbandk.JsName("orDefaultForUserFollowings")
public fun UserFollowings?.orDefault(): ai.wandering.scoop.v1.models.UserFollowings = this ?: UserFollowings.defaultInstance

private fun UserFollowings.protoMergeImpl(plus: pbandk.Message?): UserFollowings = (plus as? UserFollowings)?.let {
    it.copy(
        tags = tags + plus.tags,
        people = people + plus.people,
        companies = companies + plus.companies,
        industries = industries + plus.industries,
        skills = skills + plus.skills,
        locations = locations + plus.locations,
        authors = authors + plus.authors,
        publications = publications + plus.publications,
        users = users + plus.users,
        unknownFields = unknownFields + plus.unknownFields
    )
} ?: this

@Suppress("UNCHECKED_CAST")
private fun UserFollowings.Companion.decodeWithImpl(u: pbandk.MessageDecoder): UserFollowings {
    var tags: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Tag>? = null
    var people: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Person>? = null
    var companies: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Company>? = null
    var industries: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Industry>? = null
    var skills: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Skill>? = null
    var locations: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Location>? = null
    var authors: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Author>? = null
    var publications: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.Publication>? = null
    var users: pbandk.ListWithSize.Builder<ai.wandering.scoop.v1.models.User>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> tags = (tags ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Tag> }
            2 -> people = (people ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Person> }
            3 -> companies = (companies ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Company> }
            4 -> industries = (industries ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Industry> }
            5 -> skills = (skills ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Skill> }
            6 -> locations = (locations ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Location> }
            7 -> authors = (authors ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Author> }
            8 -> publications = (publications ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.Publication> }
            9 -> users = (users ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as kotlin.sequences.Sequence<ai.wandering.scoop.v1.models.User> }
        }
    }

    return UserFollowings(pbandk.ListWithSize.Builder.fixed(tags), pbandk.ListWithSize.Builder.fixed(people), pbandk.ListWithSize.Builder.fixed(companies), pbandk.ListWithSize.Builder.fixed(industries),
        pbandk.ListWithSize.Builder.fixed(skills), pbandk.ListWithSize.Builder.fixed(locations), pbandk.ListWithSize.Builder.fixed(authors), pbandk.ListWithSize.Builder.fixed(publications),
        pbandk.ListWithSize.Builder.fixed(users), unknownFields)
}
