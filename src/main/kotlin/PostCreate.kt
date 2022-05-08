fun main() {

    val wallService = WallService()

    val post1 = Post()
    val post2 = Post()
    val post3 = Post()

    wallService.addPost(post1)
    wallService.addPost(post2)
    wallService.addPost(post3)

    wallService.showPosts()
    println()

    wallService.updatePost(post1)

    wallService.showPosts()
}