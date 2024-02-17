package com.example.api.demo.entity.response;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/*
 * リクエストプロパティ
 */
@Data
public class TodoResponseBody {

    @JsonProperty("status")
    private int code;

    /* レスポンスメッセージ */
    @JsonProperty("message")
    private String message;

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
