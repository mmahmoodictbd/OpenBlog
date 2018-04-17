package com.unloadbrain.blog.helper;

import com.unloadbrain.blog.domain.model.Category;
import com.unloadbrain.blog.domain.model.Post;
import com.unloadbrain.blog.domain.model.PostStatus;
import com.unloadbrain.blog.domain.model.Tag;
import com.unloadbrain.blog.dto.PostDTO;
import org.mockito.internal.util.collections.Sets;

import java.util.Collections;

public class ObjectFactory {

    public static Post createDraftPost() {

        Post post = createPost();
        post.setStatus(PostStatus.DRAFT);
        return post;
    }

    private static Post createPost() {

        Post post = new Post();
        post.setId(1L);
        post.setTitle("SamplePost");
        post.setContent("Hello world!");
        post.setCategories(Collections.singleton(createProgrammingCategory()));
        post.setTags(Sets.newSet(createJavaTag(), createSpringTag()));
        post.setPermalink("sample-post");

        return post;
    }

    private static Category createProgrammingCategory() {

        Category category = new Category();
        category.setName("Programming");
        category.setSlug("programming");

        return category;
    }

    private static Tag createSpringTag() {

        Tag tag = new Tag();
        tag.setName("Spring");
        tag.setSlug("spring");

        return tag;
    }

    private static Tag createJavaTag() {

        Tag tag = new Tag();
        tag.setName("Java");
        tag.setSlug("java");

        return tag;
    }

    public static PostDTO createDraftPostDTO() {

        PostDTO postDTO = new PostDTO();
        postDTO.setId(1L);
        postDTO.setTitle("SamplePost");
        postDTO.setContent("Hello world!");
        postDTO.setCategories("Programming");
        postDTO.setTags("Java,Spring");
        postDTO.setStatus("DRAFT");
        postDTO.setPermalink("sample-post");
        postDTO.setAction("PUBLISH");

        return postDTO;
    }


}