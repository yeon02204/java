package com.korea.layer.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO <T>{
	private String error;
	// TodoDTO뿐만 아니라 이후에 다른 모델의 DTOeh ResponseDTO를 이용해 반환할 수 있도록
	// 제네릭 타입을 사용했다
	private List<T> data;
	
	
}
