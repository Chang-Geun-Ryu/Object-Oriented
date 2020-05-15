package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        // registry.registerPostAdder("Foo", "bar");

        registry.registerBlogCreator("BlogHost");
        registry.registerTagFilterSetter("BlogVisitor", "getTagContents");
        registry.registerAuthorFilterSetter("BlogHost", "getBlogAuthorContents");
        registry.registerPostOrderSetter("BlogHost", "getSortContents");
        registry.registerPostListGetter("BlogHost", "getAllContents");
        registry.registerPostAdder("BlogAuthor", "addPost");
        registry.registerPostTitleUpdater("BlogAuthor", "setTitle");
        registry.registerPostBodyUpdater("BlogAuthor", "setArticle");
        registry.registerPostTagAdder("BlogAuthor", "addTag");
        registry.registerCommentAdder("BlogVisitor", "addComment");
        registry.registerSubcommentAdder("BlogVisitor", "addSubComment");
        registry.registerCommentUpdater("BlogVisitor", "modifyComment");
        registry.registerSubcommentUpdater("BlogVisitor", "modifySubcomment");
        registry.registerReactionAdder("BlogVisitor", "setReactionPost");
        registry.registerReactionRemover("BlogVisitor", "removeReactionPost");
        registry.registerCommentUpvoter("BlogVisitor", "upvote");
        registry.registerCommentDownvoter("BlogVisitor", "doownvote");
        registry.registerCommentListGetter("BlogVisitor", "readComments");
        registry.registerSubCommentListGetter("BlogVisitor", "readSubcomments");
        registry.registerSubcommentUpvoter("BlogVisitor", "upvote");
        registry.registerSubcommentDownvoter("BlogVisitor", "doownvote");
    }
}
