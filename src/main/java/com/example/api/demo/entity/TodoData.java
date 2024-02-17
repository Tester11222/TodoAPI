package com.example.api.demo.entity;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Entityクラス
 * JSONPropertyを使うとJSON上では指定した任意のフィールド名にできるx
 */
@Data
public class TodoData {

    /* データID */
    @JsonProperty("id")
    private Integer id;

    /* 書き込み内容 */
    @JsonProperty("todo_context")
    private String todoContext;

    /* 投稿者 */
    @JsonProperty("post_user_name")
    private String postUserName;

    /* 作成日 */
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    /* 更新日 */
    @JsonProperty("update_at")
    private LocalDateTime updatedAt;
} 
