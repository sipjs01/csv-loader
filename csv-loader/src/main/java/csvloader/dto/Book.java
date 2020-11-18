package csvloader.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private String title;
	private String author;
	private String genre;	
}
