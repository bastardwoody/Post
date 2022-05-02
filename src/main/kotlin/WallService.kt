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
                    id = 1234567890,
                    fromId = 123243,
                    createdBy = 3546,
                    text = "Good",
                    replyOwnerId = 2343,
                    replyPostId = 787,
                    friendsOnly = false,
                    postType = "Bad",
                    signerId = 79875,
                    canPin = true,
                    canDelete = false,
                    canEdit = false,
                    isPinned = false,
                    markedAsAds = false,
                    isFavorite = false,
                    postponedId = 2345465
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