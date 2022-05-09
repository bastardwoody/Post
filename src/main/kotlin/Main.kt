import components.Comment
import components.Reasons

fun main() {
    val wallService = WallService()

    val post1 = Post()
    val post2 = Post()
    val post3 = Post()

    wallService.addPost(post1)
    wallService.addPost(post2)
    wallService.addPost(post3)

    val comment1 = Comment(postId = wallService.addPost(post1).id)
    val comment2 = Comment(postId = 2)
    val comment3 = Comment(postId = 3)

    wallService.createComment(comment1)
    wallService.createComment(comment2)
    wallService.createComment(comment3)

    wallService.complaint(comment1, Reasons.SPAM)
}