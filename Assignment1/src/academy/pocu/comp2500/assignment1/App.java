package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        registry.registerBlogCreator("BlogHost");
        registry.registerTagFilterSetter("BlogHost", "getTagContents");
        registry.registerAuthorFilterSetter("BlogHost", "getBlogAuthorContents");
        registry.registerPostOrderSetter("BlogHost", "getSortContents");
        registry.registerPostListGetter("BlogHost", "getAllContents");
        registry.registerPostAdder("BlogHost", "addPost");
        registry.registerPostTitleUpdater("BlogHost", "setTitle");
        registry.registerPostBodyUpdater("BlogHost", "setBody");
        registry.registerPostTagAdder("BlogHost", "addTag");
        registry.registerCommentAdder("Content", "addComment");
        registry.registerSubcommentAdder("Comment", "addSubcomment");
        registry.registerCommentUpdater("Comment", "setComment");
        registry.registerSubcommentUpdater("Comment", "setComment");
        registry.registerReactionAdder("Content", "setReaction");
        registry.registerReactionRemover("Content", "removeReaction");
        registry.registerCommentUpvoter("Comment", "addLike");
        registry.registerCommentDownvoter("Comment", "addHate");
        registry.registerCommentListGetter("Content", "getSortedComments");
        registry.registerSubCommentListGetter("Comment", "getSortedSubcomments");
        registry.registerSubcommentUpvoter("Comment", "addLike");
        registry.registerSubcommentDownvoter("Comment", "addHate");
    }
}
