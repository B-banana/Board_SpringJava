package kr.co.soft.beans;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContentBean {
	
	private int content_inx;
	
	@NotBlank //NotNull과 같음
	private String content_subject;
	
	@NotBlank
	private String content_text;
	
	private String content_file;
	
	private int content_writer_idx;
	
	private int content_board_idx;
	
	private String content_date;

}
