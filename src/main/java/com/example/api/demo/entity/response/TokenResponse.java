package com.example.api.demo.entity.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * アクセストークンレスポンス
 */
@Data
public class TokenResponse {
 
    /* アクセストークン */
    @JsonProperty("access_token")
    private String accessToken;

    /* トークン作成日時 */
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    /* トークン期限切れ日時 */
    @JsonProperty("expired_at")
    private LocalDateTime expiredAt;
}
