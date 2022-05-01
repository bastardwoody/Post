import java.util.*

object WallService {
    private var posts = emptyArray<Post>()

    fun addPost(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun updatePost(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(
                    id = UUID.randomUUID(),
                    fromId = 13,
                    createdBy = 14,
                    text = "Bay",
                    replyOwnerId = 15,
                    replyPostId = 16,
                    friendsOnly = false,
                    postType = "Go",
                    signerId = 17,
                    canPin = true,
                    canDelete = false,
                    canEdit = false,
                    isPinned = false,
                    markedAsAds = false,
                    isFavorite = false,
                    postponedId = 18
                )
                addPost(post)
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