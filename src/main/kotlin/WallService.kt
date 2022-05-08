class WallService {
    private var posts = emptyArray<Post>()

    fun addPost(post: Post): Post {
        post.id = kotlin.math.abs(post.hashCode())
        posts += post
        return posts.last()
    }

    fun updatePost(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(
                    id = 1,
                    ownerId = 384,
                    fromId = 243,
                    createdBy = 346,
                    date = 1739,
                    text = "Good",
                    replyOwnerId = 243,
                    replyPostId = 707,
                    friendsOnly = false,
                    comments = Comments(
                        93,
                        true,
                        true,
                        true,
                        false
                    ),
                    copyright = Copyright(
                        98,
                        "https://netology.ru/",
                        "Нетология",
                        "XZ"
                    ),
                    likes = Likes(
                        83,
                        true,
                        true,
                        true
                    ),
                    reposts = Reposts(
                        21,
                        false
                    ),
                    views = Views(
                        47
                    ),
                    postType = "Bad",
                    postSource = PostSource(),
                    attachments = emptyArray(),
                    geo = Geo(
                        type = "GPS",
                        coordinates = "76.78757, 34.35790",
                        place = Geo.Place()
                    ),
                    signerId = 75,
                    copyHistory = emptyArray(),
                    canPin = true,
                    canDelete = false,
                    canEdit = false,
                    isPinned = false,
                    markedAsAds = false,
                    isFavorite = false,
                    donut = Donut(
                        isDonut = true,
                        paidDuration = 432,
                        placeHolder = Any(),
                        canPublishFreeCopy = true,
                        editMode = "duration",
                    ),
                    postponedId = 2465
                )
                return true
            }
        }
        return false
    }

    // ПОКАЗ ВСЕХ ПОСТОВ
    fun showPosts() {
        for ((index) in posts.withIndex()) {
            println(posts[index])
        }
    }
}