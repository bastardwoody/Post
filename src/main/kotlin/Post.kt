data class Post(
    var id: Int? = null,
    val ownerId: Int = (0..99).random(),
    val fromId: Int = (0..99).random(),
    val createdBy: Int = (0..99).random(),
    val date: Int = (0..99).random(),
    val text: String = listOf("Hello", "Bay", "Whats up").random(),
    val replyOwnerId: Int = (0..99).random(),
    val replyPostId: Int = (0..99).random(),
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(
        count = (0..99).random(),
        canPost = true,
        groupsCanPost = true,
        canClose = true,
        canOpen = true,
    ),
    val copyright: Copyright = Copyright(
        id = (0..99).random(),
        link = "https://netology.ru/",
        name = "NONAME",
        type = "site",
    ),
    val likes: Likes? = listOf(null, Likes(
        4,
        true,
        false,
        false)
    ).random(),
    val reposts: Reposts = Reposts(
        count = (0..99).random(),
        userReposted = true,
    ),
    val views: Views? = listOf(null, Views(
        (0..99).random())
    ).random(),
    val postType: String = listOf("Good", "Bad", "Ugly").random(),
    val postSource: PostSource = PostSource(),
    var attachments: Array<Attachments> = emptyArray(),
    val geo: Geo = Geo(
        type = "GPS",
        coordinates = "76.78757, 34.35790",
        place = Geo.Place()
    ),
    val signerId: Int = (0..99).random(),
    var copyHistory: Array<Attachments> = emptyArray(),
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut = Donut(
        isDonut = true,
        paidDuration = (0..99).random(),
        placeHolder = Any(),
        canPublishFreeCopy = true,
        editMode = listOf("all", "duration").random(),
    ),
    val postponedId: Int = (0..99).random(),
)