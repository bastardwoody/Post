import components.*
import exceptions.ComplaintException
import exceptions.PostNotFoundException

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var reports = emptyArray<ReportComment>()

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
                        count = 93,
                        canPost = false,
                        groupsCanPost = true,
                        canClose = true,
                        canOpen = true,
                    ),
                    copyright = Copyright(
                        id = 98,
                        link = "https://netology.ru/",
                        name = "",
                        type = "XZ"
                    ),
                    likes = Likes(
                        count = 83,
                        userLikes = true,
                        canLike = false,
                        canPublish = true,
                    ),
                    reposts = Reposts(
                        count = 21,
                        userReposted = true,
                    ),
                    views = Views(
                        count = 47
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

    fun createComment(comment: Comment): Comment {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == comment.postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Пост ${comment.postId} не найден")
    }

    fun complaint(comment: Comment, reason: Reasons): ReportComment {
        for ((index) in comments.withIndex()) {
            if (comments[index].postId == comment.postId) {
                reports += ReportComment(
                    comment.ownerId,
                    comment.postId,
                    reason
                )
                return reports.last()
            }
        }
        throw ComplaintException("Комментарий не найден")
    }
}