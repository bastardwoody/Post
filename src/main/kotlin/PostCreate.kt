fun main() {

    val q = WallService()

    val post1 = Post(111)
    val post2 = Post(222)
    val post3 = Post(333)

    q.addPost(post1)
    q.addPost(post2)
    q.addPost(post3)

    q.showPosts()
    println()

    q.updatePost(post3)

    q.showPosts()
}