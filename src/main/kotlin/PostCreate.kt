fun main() {

    val post1 = Post()
    val post2 = Post()
    val post3 = Post()

    WallService.addPost(post1)
    WallService.addPost(post2)
    WallService.addPost(post3)

    WallService.updatePost(post3)

    WallService.showPosts()
}