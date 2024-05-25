package com.fullhouse.matzip.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardUpdateRequest {
    @Schema(description = "제목")
    private String title;

    @Schema(description = "글 내용")
    private String contents;

    @Schema(description = "좋아요 개수")
    private int likes;

}
