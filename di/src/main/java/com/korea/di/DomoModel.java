package com.korea.di;

import lombok.NonNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class DomoModel {
	
	@NonNull
	String idString;

}
