object WallService {
    private var posts = emptyArray<Post>()

    fun addPost(post: Post): Post {
        posts += post
        return posts.last()
    }
}