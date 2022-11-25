package project.backend.traveljavaapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.backend.traveljavaapi.enumeration.TravelTypeEnum;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	
	private Long id;
	private String orderNumber;
	private BigDecimal amount;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private TravelTypeEnum type;
	
	public Travel(TravelTypeEnum type) {
		this.type = type;
	}
	
}
