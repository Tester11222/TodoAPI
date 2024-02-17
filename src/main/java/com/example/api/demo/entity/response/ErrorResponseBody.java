package com.example.api.demo.entity.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


/**
 * エラーレスポンスクラス
 * ここをカスタムすれば
 * 任意の形式のレスポンスを作成できる
 */
@Data
public class ErrorResponseBody {
    /* エラー発生時間 */
    @JsonProperty("timestamp")
    private LocalDateTime exceptionOccurrenceTime;

    /* HTTP ERROR CODE */
    @JsonProperty("status")
    private int status;

    /* Http エラーメッセージ */
    @JsonProperty("error")
    private String error;

    /* 例外概要 */
    @JsonProperty("message")
    private String message;

    /* リクエストURL */
    @JsonProperty("path")
    private String path;

    /* エラー発生時間 */
    @JsonProperty("error_detail")
    private String errorDetail;
}
